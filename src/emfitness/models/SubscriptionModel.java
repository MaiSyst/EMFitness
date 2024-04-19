/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.models;

import java.util.List;

/**
 *
 * @author orion90
 */
public record SubscriptionModel(String subscriptionId, String label, int price, String type,List<ActivityModel> activities) {}
