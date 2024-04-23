/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.controllers;

import com.google.gson.Gson;
import com.maisyst.fetch.MaiFetch;
import com.maisyst.fetch.exceptions.MaiException;
import static com.maisyst.fetch.utils.enums.ResponseStatusCode.FORBIDDEN;
import static com.maisyst.fetch.utils.enums.ResponseStatusCode.OK;
import emfitness.models.RoomWithSubscribeModel;
import emfitness.screens.RoomModal;
import emfitness.utilities.Constants;
import emfitness.utilities.MaiFunctionCallWithArgs;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import raven.toast.Notifications;

/**
 *
 * @author orion90
 */
public class RoomModalController {
    
    private final RoomModal roomModal;
    private final MaiFunctionCallWithArgs func;
    private final MaiFetch fetch;
    
    public RoomModalController(MaiFetch fetch, MaiFunctionCallWithArgs func) {
        this.roomModal = new RoomModal();
        this.fetch = fetch;
        this.func = func;
        this.roomModal.getBtnClose().addActionListener(l -> roomModal.dispose());
        roomModal.getBtnAdded().addActionListener(l -> addNewRoom());
        roomModal.getInputRoomName().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                if (e.getKeyCode() == 10) {
                    addNewRoom();
                }
            }
            
        });
        
    }

    public RoomModalController(MaiFetch fetch, String roomName, String roomId, MaiFunctionCallWithArgs func) {
        this.roomModal = new RoomModal();
        roomModal.getInputRoomName().setText(roomName);
        roomModal.getBtnAdded().setText("Modifier");
        this.fetch = fetch;
        this.func = func;
        this.roomModal.getBtnClose().addActionListener(l -> roomModal.dispose());
        roomModal.getBtnAdded().addActionListener(l -> editRoom(roomId));
        roomModal.getInputRoomName().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                if (e.getKeyCode() == 10) {
                    editRoom(roomId);
                }
            }
            
        });
        
    }
    
    private void addNewRoom() {
        final var roomName = roomModal.getInputRoomName().getText();
        if (roomName.isBlank()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Cet champs ne peut être vide.");
        } else {
            try {
                final Map<String, Object> body = new HashMap<>();
                body.put("roomName", roomName.toLowerCase());
                
                fetch.post(Constants.ROOM_ADD_URL_PATH, body).then((result, status) -> {
                    switch (status) {
                        case OK -> {
                            Gson gson = new Gson();
                            RoomWithSubscribeModel model = gson.fromJson(result, RoomWithSubscribeModel.class);
                            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_RIGHT, "Une salle a été ajouté.");
                            func.invoked(model.roomId(), model.roomName());
                            roomModal.getInputRoomName().setText("");
                        }
                        case FORBIDDEN ->
                            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Access interdit.");
                        default ->
                            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Erreur est survenue lors de l'ajout.");
                    }
                });
            } catch (MaiException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    private void editRoom(String roomId) {
        final var roomName = roomModal.getInputRoomName().getText();
        if (roomName.isBlank()) {
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Cet champs ne peut être vide.");
        } else {
            try {
                final Map<String, Object> body = new HashMap<>();
                body.put("roomName", roomName.toLowerCase());
                fetch.put(Constants.ROOM_UPDATE_URL_PATH + roomId, body).then((result, status) -> {
                    switch (status) {
                        case OK -> {
                            //Gson gson=new Gson();
                            //RoomWithSubscribeModel model=gson.fromJson(result, RoomWithSubscribeModel.class);
                            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_RIGHT, "Une salle a été mise a jour.");
                            func.invoked(roomId, roomName);
                            roomModal.dispose();
                        }
                        case FORBIDDEN ->
                            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Access interdit.");
                        default ->
                            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Erreur est survenue lors de l'ajout.");
                    }
                });
            } catch (MaiException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void show(JFrame parent) {
        roomModal.getAccessibleContext().setAccessibleParent(parent);
        roomModal.setVisible(true);
    }
}
