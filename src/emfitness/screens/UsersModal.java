/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emfitness.screens;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import emfitness.models.RoomWithSubscribeModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author orion90
 */
public class UsersModal extends javax.swing.JDialog {

    /**
     * Creates new form ActivityModal
     */
    private final String flatStyle = FlatClientProperties.STYLE;

    public UsersModal() {
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 15));
        FlatMacLightLaf.registerCustomDefaultsSource("emfitness.properties");
        FlatMacLightLaf.setup();
        this.setBackground(null);
        this.setUndecorated(true);
        initComponents();
       
        btnAdded.putClientProperty(flatStyle, "background:@accentColor;foreground:#ffffff");
        btnAdded.setIcon(new FlatSVGIcon("emfitness/icons/plus.svg"));
        container.putClientProperty(flatStyle, "arc:20;background:#fff");
        btnClose.setIcon(new FlatSVGIcon("emfitness/icons/close.svg"));
        btnClose.putClientProperty(flatStyle, "buttonType:roundRect;borderColor:#fff");
        password.putClientProperty(flatStyle, "showRevealButton:true");
        confPassword.putClientProperty(flatStyle, "showRevealButton:true");
        
    }

    public JButton getBtnAdded() {
        return btnAdded;
    }

    public void setBtnAdded(JButton btnAdded) {
        this.btnAdded = btnAdded;
    }

    public JButton getBtnClose() {
        return btnClose;
    }

    public void setBtnClose(JButton btnClose) {
        this.btnClose = btnClose;
    }

    public JTextField getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(JTextField datePicker) {
        this.datePicker = datePicker;
    }

    public JTextField getTxtAddress() {
        return txtAddress;
    }

    public void setTxtAddress(JTextField txtAddress) {
        this.txtAddress = txtAddress;
    }

    public JTextField getTxtFirstname() {
        return txtFirstname;
    }

    public void setTxtFirstname(JTextField txtFirstname) {
        this.txtFirstname = txtFirstname;
    }

    public JTextField getTxtLastname() {
        return txtLastname;
    }

    public void setTxtLastname(JTextField txtLastname) {
        this.txtLastname = txtLastname;
    }

    public JComboBox<RoomWithSubscribeModel> getComboxRoomModel() {
        return comboxRoomModel;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }

    public JPasswordField getPassword() {
        return password;
    }

    public JPasswordField getConfPassword() {
        return confPassword;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        container = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        center = new javax.swing.JPanel();
        firstnameContainer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        lastnameContainer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        birthDateContainer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        datePicker = new javax.swing.JTextField();
        addressContainer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        phoneContainer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        passwordContainer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        passwordContainer1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        confPassword = new javax.swing.JPasswordField();
        roomContainer = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        comboxRoomModel = new javax.swing.JComboBox<>();
        footer = new javax.swing.JPanel();
        btnAdded = new javax.swing.JButton();

        dateChooser1.setForeground(new java.awt.Color(0, 198, 45));
        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(datePicker);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(445, 801));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        container.setMaximumSize(new java.awt.Dimension(400, 620));
        container.setMinimumSize(new java.awt.Dimension(400, 620));
        container.setPreferredSize(new java.awt.Dimension(380, 620));
        container.setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(220, 220, 220));
        header.setOpaque(false);
        header.setPreferredSize(new java.awt.Dimension(600, 60));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ajouter un Gérant");

        btnClose.setContentAreaFilled(false);
        btnClose.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        container.add(header, java.awt.BorderLayout.PAGE_START);

        center.setBackground(new java.awt.Color(221, 221, 221));
        center.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        center.setMaximumSize(new java.awt.Dimension(400, 620));
        center.setMinimumSize(new java.awt.Dimension(400, 620));
        center.setOpaque(false);
        center.setPreferredSize(new java.awt.Dimension(380, 620));
        center.setLayout(new java.awt.GridLayout(8, 0));

        firstnameContainer.setBackground(new java.awt.Color(255, 255, 255));
        firstnameContainer.setMaximumSize(new java.awt.Dimension(400, 146));
        firstnameContainer.setMinimumSize(new java.awt.Dimension(400, 146));
        firstnameContainer.setName(""); // NOI18N
        firstnameContainer.setOpaque(false);
        firstnameContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Prenom");

        javax.swing.GroupLayout firstnameContainerLayout = new javax.swing.GroupLayout(firstnameContainer);
        firstnameContainer.setLayout(firstnameContainerLayout);
        firstnameContainerLayout.setHorizontalGroup(
            firstnameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstnameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 307, Short.MAX_VALUE))
            .addComponent(txtFirstname)
        );
        firstnameContainerLayout.setVerticalGroup(
            firstnameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstnameContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        center.add(firstnameContainer);

        lastnameContainer.setBackground(new java.awt.Color(255, 255, 255));
        lastnameContainer.setMaximumSize(new java.awt.Dimension(400, 146));
        lastnameContainer.setMinimumSize(new java.awt.Dimension(400, 146));
        lastnameContainer.setName(""); // NOI18N
        lastnameContainer.setOpaque(false);
        lastnameContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nom");

        javax.swing.GroupLayout lastnameContainerLayout = new javax.swing.GroupLayout(lastnameContainer);
        lastnameContainer.setLayout(lastnameContainerLayout);
        lastnameContainerLayout.setHorizontalGroup(
            lastnameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastnameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
            .addComponent(txtLastname)
        );
        lastnameContainerLayout.setVerticalGroup(
            lastnameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastnameContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        center.add(lastnameContainer);

        birthDateContainer.setBackground(new java.awt.Color(255, 255, 255));
        birthDateContainer.setMaximumSize(new java.awt.Dimension(400, 146));
        birthDateContainer.setMinimumSize(new java.awt.Dimension(400, 146));
        birthDateContainer.setName(""); // NOI18N
        birthDateContainer.setOpaque(false);
        birthDateContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Date de naissance");

        javax.swing.GroupLayout birthDateContainerLayout = new javax.swing.GroupLayout(birthDateContainer);
        birthDateContainer.setLayout(birthDateContainerLayout);
        birthDateContainerLayout.setHorizontalGroup(
            birthDateContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birthDateContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(196, 230, Short.MAX_VALUE))
            .addComponent(datePicker)
        );
        birthDateContainerLayout.setVerticalGroup(
            birthDateContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birthDateContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        center.add(birthDateContainer);

        addressContainer.setBackground(new java.awt.Color(255, 255, 255));
        addressContainer.setMaximumSize(new java.awt.Dimension(400, 146));
        addressContainer.setMinimumSize(new java.awt.Dimension(400, 146));
        addressContainer.setName(""); // NOI18N
        addressContainer.setOpaque(false);
        addressContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Adresse");

        javax.swing.GroupLayout addressContainerLayout = new javax.swing.GroupLayout(addressContainer);
        addressContainer.setLayout(addressContainerLayout);
        addressContainerLayout.setHorizontalGroup(
            addressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
            .addGroup(addressContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addressContainerLayout.setVerticalGroup(
            addressContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressContainerLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, 0)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        center.add(addressContainer);

        phoneContainer.setBackground(new java.awt.Color(255, 255, 255));
        phoneContainer.setMaximumSize(new java.awt.Dimension(400, 146));
        phoneContainer.setMinimumSize(new java.awt.Dimension(400, 146));
        phoneContainer.setOpaque(false);
        phoneContainer.setPreferredSize(new java.awt.Dimension(350, 90));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Phone");

        javax.swing.GroupLayout phoneContainerLayout = new javax.swing.GroupLayout(phoneContainer);
        phoneContainer.setLayout(phoneContainerLayout);
        phoneContainerLayout.setHorizontalGroup(
            phoneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(phoneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        phoneContainerLayout.setVerticalGroup(
            phoneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneContainerLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        center.add(phoneContainer);

        passwordContainer.setBackground(new java.awt.Color(255, 255, 255));
        passwordContainer.setMaximumSize(new java.awt.Dimension(400, 146));
        passwordContainer.setMinimumSize(new java.awt.Dimension(400, 146));
        passwordContainer.setOpaque(false);
        passwordContainer.setPreferredSize(new java.awt.Dimension(350, 90));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Mot de passe");

        javax.swing.GroupLayout passwordContainerLayout = new javax.swing.GroupLayout(passwordContainer);
        passwordContainer.setLayout(passwordContainerLayout);
        passwordContainerLayout.setHorizontalGroup(
            passwordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(passwordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(passwordContainerLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(44, 44, 44))
        );
        passwordContainerLayout.setVerticalGroup(
            passwordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        center.add(passwordContainer);

        passwordContainer1.setBackground(new java.awt.Color(255, 255, 255));
        passwordContainer1.setMaximumSize(new java.awt.Dimension(400, 146));
        passwordContainer1.setMinimumSize(new java.awt.Dimension(400, 146));
        passwordContainer1.setOpaque(false);
        passwordContainer1.setPreferredSize(new java.awt.Dimension(350, 90));

        jLabel10.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Confirme mot de passe");

        javax.swing.GroupLayout passwordContainer1Layout = new javax.swing.GroupLayout(passwordContainer1);
        passwordContainer1.setLayout(passwordContainer1Layout);
        passwordContainer1Layout.setHorizontalGroup(
            passwordContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordContainer1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(passwordContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordContainer1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(passwordContainer1Layout.createSequentialGroup()
                        .addComponent(confPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
        );
        passwordContainer1Layout.setVerticalGroup(
            passwordContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordContainer1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addComponent(confPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        center.add(passwordContainer1);

        roomContainer.setBackground(new java.awt.Color(255, 255, 255));
        roomContainer.setMaximumSize(new java.awt.Dimension(400, 146));
        roomContainer.setMinimumSize(new java.awt.Dimension(400, 146));
        roomContainer.setOpaque(false);
        roomContainer.setPreferredSize(new java.awt.Dimension(350, 90));

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Salle");

        comboxRoomModel.setPreferredSize(new java.awt.Dimension(95, 50));

        javax.swing.GroupLayout roomContainerLayout = new javax.swing.GroupLayout(roomContainer);
        roomContainer.setLayout(roomContainerLayout);
        roomContainerLayout.setHorizontalGroup(
            roomContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboxRoomModel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(roomContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roomContainerLayout.setVerticalGroup(
            roomContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel9)
                .addGap(0, 0, 0)
                .addComponent(comboxRoomModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        center.add(roomContainer);

        container.add(center, java.awt.BorderLayout.CENTER);

        footer.setBackground(new java.awt.Color(221, 221, 221));
        footer.setOpaque(false);
        footer.setPreferredSize(new java.awt.Dimension(396, 60));

        btnAdded.setText("Ajouter");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnAdded, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        container.add(footer, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addressContainer;
    private javax.swing.JPanel birthDateContainer;
    private javax.swing.JButton btnAdded;
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel center;
    private javax.swing.JComboBox<RoomWithSubscribeModel> comboxRoomModel;
    private javax.swing.JPasswordField confPassword;
    private javax.swing.JPanel container;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JTextField datePicker;
    private javax.swing.JPanel firstnameContainer;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel lastnameContainer;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel passwordContainer;
    private javax.swing.JPanel passwordContainer1;
    private javax.swing.JPanel phoneContainer;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JPanel roomContainer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    // End of variables declaration//GEN-END:variables
}
