/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emfitness.screens;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import emfitness.models.ActivityModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author orion90
 */
public class CoachModal extends javax.swing.JDialog {

    /**
     * Creates new form ActivityModal
     */
    private final String styleCard = "arc:20;";
    private final String flatStyle = FlatClientProperties.STYLE;

    public CoachModal() {
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 15));
        FlatMacLightLaf.registerCustomDefaultsSource("emfitness.properties");
        FlatMacLightLaf.setup();
        this.setBackground(null);
        this.setUndecorated(true);
        initComponents();
       
        btnAdded.putClientProperty(flatStyle, "arc:20;background:@accentColor;foreground:#ffffff");
        btnAdded.setIcon(new FlatSVGIcon("emfitness/icons/plus.svg"));
        container.putClientProperty(flatStyle, "arc:20;background:#fff");
        btnClose.setIcon(new FlatSVGIcon("emfitness/icons/close.svg"));
        btnClose.putClientProperty(flatStyle, "buttonType:roundRect;borderColor:#fff");
        
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

    public JComboBox<ActivityModel> getComboxActivity() {
        return comboxActivity;
    }

    public void setComboxActivity(JComboBox<ActivityModel> comboxActivity) {
        this.comboxActivity = comboxActivity;
    }

    public JTextField getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(JTextField phone) {
        this.phoneNumber = phone;
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

 
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        firstnameContainer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        lastnameContainer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        phoneContainer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        addressContainer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        activityContainer = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboxActivity = new javax.swing.JComboBox<>();
        footer = new javax.swing.JPanel();
        btnAdded = new javax.swing.JButton();

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
        header.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        btnClose.setContentAreaFilled(false);
        btnClose.setMaximumSize(new java.awt.Dimension(30, 30));
        btnClose.setMinimumSize(new java.awt.Dimension(30, 30));
        btnClose.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        header.add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entraineur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        header.add(jPanel2, java.awt.BorderLayout.CENTER);

        container.add(header, java.awt.BorderLayout.PAGE_START);

        center.setBackground(new java.awt.Color(221, 221, 221));
        center.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        center.setMaximumSize(new java.awt.Dimension(400, 620));
        center.setMinimumSize(new java.awt.Dimension(400, 620));
        center.setOpaque(false);
        center.setPreferredSize(new java.awt.Dimension(380, 620));
        center.setLayout(new java.awt.GridLayout(6, 0));

        firstnameContainer.setBackground(new java.awt.Color(255, 255, 255));
        firstnameContainer.setMaximumSize(new java.awt.Dimension(350, 80));
        firstnameContainer.setMinimumSize(new java.awt.Dimension(350, 80));
        firstnameContainer.setName(""); // NOI18N
        firstnameContainer.setOpaque(false);
        firstnameContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Prenom");

        txtFirstname.setMaximumSize(new java.awt.Dimension(350, 50));
        txtFirstname.setMinimumSize(new java.awt.Dimension(350, 50));
        txtFirstname.setPreferredSize(new java.awt.Dimension(350, 32));

        javax.swing.GroupLayout firstnameContainerLayout = new javax.swing.GroupLayout(firstnameContainer);
        firstnameContainer.setLayout(firstnameContainerLayout);
        firstnameContainerLayout.setHorizontalGroup(
            firstnameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstnameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 263, Short.MAX_VALUE))
            .addComponent(txtFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        lastnameContainer.setMaximumSize(new java.awt.Dimension(350, 80));
        lastnameContainer.setMinimumSize(new java.awt.Dimension(350, 80));
        lastnameContainer.setName(""); // NOI18N
        lastnameContainer.setOpaque(false);
        lastnameContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nom");

        txtLastname.setMinimumSize(new java.awt.Dimension(350, 50));
        txtLastname.setPreferredSize(new java.awt.Dimension(350, 50));

        javax.swing.GroupLayout lastnameContainerLayout = new javax.swing.GroupLayout(lastnameContainer);
        lastnameContainer.setLayout(lastnameContainerLayout);
        lastnameContainerLayout.setHorizontalGroup(
            lastnameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastnameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );
        lastnameContainerLayout.setVerticalGroup(
            lastnameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastnameContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4, Short.MAX_VALUE))
        );

        center.add(lastnameContainer);

        phoneContainer.setBackground(new java.awt.Color(255, 255, 255));
        phoneContainer.setMaximumSize(new java.awt.Dimension(350, 80));
        phoneContainer.setMinimumSize(new java.awt.Dimension(350, 80));
        phoneContainer.setName(""); // NOI18N
        phoneContainer.setOpaque(false);
        phoneContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Phone");

        phoneNumber.setMaximumSize(new java.awt.Dimension(350, 50));
        phoneNumber.setMinimumSize(new java.awt.Dimension(350, 50));
        phoneNumber.setPreferredSize(new java.awt.Dimension(350, 50));

        javax.swing.GroupLayout phoneContainerLayout = new javax.swing.GroupLayout(phoneContainer);
        phoneContainer.setLayout(phoneContainerLayout);
        phoneContainerLayout.setHorizontalGroup(
            phoneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(196, 293, Short.MAX_VALUE))
            .addComponent(phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        phoneContainerLayout.setVerticalGroup(
            phoneContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phoneContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        center.add(phoneContainer);

        addressContainer.setBackground(new java.awt.Color(255, 255, 255));
        addressContainer.setMaximumSize(new java.awt.Dimension(350, 80));
        addressContainer.setMinimumSize(new java.awt.Dimension(350, 80));
        addressContainer.setName(""); // NOI18N
        addressContainer.setOpaque(false);
        addressContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Adresse");

        txtAddress.setMaximumSize(new java.awt.Dimension(350, 50));
        txtAddress.setMinimumSize(new java.awt.Dimension(350, 50));
        txtAddress.setPreferredSize(new java.awt.Dimension(350, 50));

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
                .addContainerGap(4, Short.MAX_VALUE))
        );

        center.add(addressContainer);

        activityContainer.setBackground(new java.awt.Color(255, 255, 255));
        activityContainer.setMaximumSize(new java.awt.Dimension(350, 80));
        activityContainer.setMinimumSize(new java.awt.Dimension(350, 80));
        activityContainer.setOpaque(false);
        activityContainer.setPreferredSize(new java.awt.Dimension(350, 80));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Activites");

        comboxActivity.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        comboxActivity.setMaximumSize(new java.awt.Dimension(350, 50));
        comboxActivity.setMinimumSize(new java.awt.Dimension(350, 50));
        comboxActivity.setPreferredSize(new java.awt.Dimension(350, 50));

        javax.swing.GroupLayout activityContainerLayout = new javax.swing.GroupLayout(activityContainer);
        activityContainer.setLayout(activityContainerLayout);
        activityContainerLayout.setHorizontalGroup(
            activityContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboxActivity, 0, 356, Short.MAX_VALUE)
            .addGroup(activityContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        activityContainerLayout.setVerticalGroup(
            activityContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activityContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(comboxActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4, Short.MAX_VALUE))
        );

        center.add(activityContainer);

        container.add(center, java.awt.BorderLayout.CENTER);

        footer.setBackground(new java.awt.Color(221, 221, 221));
        footer.setOpaque(false);

        btnAdded.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
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
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btnAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        container.add(footer, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activityContainer;
    private javax.swing.JPanel addressContainer;
    private javax.swing.JButton btnAdded;
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel center;
    private javax.swing.JComboBox<ActivityModel> comboxActivity;
    private javax.swing.JPanel container;
    private javax.swing.JPanel firstnameContainer;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel lastnameContainer;
    private javax.swing.JPanel phoneContainer;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    // End of variables declaration//GEN-END:variables
}
