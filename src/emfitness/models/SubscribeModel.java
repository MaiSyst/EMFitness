/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.models;

/**
 *
 * @author orion90
 */
public record SubscribeModel(
        String subscribeId,String dateStart,String dateEnd,boolean isActive,CustomerModel customer,SubscriptionModel subscription){}
