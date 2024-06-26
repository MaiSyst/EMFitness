/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.utilities;

import emfitness.models.ActivityModel;
import emfitness.models.RoomWithSubscribeModel;
import emfitness.models.SubscriptionModel;
import java.awt.Component;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JPasswordField;

/**
 *
 * @author orion90
 */
public final class MaiUtils {

    public static final class MaiComboxBoxCell extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            if( value instanceof ActivityModel activityModel){
                value = activityModel.label();
            }
            else if(value instanceof RoomWithSubscribeModel model ){
                value=model.roomName();
            }
            else if(value instanceof SubscriptionModel model){
                value = model.type()+ " / " + model.price() + " FCFA / " + model.label();
            }            
            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }

    }
    public static final String getTextPassword(JPasswordField field) {
        StringBuilder stringBuilder = new StringBuilder();
        var passChars = field.getPassword();
        for (int i = 0; i < passChars.length; i++) {
            stringBuilder.append(passChars[i]);
        }
        return stringBuilder.toString();
    }
    public static final String dateToEnglish(String day) {
        return switch (day.toLowerCase()) {
            case "lundi" ->
                "MONDAY";
            case "mardi" ->
                "TUESDAY";
            case "mercredi" ->
                "WEDNESDAY";
            case "jeudi" ->
                "THURSDAY";
            case "vendredi" ->
                "FRIDAY";
            case "samedi" ->
                "SATURDAY";
            case "dimanche" ->
                "SUNDAY";
            default ->
                null;
        };
    }

    public static final String dateToFrench(String day) {
        return switch (day) {
            case "MONDAY" ->
                "Lundi";
            case "TUESDAY" ->
                "Mardi";
            case "WEDNESDAY" ->
                "Mercredi";
            case "THURSDAY" ->
                "Jeudi";
            case "FRIDAY" ->
                "Vendredi";
            case "SATURDAY" ->
                "Samedi";
            case "SUNDAY" ->
                "Dimanche";
            default ->
                null;
        };
    }
    
    public static String numberFormat(Object money){
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.GERMAN);
        return nf.format(money).split(",")[0];
    }
}
