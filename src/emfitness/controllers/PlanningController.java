/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.controllers;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.maisyst.fetch.MaiFetch;
import com.maisyst.fetch.exceptions.MaiException;
import com.maisyst.fetch.utils.Authorization;
import com.maisyst.fetch.utils.enums.ResponseStatusCode;
import emfitness.models.ActivityModel;
import emfitness.models.PlanningModel;
import emfitness.models.RoomWithSubscribeModel;
import emfitness.utilities.API;
import emfitness.utilities.Constants;
import emfitness.utilities.MaiState;
import emfitness.utilities.MaiUtils;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

/**
 *
 * @author orion90
 */
public final class PlanningController implements MaiState {

    private final JComboBox<String> filterDay;
    private final JComboBox<String> filterActivity;
    private final JComboBox<String> filterRoom;
    private final JButton resetAction;
    private final JButton removePlannig;
    private final JButton addNewPlanning;
    private final JTable tablePlanning;
    private final JLabel numberPlanningSelectJLabel;
    private final JFrame parent;
    private final MaiFetch fetch;
    private final MaiState maiState;
    private final String roomId;
    private final Gson gson = new Gson();
    private final Type listPlannings = new TypeToken<List<PlanningModel>>() {
    }.getType();
    private static List<PlanningModel> dataList = new ArrayList<>();

    private enum FilterTable {
        DAY,
        ACTIVITY,
        ROOM,
        RESET
    }

    public PlanningController(
            final JFrame parent,
            final JComboBox<String> filterDay,
            final JComboBox<String> filterActivity,
            final JComboBox<String> filterRoom,
            final JButton resetAction,
            final JButton removePlannig,
            final JButton addNewPlanning,
            final JTable tablePlanning,
            final JLabel numberPlanningSelectJLabel,
            final String token,
            final MaiState maiState, final boolean isAdmin, final String roomId) {

        this.filterDay = filterDay;
        this.filterActivity = filterActivity;
        this.filterRoom = filterRoom;
        this.resetAction = resetAction;
        this.addNewPlanning = addNewPlanning;
        this.removePlannig = removePlannig;
        this.tablePlanning = tablePlanning;
        this.maiState = maiState;
        this.numberPlanningSelectJLabel = numberPlanningSelectJLabel;
        this.roomId = roomId;
        this.resetAction.setIcon(new FlatSVGIcon(Constants.ICONS_PATH + "reload.svg"));

        this.parent = parent;
        this.fetch = API.fetch(new Authorization(token));
        this.addNewPlanning.setIcon(new FlatSVGIcon(Constants.ICONS_PATH + "plus.svg"));
        this.removePlannig.setIcon(new FlatSVGIcon(Constants.ICONS_PATH + "trash.svg"));
        addNewPlanning.addActionListener(l -> showModal());
        removePlannig.addActionListener(l -> activitySuppression());
        refreshDataTable(roomId);
        tablePlanning.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                if (e.getClickCount() == 2) {
                    var row = tablePlanning.getSelectedRow();
                    var planningId = tablePlanning.getValueAt(row, 0).toString();
                    var day = tablePlanning.getValueAt(row, 1).toString();
                    var hStart = tablePlanning.getValueAt(row, 2).toString();
                    var hEnd = tablePlanning.getValueAt(row, 3).toString();
                    var activity = tablePlanning.getValueAt(row, 4).toString();
                    var room = tablePlanning.getValueAt(row, 5).toString();
                    showEditModal(planningId, day, hStart, hEnd, activity, room);
                }
            }

        });
        tablePlanning.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                changeSelectedPlannings();
            }

            @Override
            public void keyPressed(KeyEvent e) {

                super.keyPressed(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                changeSelectedPlannings();
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    activitySuppression();
                }
            }

        });

        filterActivity.addItemListener(l -> {
            if (l.getStateChange() == ItemEvent.SELECTED) {
                filterTable(l.getItem().toString().trim().toLowerCase(), FilterTable.ACTIVITY);
            }
        });
        filterRoom.addItemListener(l -> {
            if (l.getStateChange() == ItemEvent.SELECTED) {
                filterTable(l.getItem().toString().trim().toLowerCase(), FilterTable.ROOM);
            }
        });
        filterDay.addItemListener(l -> {
            if (l.getStateChange() == ItemEvent.SELECTED) {
                filterTable(l.getItem().toString().trim().toLowerCase(), FilterTable.DAY);
            }
        });
        resetAction.addActionListener(l -> filterTable("reset", FilterTable.RESET));

    }

    private void filterTable(final String query, final FilterTable filter) {
        switch (filter) {
            case DAY -> {
                filterActivity.setSelectedIndex(0);
                filterRoom.setSelectedIndex(0);

                if (query.equals("tous les jours")) {
                    insertDataTable(dataList);
                } else {
                    var response = dataList.stream().filter(data
                            -> data.day().trim().toLowerCase()
                                    .contains(MaiUtils.dateToEnglish(query).toLowerCase())).toList();
                    insertDataTable(response);
                }
            }
            case ACTIVITY -> {
                filterRoom.setSelectedIndex(0);
                filterDay.setSelectedIndex(0);
                if (query.equals("toutes les activites")) {
                    insertDataTable(dataList);
                } else {
                    var response = dataList.stream().filter(data -> data.activity().label()
                            .trim().toLowerCase().contains(query)).toList();
                    insertDataTable(response);
                }
            }
            case ROOM -> {
                filterActivity.setSelectedIndex(0);
                filterDay.setSelectedIndex(0);
                if (query.equals("toutes les salles")) {
                    insertDataTable(dataList);
                } else {
                    var response = dataList.stream().filter(data -> data.room().roomName()
                            .trim().toLowerCase().contains(query)).toList();
                    insertDataTable(response);
                }
            }
            default -> {
                filterActivity.setSelectedIndex(0);
                filterDay.setSelectedIndex(0);
                filterRoom.setSelectedIndex(0);
                insertDataTable(dataList);
            }
        }
    }

    private void activitySuppression() {
        var rows = tablePlanning.getSelectedRows();
        if (rows.length == 0) {
            Notifications.getInstance().show(Notifications.Type.INFO, "Vous devriez selectionner d'abord la line a supprimer.");
        } else {
            var response = JOptionPane.showConfirmDialog(parent, "Etes-vous sure de supprimer?", "Suppression", JOptionPane.OK_CANCEL_OPTION);
            if (response == JOptionPane.OK_OPTION) {
                List<String> ids = new ArrayList<>();
                for (int row : rows) {
                    ids.add(tablePlanning.getValueAt(row, 0).toString());
                }
                removedOneOrMultiPlannings(ids);
            }
        }
    }

    private void removedOneOrMultiPlannings(List<String> planningId) {
        try {
            Map<String, Object> body = new HashMap<>();
            body.put("ids", planningId);
            fetch.post(Constants.PLANNING_DELETE_MANY_URL_PATH, body).then((res, status) -> {
                if (status == ResponseStatusCode.OK) {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, "(" + planningId.size() + ") activités ont été supprimé.");
                    refreshDataTable(roomId);
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, "Erreur de suppression.");

                }
            });
        } catch (MaiException e) {
            System.out.println(e.getMessage());
        }
    }

    private void changeSelectedPlannings() {
        if (tablePlanning.getSelectedRows().length != 0) {
            numberPlanningSelectJLabel.setText("( " + tablePlanning.getSelectedRows().length + " )");
            numberPlanningSelectJLabel.setForeground(Color.BLACK);

        } else {
            numberPlanningSelectJLabel.setText("( 0 )");
            numberPlanningSelectJLabel.setForeground(Color.GRAY);
        }
    }

    private void fetchFilterActivities() {
        try {
            fetch.get(Constants.ACTIVITY_FETCH_URL_PATH).then((result, status) -> {
                if (status == ResponseStatusCode.OK) {
                    final Type activityListType = new TypeToken<List<ActivityModel>>() {
                    }.getType();
                    List<ActivityModel> models = gson.fromJson(result, activityListType);
                    filterActivity.removeAllItems();
                    filterActivity.addItem("Toutes les activites");
                    models.forEach(model
                            -> filterActivity.addItem(model.label())
                    );

                }
            });
        } catch (MaiException e) {
            System.out.println(e.getMessage());
        }
    }

    private void fetchFilterRoom() {
        try {
            fetch.get(Constants.ROOM_FETCH_SUBSC_URL_PATH).then((result, status) -> {

                if (status == ResponseStatusCode.OK) {
                    final Type roomListType = new TypeToken<List<RoomWithSubscribeModel>>() {
                    }.getType();
                    List<RoomWithSubscribeModel> models = gson.fromJson(result, roomListType);
                    filterRoom.removeAllItems();
                    filterRoom.addItem("Toutes les salles");
                    if (roomId.equals("admin")) {
                        models.forEach(model
                                -> filterRoom.addItem(model.roomName()));
                    } else {
                        models.forEach(model
                                -> {
                            if (model.roomId().equals(roomId)) {
                                filterRoom.addItem(model.roomName());
                                filterRoom.setSelectedItem(model.roomName());
                            }
                        }
                        );
                    }

                }
            });
        } catch (MaiException e) {

            System.out.println(e.getMessage());
        }
    }

    private void insertDataTable(List<PlanningModel> models) {
        DefaultTableModel tableModel = (DefaultTableModel) tablePlanning.getModel();
        tableModel.setRowCount(0);
        if (roomId.equals("admin")) {
            models.forEach(model
                    -> tableModel.addRow(new String[]{
                model.planningId(),
                MaiUtils.dateToFrench(model.day()),
                model.startTime(),
                model.endTime(),
                model.activity().label(),
                model.room().roomName()
            })
            );
        } else {
            models.forEach(model
                    -> {
                if (model.room().roomId().equals(roomId)) {
                    tableModel.addRow(new String[]{
                        model.planningId(),
                        MaiUtils.dateToFrench(model.day()),
                        model.startTime(),
                        model.endTime(),
                        model.activity().label(),
                        model.room().roomName()
                    });
                }
            }
            );
        }
    }

    private void refreshDataTable(String roomId) {
        try {
            if (roomId.equals("admin")) {
                fetch.get(Constants.PLANNING_FETCH_URL_PATH + "/admin").then((result, status) -> {
                    if (status == ResponseStatusCode.OK) {
                        dataList = gson.fromJson(result, listPlannings);
                        insertDataTable(dataList);
                        fetchFilterActivities();
                        fetchFilterRoom();
                    }

                });
            } else {
                fetch.get(Constants.PLANNING_FETCH_URL_PATH + "/" + roomId).then((result, status) -> {
                    if (status == ResponseStatusCode.OK) {
                        dataList = gson.fromJson(result, listPlannings);
                        insertDataTable(dataList);
                        fetchFilterActivities();
                        fetchFilterRoom();
                    }

                });
            }
        } catch (MaiException e) {
            System.out.println(e.getMessage());
        }
    }

    private void showModal() {
        new PlanningModalController(parent, fetch, () -> refreshDataTable(roomId), maiState, roomId
        ).show();
    }

    private void showEditModal(String planningId, String day, String timeStart, String timeEnd, String activity, String roomName) {
        new PlanningModalController(parent, fetch, planningId,
                day, timeStart,
                timeEnd, activity, roomName,
                () -> refreshDataTable(roomId),
                maiState,
                roomId
        ).show();
    }

    @Override
    public void updateState(Object... args) {
        refreshDataTable(roomId);
    }

}
