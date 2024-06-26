/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.controllers;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.maisyst.fetch.MaiFetch;
import com.maisyst.fetch.exceptions.MaiException;
import com.maisyst.fetch.utils.enums.ResponseStatusCode;
import emfitness.components.PopupValidateCustomer;
import emfitness.models.SubscriptionModel;
import emfitness.utilities.Constants;
import emfitness.utilities.MaiState;
import emfitness.utilities.MaiUtils;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import raven.toast.Notifications;

/**
 *
 * @author maisyst
 */
public class PopupValidateCustomerController {

    private final PopupValidateCustomer modal;
    private final MaiState maiState;

    public PopupValidateCustomerController(final JFrame parent, final MaiState maiState) {
        modal = new PopupValidateCustomer(parent, true);
        modal.getBtnClose().setIcon(new FlatSVGIcon(Constants.ICONS_PATH + "/close.svg"));
        modal.getBtnClose().addActionListener(l -> modal.dispose());
        this.maiState = maiState;
    }

    public void show(final String identity,
            final String firstName,
            final String lastName,
            final String dateStart,
            final String dateEnd,
            final String messageValidating,
            final String typeSubscription,
            final boolean isValid,
            final List<SubscriptionModel> subscriptionModels,
            final MaiFetch fetch) {
        modal.getFirstName().setText(firstName);
        modal.getLastName().setText(lastName);
        modal.getIdentityCustomer().setText(identity);
        modal.getValidity().setText(messageValidating);
        modal.getDateEnd().setText(dateEnd);
        modal.getDateStart().setText(dateStart);
        modal.getTypeSubscription().setText(typeSubscription);
        isValidate(isValid, subscriptionModels, identity, fetch);
        modal.setVisible(true);

    }

    private void isValidate(boolean isValidate,
            final List<SubscriptionModel> subscriptionModels, final String identity,
            final MaiFetch fetch) {
        if (isValidate) {
            modal.getCenter().remove(modal.getComboSubscription());
            modal.getCenter().remove(modal.getLblSubscription());
            modal.getContainer().remove(modal.getFooter());
            modal.getIconValidate().setVisible(true);
            modal.getIconError().setVisible(false);
            modal.getValidity().setForeground(Color.decode("#339900"));
        } else {
            final DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) modal.getComboSubscription().getModel();
            comboBoxModel.removeAllElements();
            subscriptionModels.forEach(model -> comboBoxModel.addElement(model));
            modal.getComboSubscription().setRenderer(new MaiUtils.MaiComboxBoxCell());
            modal.getBtnRescubscribe().addActionListener(l -> updateSubscription(identity, fetch));
            modal.getIconValidate().setVisible(false);
            modal.getIconError().setVisible(true);
            modal.getValidity().setForeground(Color.red);

        }
    }

    private void updateSubscription(final String identify, final MaiFetch fetch) {
        try {
            Map<String, Object> body = new HashMap<>();
            var subscType = (SubscriptionModel) modal.getComboSubscription().getSelectedItem();
            body.put("arg", subscType.subscriptionId());

            fetch.put(Constants.CUSTOMER_UPDATE_SUBSCRIPTION_URL_PATH + "/" + identify, body).then((result, status) -> {
                if (status == ResponseStatusCode.OK) {
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_RIGHT, "Réabonnement effectué.");
                    modal.dispose();
                    this.maiState.updateState();
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_RIGHT, "Erreur de Réabonnement");
                }
            });
        } catch (MaiException e) {

            Logger.getLogger(PopupValidateCustomerController.class.getName()).info(e.getMessage());
        }
    }
}
