/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.controllers;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.maisyst.fetch.MaiFetch;
import com.maisyst.fetch.exceptions.MaiException;
import com.maisyst.fetch.utils.Authorization;
import com.maisyst.fetch.utils.enums.ResponseStatusCode;
import emfitness.components.MaiCardMini;
import emfitness.models.CustomerModel;
import emfitness.models.PlanningModel;
import emfitness.models.RoomModel;
import emfitness.models.SubscribeModel;
import emfitness.models.UserModel;
import emfitness.utilities.API;
import emfitness.utilities.Constants;
import emfitness.utilities.MaiState;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import raven.toast.Notifications;

/**
 *
 * @author orion90
 */
public final class RoomController implements MaiState {

    private final JPanel body;
    private final JFrame parent;
    private final MaiFetch fetch;
    private static final Logger logger = Logger.getLogger(RoomController.class.getName());
    private List<SubscribeModel> dataList = new ArrayList<>();
    private List<MaiState> states=new ArrayList<>();
    public RoomController(
            final JFrame parent,
            final JButton addRoom,
            final JPanel body,
            final JTextField search,
            final String token, 
            List<SubscribeModel> dataList
    ) {
        this.body = body;
        this.parent = parent;
        this.dataList = dataList;
        fetch = API.fetch(new Authorization(token));
        addRoom.setIcon(new FlatSVGIcon(Constants.ICONS_PATH + "plus.svg", 1f));

        search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Rechercher votre salle...");
        search.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon(Constants.ICONS_PATH + "search.svg"));
        search.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (search.getText().length() > 0) {
                    searchIt(search.getText());
                } else {
                    resetSearch();
                }
            }

        });
        addRoom.addActionListener(l -> onHandleShowModal());
        reFetchRoom();

    }

    private void deleteRoom(final String roomId,final String roomName) {
        var option = JOptionPane.showConfirmDialog(parent, "Etes-vous de supprimer?", "Suppression", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            try {
                fetch.delete(Constants.ROOM_DELETE_URL_PATH + roomId).then((result, status) -> {
                    if (status == ResponseStatusCode.OK) {
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_RIGHT, "Salle à été supprimé:");
                        deleteInPanel(roomName);
                        states.forEach(state->state.updateState());
                    } else {
                        Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Error de suppression:");

                    }
                });
            } catch (MaiException e) {
                logger.info(e.getMessage());
            }
        }
    }

    private void editRoom(final String roomId, final String roomName) {
        new RoomModalController(fetch, roomName, roomId,
                args -> editToRoomPanel(args[0].toString(),
                        args[1].toString())).show(parent);
        
    }

    private void reFetchRoom() {
        try {
            fetch.get(Constants.ROOM_FETCH_URL_PATH).then((result, status) -> {
                if (status == ResponseStatusCode.OK) {
                    body.removeAll();
                    Gson gson = new Gson();
                    Type roomListType = new TypeToken<List<RoomModel>>() {
                    }.getType();
                    List<RoomModel> models = gson.fromJson(result, roomListType);
                    var d=models.stream().sorted(
                            (a,b)->a.roomName().toLowerCase().compareTo(b.roomName().toLowerCase()))
                            .collect(Collectors.toUnmodifiableList());
                    for (var model : d) {
                       
                        var desc = model.customers().size() > 1 ? model.customers().size() + " abonnés" : model.customers().size() + " abonné";
                        MaiCardMini maiCardMini = new MaiCardMini(
                                model.roomName().toUpperCase(),
                                desc, model.roomId(),
                                args -> editRoom(args[0], args[1]),
                                args -> deleteRoom(args[0],args[1]),
                                args -> showDetailRoom(
                                        model.roomName(),
                                        model.planning(),
                                        model.customers(),
                                        model.manager(),
                                        eachSubscriptionType(model.customers()).get("gold"),
                                        eachSubscriptionType(model.customers()).get("prime"),
                                        eachSubscriptionType(model.customers()).get("standard")
                                )
                        );
                        body.add(maiCardMini);
                        body.repaint();
                    }
                    

                }
            });

        } catch (MaiException e) {
            logger.info(e.getMessage());
        }

    }

    private void addToRoomPanel(final String roomId, final String roomName) {
        MaiCardMini maiCardMini = new MaiCardMini(
                roomName.toUpperCase(),
                "0 Plannings",
                roomId,
                args -> editRoom(args[0], args[1]),
                args -> deleteRoom(args[0],args[1]),
                args -> showDetailRoom(args[1], new ArrayList<>(), new ArrayList<>(), null,0,0,0)
        );
        body.add(maiCardMini);
        body.repaint();
        states.forEach(state->state.updateState());
    }

    private void editToRoomPanel(final String roomId, final String roomName) {

        for (int i = 0; i < body.getComponentCount(); i++) {
            MaiCardMini v = (MaiCardMini) body.getComponent(i);
            if (v.getCardId().equals(roomId)) {
                v.title(roomName);
                break;
            }
        }
        var d=Arrays.asList(body.getComponents())
                .stream().sorted(
                            (a,b)->((MaiCardMini) a).title().toLowerCase()
                                    .compareTo(((MaiCardMini) b).title().toLowerCase()))
                            .collect(Collectors.toUnmodifiableList());
        body.removeAll();
        d.forEach(body::add);
        
        states.forEach(state->state.updateState());
        body.repaint();
        
    }

    private void searchIt(final String query) {
        for (var comp : body.getComponents()) {
            var card = (MaiCardMini) comp;
            comp.setVisible(card.title().trim().toLowerCase().contains(query.trim().toLowerCase()));
        }
    }
    private void deleteInPanel(final String title) {
        for (var comp : body.getComponents()) {
            var card = (MaiCardMini) comp;
            if(card.title().trim().toLowerCase().contains(title.toLowerCase())){
                body.remove(comp);
            }
        }
        body.repaint();
    }

    private void resetSearch() {
        for (var comp : body.getComponents()) {
            comp.setVisible(true);
        }
    }

    @Override
    public void updateState(Object... args) {
        reFetchRoom();
    }

    private void showDetailRoom(final String roomName, final List<PlanningModel> plannings,
            final List<CustomerModel> customers,
            final UserModel manager, int goldCount, int primeCount, int standardCount) {
        if (manager != null) {
            new RoomDetailsController(parent,
                    roomName.toUpperCase(),
                    plannings.size() + " Plannings",
                    customers.size() + " Abonnés",
                    goldCount + " ",
                    standardCount + " ",
                    primeCount + " ",
                    manager.firstName().toUpperCase() + " " + manager.lastName().toUpperCase()
            ).show();
        } else {
            new RoomDetailsController(parent,
                    roomName,
                    plannings.size() + " Plannings",
                    customers.size() + " Abonnés",
                    goldCount + " ",
                    standardCount + " ",
                    primeCount + " ",
                    "Pas de gérant"
            ).show();
        }
    }

    private void onHandleShowModal() {
        new RoomModalController(fetch, args -> addToRoomPanel(args[0].toString(), args[1].toString())).show(parent);
    }

    private Map<String, Integer> eachSubscriptionType(List<CustomerModel> customers) {
        Map<String, Integer> response = new HashMap<>();
        response.put("gold", 0);
        response.put("prime", 0);
        response.put("standard", 0);
        dataList.forEach(data ->
            customers.forEach(customer -> {
                if (data.customer().customerId().equals(customer.customerId())) {
                    switch (data.subscription().type().toLowerCase()) {
                        case "gold" ->
                            response.put("gold", response.get("gold") + 1);
                        case "prime" ->
                            response.put("prime", response.get("prime") + 1);
                        default ->
                            response.put("standard", response.get("standard") + 1);
                    }
                }
            })
        );
        return response;
    }
    
    public void subscribe(MaiState ...state){
        states.addAll(Arrays.asList(state));
    }
    public void unsubscribe(MaiState state){
        states.remove(state);
    }
}
