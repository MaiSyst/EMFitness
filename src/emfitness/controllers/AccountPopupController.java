/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.controllers;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.maisyst.fetch.MaiFetch;
import com.maisyst.fetch.utils.Authorization;
import emfitness.components.AccountPopup;
import emfitness.screens.Login;
import emfitness.utilities.API;
import emfitness.utilities.Constants;
import emfitness.utilities.Database;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author maisyst
 */
public class AccountPopupController {
    private final AccountPopup accountPopup;
    private final JFrame parent;
    private final MaiFetch fetch;
   
    public AccountPopupController(JFrame parent,String token,String username,Point point){
        this.parent=parent;
        this.fetch=API.fetch(new Authorization(token));
        this.accountPopup=new AccountPopup(parent, true);
        point.y=parent.getY()+accountPopup.getHeight()/2;
        point.x=parent.getX()+parent.getWidth()-accountPopup.getWidth();
        accountPopup.setLocation(point);
        accountPopup.getSignOut().setIcon(new FlatSVGIcon(Constants.ICONS_PATH+"signOut.svg"));
        accountPopup.getChangePassword().setIcon(new FlatSVGIcon(Constants.ICONS_PATH+"changePassword.svg"));
        accountPopup.getSignOut().addActionListener(l->signOut());
        accountPopup.getChangePassword().addActionListener(l->onChangePassword(username));
        parent.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                System.out.println(e);
            }
            
        
        });
    }
    private void signOut() {
        accountPopup.dispose();
        var options = JOptionPane.showConfirmDialog(null, "Etes-vous sure de connecter?", "Deconnection", JOptionPane.OK_CANCEL_OPTION);
        if (options == JOptionPane.OK_OPTION) {
            try {
                var stmt = Database.getInstance().createStatement();
                stmt.execute("DELETE FROM auth");
                new Login().setVisible(true);
                parent.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(AccountPopupController.class.getName(),ex.getMessage());
            }
        }
    }
    private void onChangePassword(String username){
        accountPopup.dispose();
        new ChangePasswordUserController(parent, fetch, username).show();
    }
    public void show(){
        accountPopup.setVisible(true);
    }
    public void dispose(){
        accountPopup.dispose();
    }
}
