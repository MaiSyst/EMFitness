/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package emfitness.screens;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import emfitness.models.ActivityModel;
import emfitness.models.RoomWithSubscribeModel;
import emfitness.utilities.Constants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author orion90
 */
public class PlanningModal extends javax.swing.JDialog {

    /**
     * Creates new form PlanningModal
     */
    public PlanningModal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        closeModal.setIcon(new FlatSVGIcon(Constants.ICONS_PATH+"close.svg"));
        addNewPlanning.setIcon(new FlatSVGIcon(Constants.ICONS_PATH+"plus.svg"));
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
        lblTitile = new javax.swing.JLabel();
        closeModal = new javax.swing.JButton();
        main = new javax.swing.JPanel();
        containerDatePlanning = new javax.swing.JPanel();
        lblDatePlanning = new javax.swing.JLabel();
        ComboBoxDay = new javax.swing.JComboBox<>();
        containerTimeStartPlanning = new javax.swing.JPanel();
        lblTimeStartPlanning = new javax.swing.JLabel();
        comboMMStart = new javax.swing.JComboBox<>();
        comboHourStart = new javax.swing.JComboBox<>();
        lblTimeStartPlanning1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        containerTimeEndPlanning = new javax.swing.JPanel();
        lblTimeStartPlanning2 = new javax.swing.JLabel();
        comboMMEnd = new javax.swing.JComboBox<>();
        comboHourEnd = new javax.swing.JComboBox<>();
        lblTimeStartPlanning3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        containerActivityPlanning = new javax.swing.JPanel();
        comboActivities = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        containerRoomPlanning = new javax.swing.JPanel();
        comboRoom = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        addNewPlanning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 700));
        setMinimumSize(new java.awt.Dimension(400, 700));
        setModal(true);
        setUndecorated(true);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 153, 0), 2, true));
        container.setMaximumSize(new java.awt.Dimension(400, 700));
        container.setMinimumSize(new java.awt.Dimension(400, 700));
        container.setPreferredSize(new java.awt.Dimension(400, 700));
        container.setLayout(new java.awt.BorderLayout());

        header.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        header.setOpaque(false);
        header.setPreferredSize(new java.awt.Dimension(400, 60));

        lblTitile.setFont(new java.awt.Font("SF Pro Display", 1, 25)); // NOI18N
        lblTitile.setForeground(new java.awt.Color(102, 102, 0));
        lblTitile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitile.setText("Plannings");

        closeModal.setContentAreaFilled(false);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitile, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeModal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeModal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        container.add(header, java.awt.BorderLayout.PAGE_START);

        main.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        main.setOpaque(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 10);
        flowLayout1.setAlignOnBaseline(true);
        main.setLayout(flowLayout1);

        containerDatePlanning.setMaximumSize(new java.awt.Dimension(400, 80));
        containerDatePlanning.setMinimumSize(new java.awt.Dimension(400, 80));
        containerDatePlanning.setOpaque(false);
        containerDatePlanning.setPreferredSize(new java.awt.Dimension(400, 80));

        lblDatePlanning.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        lblDatePlanning.setForeground(new java.awt.Color(51, 51, 0));
        lblDatePlanning.setText("Jour");

        ComboBoxDay.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        ComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" }));

        javax.swing.GroupLayout containerDatePlanningLayout = new javax.swing.GroupLayout(containerDatePlanning);
        containerDatePlanning.setLayout(containerDatePlanningLayout);
        containerDatePlanningLayout.setHorizontalGroup(
            containerDatePlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerDatePlanningLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(containerDatePlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDatePlanning, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(ComboBoxDay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        containerDatePlanningLayout.setVerticalGroup(
            containerDatePlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerDatePlanningLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblDatePlanning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(ComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        main.add(containerDatePlanning);

        containerTimeStartPlanning.setMaximumSize(new java.awt.Dimension(400, 80));
        containerTimeStartPlanning.setMinimumSize(new java.awt.Dimension(400, 80));
        containerTimeStartPlanning.setOpaque(false);
        containerTimeStartPlanning.setPreferredSize(new java.awt.Dimension(400, 80));

        lblTimeStartPlanning.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        lblTimeStartPlanning.setForeground(new java.awt.Color(51, 51, 0));
        lblTimeStartPlanning.setText("HH");

        comboMMStart.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        comboMMStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        comboHourStart.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        comboHourStart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" }));

        lblTimeStartPlanning1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        lblTimeStartPlanning1.setForeground(new java.awt.Color(51, 51, 0));
        lblTimeStartPlanning1.setText("MM");

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Heure du debut");

        javax.swing.GroupLayout containerTimeStartPlanningLayout = new javax.swing.GroupLayout(containerTimeStartPlanning);
        containerTimeStartPlanning.setLayout(containerTimeStartPlanningLayout);
        containerTimeStartPlanningLayout.setHorizontalGroup(
            containerTimeStartPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerTimeStartPlanningLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(containerTimeStartPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboHourStart, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerTimeStartPlanningLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTimeStartPlanning)))
                .addGroup(containerTimeStartPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerTimeStartPlanningLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMMStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerTimeStartPlanningLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTimeStartPlanning1)))
                .addGap(38, 38, 38))
        );
        containerTimeStartPlanningLayout.setVerticalGroup(
            containerTimeStartPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerTimeStartPlanningLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(containerTimeStartPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerTimeStartPlanningLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerTimeStartPlanningLayout.createSequentialGroup()
                        .addGroup(containerTimeStartPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTimeStartPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimeStartPlanning1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(containerTimeStartPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMMStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboHourStart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        main.add(containerTimeStartPlanning);

        containerTimeEndPlanning.setMaximumSize(new java.awt.Dimension(400, 80));
        containerTimeEndPlanning.setMinimumSize(new java.awt.Dimension(400, 80));
        containerTimeEndPlanning.setOpaque(false);

        lblTimeStartPlanning2.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        lblTimeStartPlanning2.setForeground(new java.awt.Color(51, 51, 0));
        lblTimeStartPlanning2.setText("HH");

        comboMMEnd.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        comboMMEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        comboHourEnd.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        comboHourEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" }));

        lblTimeStartPlanning3.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        lblTimeStartPlanning3.setForeground(new java.awt.Color(51, 51, 0));
        lblTimeStartPlanning3.setText("MM");

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("Heure de fin");

        javax.swing.GroupLayout containerTimeEndPlanningLayout = new javax.swing.GroupLayout(containerTimeEndPlanning);
        containerTimeEndPlanning.setLayout(containerTimeEndPlanningLayout);
        containerTimeEndPlanningLayout.setHorizontalGroup(
            containerTimeEndPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerTimeEndPlanningLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(containerTimeEndPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboHourEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerTimeEndPlanningLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTimeStartPlanning2)))
                .addGroup(containerTimeEndPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerTimeEndPlanningLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMMEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerTimeEndPlanningLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblTimeStartPlanning3)))
                .addGap(38, 38, 38))
        );
        containerTimeEndPlanningLayout.setVerticalGroup(
            containerTimeEndPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerTimeEndPlanningLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(containerTimeEndPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerTimeEndPlanningLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerTimeEndPlanningLayout.createSequentialGroup()
                        .addGroup(containerTimeEndPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTimeStartPlanning2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTimeStartPlanning3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(containerTimeEndPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMMEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboHourEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        main.add(containerTimeEndPlanning);

        containerActivityPlanning.setMaximumSize(new java.awt.Dimension(400, 80));
        containerActivityPlanning.setMinimumSize(new java.awt.Dimension(400, 80));
        containerActivityPlanning.setOpaque(false);

        comboActivities.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        comboActivities.setPreferredSize(new java.awt.Dimension(95, 50));

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("Choisir Activité");

        javax.swing.GroupLayout containerActivityPlanningLayout = new javax.swing.GroupLayout(containerActivityPlanning);
        containerActivityPlanning.setLayout(containerActivityPlanningLayout);
        containerActivityPlanningLayout.setHorizontalGroup(
            containerActivityPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerActivityPlanningLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(containerActivityPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboActivities, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        containerActivityPlanningLayout.setVerticalGroup(
            containerActivityPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerActivityPlanningLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comboActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        main.add(containerActivityPlanning);

        containerRoomPlanning.setMaximumSize(new java.awt.Dimension(400, 80));
        containerRoomPlanning.setMinimumSize(new java.awt.Dimension(400, 80));
        containerRoomPlanning.setOpaque(false);

        comboRoom.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        comboRoom.setPreferredSize(new java.awt.Dimension(95, 50));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 0));
        jLabel4.setText("Choisir Salle");

        javax.swing.GroupLayout containerRoomPlanningLayout = new javax.swing.GroupLayout(containerRoomPlanning);
        containerRoomPlanning.setLayout(containerRoomPlanningLayout);
        containerRoomPlanningLayout.setHorizontalGroup(
            containerRoomPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerRoomPlanningLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(containerRoomPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        containerRoomPlanningLayout.setVerticalGroup(
            containerRoomPlanningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerRoomPlanningLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comboRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        main.add(containerRoomPlanning);

        container.add(main, java.awt.BorderLayout.CENTER);

        footer.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        footer.setOpaque(false);

        addNewPlanning.setBackground(new java.awt.Color(153, 204, 0));
        addNewPlanning.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        addNewPlanning.setForeground(new java.awt.Color(255, 255, 255));
        addNewPlanning.setText("Valider");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(addNewPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(addNewPlanning, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        container.add(footer, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(container, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public JComboBox<ActivityModel> getComboActivities() {
        return comboActivities;
    }

    public JComboBox<String> getComboHourEnd() {
        return comboHourEnd;
    }

    public JComboBox<String> getComboHourStart() {
        return comboHourStart;
    }

    public JComboBox<String> getComboMMEnd() {
        return comboMMEnd;
    }

    public JComboBox<String> getComboMMStart() {
        return comboMMStart;
    }

    public JComboBox<RoomWithSubscribeModel> getComboRoom() {
        return comboRoom;
    }

    public JComboBox<String> getComboBoxDay() {
        return ComboBoxDay;
    }

    

    public JButton getCloseModal() {
        return closeModal;
    }

    public JButton getAddNewPlanning() {
        return addNewPlanning;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxDay;
    private javax.swing.JButton addNewPlanning;
    private javax.swing.JButton closeModal;
    private javax.swing.JComboBox<ActivityModel> comboActivities;
    private javax.swing.JComboBox<String> comboHourEnd;
    private javax.swing.JComboBox<String> comboHourStart;
    private javax.swing.JComboBox<String> comboMMEnd;
    private javax.swing.JComboBox<String> comboMMStart;
    private javax.swing.JComboBox<RoomWithSubscribeModel> comboRoom;
    private javax.swing.JPanel container;
    private javax.swing.JPanel containerActivityPlanning;
    private javax.swing.JPanel containerDatePlanning;
    private javax.swing.JPanel containerRoomPlanning;
    private javax.swing.JPanel containerTimeEndPlanning;
    private javax.swing.JPanel containerTimeStartPlanning;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDatePlanning;
    private javax.swing.JLabel lblTimeStartPlanning;
    private javax.swing.JLabel lblTimeStartPlanning1;
    private javax.swing.JLabel lblTimeStartPlanning2;
    private javax.swing.JLabel lblTimeStartPlanning3;
    private javax.swing.JLabel lblTitile;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
