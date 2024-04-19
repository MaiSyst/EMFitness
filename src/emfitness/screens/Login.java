/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emfitness.screens;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import emfitness.controllers.LoginController;
import emfitness.utilities.Constants;

/**
 *
 * @author orion90
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private LoginController controller;
    private final String flatStyle=FlatClientProperties.STYLE;
    public Login() {
        initComponents();
        controller=new LoginController(this,
                inputText, 
                inputPwd, 
                btnLogin,msgInputText,
                msgInputPwd,loader,
                checkBoxStayConnected
      );
        inputPwd.putClientProperty(flatStyle, "showRevealButton:true");
        inputPwd.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Entrer votre mot de passe");
        inputText.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Entrer votre username");
        inputText.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon(Constants.ICONS_PATH+"person.svg"));
        inputPwd.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon(Constants.ICONS_PATH+"pwd.svg"));
        btnLogin.setIcon(new FlatSVGIcon("emfitness/icons/login.svg"));
        panelUndescore.putClientProperty(flatStyle, "arc:20");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        loader = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        leftSide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rightSide = new javax.swing.JPanel();
        headerTitle = new javax.swing.JPanel();
        panelUndescore = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inputText = new javax.swing.JTextField();
        msgInputText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        inputPwd = new javax.swing.JPasswordField();
        msgInputPwd = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        checkBoxStayConnected = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loader.setBackground(new java.awt.Color(255, 255, 255));
        loader.setOpaque(false);
        loader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emfitness/icons/loader1.gif"))); // NOI18N
        loader.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 420, 160));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("RESTER TOUJOURS EN FORME");
        loader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("****");
        loader.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("****");
        loader.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, 18));

        getContentPane().add(loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setMaximumSize(new java.awt.Dimension(1024, 512));
        container.setMinimumSize(new java.awt.Dimension(1024, 512));
        container.setPreferredSize(new java.awt.Dimension(1024, 512));
        container.setLayout(new java.awt.BorderLayout());

        leftSide.setBackground(new java.awt.Color(255, 255, 255));
        leftSide.setPreferredSize(new java.awt.Dimension(600, 100));
        leftSide.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emfitness/icons/5233013.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        leftSide.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 200));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emfitness/icons/emfTitle.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(245, 245, 245));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("powered by MaiSYST");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(83, 83, 83))
        );

        leftSide.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        container.add(leftSide, java.awt.BorderLayout.LINE_START);

        rightSide.setBackground(new java.awt.Color(255, 255, 255));
        java.awt.GridBagLayout rightSideLayout = new java.awt.GridBagLayout();
        rightSideLayout.columnWidths = new int[] {50, 13, 3, 3, 3};
        rightSideLayout.rowHeights = new int[] {40, 100, 100, 40, 100};
        rightSideLayout.columnWeights = new double[] {1.0};
        rightSideLayout.rowWeights = new double[] {0.5, 0.3, 1.0, 0.2, 0.5, 0.5, 0.5};
        rightSide.setLayout(rightSideLayout);

        headerTitle.setBackground(new java.awt.Color(255, 255, 255));
        headerTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUndescore.setBackground(new java.awt.Color(130, 185, 0));
        headerTitle.add(panelUndescore, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, -1));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(130, 185, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setPreferredSize(new java.awt.Dimension(134, 50));
        headerTitle.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 80));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        rightSide.add(headerTitle, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputText.setMaximumSize(new java.awt.Dimension(300, 50));
        inputText.setMinimumSize(new java.awt.Dimension(300, 50));
        inputText.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel2.add(inputText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 300, 50));

        msgInputText.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(msgInputText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 300, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        rightSide.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(360, 70));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputPwd.setMaximumSize(new java.awt.Dimension(300, 50));
        inputPwd.setMinimumSize(new java.awt.Dimension(300, 50));
        jPanel3.add(inputPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 300, 50));

        msgInputPwd.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3.add(msgInputPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 300, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        rightSide.add(jPanel3, gridBagConstraints);

        jPanel1.setOpaque(false);

        checkBoxStayConnected.setForeground(new java.awt.Color(0, 0, 0));
        checkBoxStayConnected.setText("Se souvenir de moi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(checkBoxStayConnected, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxStayConnected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        rightSide.add(jPanel1, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 70));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setBackground(new java.awt.Color(130, 185, 0));
        btnLogin.setFont(new java.awt.Font("SF Pro Display", 1, 15)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Se Connecter");
        btnLogin.setActionCommand("Se connecter");
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 190, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        rightSide.add(jPanel4, gridBagConstraints);

        container.add(rightSide, java.awt.BorderLayout.CENTER);

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox checkBoxStayConnected;
    private javax.swing.JPanel container;
    private javax.swing.JPanel headerTitle;
    private javax.swing.JPasswordField inputPwd;
    private javax.swing.JTextField inputText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel leftSide;
    private javax.swing.JPanel loader;
    private javax.swing.JLabel msgInputPwd;
    private javax.swing.JLabel msgInputText;
    private javax.swing.JPanel panelUndescore;
    private javax.swing.JPanel rightSide;
    // End of variables declaration//GEN-END:variables
}