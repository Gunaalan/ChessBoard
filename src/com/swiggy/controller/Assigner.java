//package com.swiggy.controller;
//
//import java.util.Date;
//import java.util.List;
//
//import com.swiggy.constant.Constants;
//import com.swiggy.data.DeliveryAgent;
//import com.swiggy.data.Location;
//import com.swiggy.data.Order;
//import com.swiggy.utils.DistanceCalculator;
//
//public class Assigner {
//
//
//
//    public void assignDelivaryAgent(Order order , List< DeliveryAgent> agentList){
//
//        long cumulativeMatric = Long.MAX_VALUE;
//        DeliveryAgent assigned = null;
//        for (DeliveryAgent agent : agentList) {
//            if ( !agent.isAssigned() ) {
//                double firstMile = findFirstMile(order.getLocation(), agent.getCurrentLocation());
//                double deWaitingTime = findDeWaitingTime(agent.getLastOrderedTime());
//                double orderDelay = findOrderDelay(order.getOrderTime());
//                double cumaltive = (firstMile - deWaitingTime - orderDelay);
//
//                if ( cumaltive < cumulativeMatric ) {
//                    assigned = agent;
//
//                }
//
//            }
//
//        }
//        if ( assigned != null ) {
//            order.setAeliveryAgent(assigned);
//            assigned.setAssigned(true);
//        }else{
//            System.out.println("no da for order "+ order.getId() );
//        }
//
//    }
//
//    private long findOrderDelay(Date orderTime) {
//        long milisec =  System.currentTimeMillis() - orderTime.getTime();
//        return (milisec/100/60);
//    }
//
//
//    private long findDeWaitingTime(Date lastOrderedTime) {
//
//       long milisec =  System.currentTimeMillis() - lastOrderedTime.getTime();
//        return (milisec/100/60);
//    }
//
//
//    private double findFirstMile(Location Orderlocation, Location DaLocation) {
//
//        double distance = DistanceCalculator.calculateDistance(Orderlocation , DaLocation);
//        double time =  (distance/Constants.SPEED);
//        return (time*Constants.FIRST_MILE);
//
//    }
//
//}
