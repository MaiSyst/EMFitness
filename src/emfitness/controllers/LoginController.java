/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.controllers;

import com.google.gson.Gson;
import com.maisyst.fetch.exceptions.MaiException;
import com.maisyst.fetch.utils.enums.ResponseStatusCode;
import emfitness.models.AuthResponse;
import emfitness.screens.Dashboard;
import emfitness.screens.PublicDashboard;
import emfitness.utilities.API;
import emfitness.utilities.Database;
import static emfitness.utilities.MaiUtils.getTextPassword;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import raven.toast.Notifications;

/**
 *
 * @author orion90
 */
public class LoginController {

    private JTextField username;
    private JPasswordField password;
    private JButton signInButton;
    private JFrame parent;
    private JLabel msgInputText;
    private JLabel msgInputPwd;
    private JPanel loader;
    private JCheckBox checkBoxStayConnected;
    private final Gson gson = new Gson();
    private boolean isStayConnected = false;

    public LoginController(JFrame parent, JTextField username,
            JPasswordField password, JButton signInButton,
            JLabel msgInputText, JLabel msgInputPwd, JPanel loader, JCheckBox checkBoxStayConnected) {
        this.password = password;
        this.username = username;
        this.signInButton = signInButton;
        this.parent = parent;
        this.msgInputPwd = msgInputPwd;
        this.msgInputText = msgInputText;
        this.loader = loader;
        this.checkBoxStayConnected = checkBoxStayConnected;
        loader.setVisible(false);
        this.signInButton.addActionListener(l -> onHandleSignIn());
        this.password.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                if(e.getKeyCode()==10){
                    onHandleSignIn();
                    
                }
                
            }
            
        });
        Notifications.getInstance().setJFrame(parent);

        checkBoxStayConnected.addItemListener(l -> {
            isStayConnected = l.getStateChange() == ItemEvent.SELECTED;
        });
    }

    private void onHandleSignIn() {
        if (!isEmptyField()) {

            try {

                loader.setVisible(true);
                Map<String, Object> body = new HashMap<>();
                body.put("username", username.getText());
                body.put("password", getTextPassword(password));
                this.signInButton.setEnabled(false);
                API.fetch().post("/auth/signIn", body).then((result, status) -> {

                    if (status == ResponseStatusCode.OK) {
                        AuthResponse auth = gson.fromJson(result, AuthResponse.class);
                        if (isStayConnected) {
                            try {
                                var query = "INSERT INTO auth(username,authToken,role,roomId) VALUES(?,?,?,?)";
                                var pstmt = Database.getInstance().prepareStatement(query);
                                pstmt.setString(1, auth.username());
                                pstmt.setString(2, auth.token());
                                pstmt.setString(3, auth.role());
                                pstmt.setString(4, auth.roomId());
                                pstmt.execute();

                            } catch (SQLException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                        new Timer().schedule(new TimerTask() {
                            @Override
                            public void run() {
                                loader.setVisible(false);
                                parent.dispose();
                                if (auth.role().toLowerCase().equals("admin")) {
                                    new Dashboard(auth).setVisible(true);
                                } else {
                                    new PublicDashboard(auth).setVisible(true);
                                }
                            }
                        }, 1500L);
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, 1200, "Initialisation...");
                    } else {
                        this.signInButton.setEnabled(true);
                        if (status == ResponseStatusCode.NOT_FOUND) {
                            Notifications.getInstance().show(Notifications.Type.ERROR, 3000, "Votre nom d'utilisateur ou mot de passe est incorrect.");
                        }else{
                        Notifications.getInstance().show(Notifications.Type.ERROR, 3000, "Access interdit");

                        }
                        loader.setVisible(false);
                    }
                });

            } catch (MaiException e) {
                Notifications.getInstance().show(Notifications.Type.ERROR, 3000, "Serveur n'est pas disponible.");
                loader.setVisible(false);
                this.signInButton.setEnabled(false);
            }

        }
    }

    private boolean isEmptyField() {
        if (username.getText().isBlank() || getTextPassword(password).isBlank()) {
            if (username.getText().isBlank()) {
                msgInputText.setText("S'il vous plait,entrer votre nom d'utilisateur");
            } else {
                msgInputText.setText("");
            }
            if (getTextPassword(password).isBlank()) {
                msgInputPwd.setText("S'il vous plait,entrer votre mot de passe");
            } else {
                msgInputPwd.setText("");
            }
            return true;
        } else {
            msgInputText.setText("");
            msgInputPwd.setText("");
            return false;
        }
    }
}
