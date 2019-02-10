//package com.swiggy.service;
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
//public abstract class DistributionStrategy {
//
//    public abstract void register();
//
//    public abstract void distribute(Order order , List< DeliveryAgent> agentList);
//
//
//    public  long findOrderDelay(Date orderTime) {
//        long milisec =  System.currentTimeMillis() - orderTime.getTime();
//        return (milisec/100/60);
//    }
//
//
//    public long findDeWaitingTime(Date lastOrderedTime) {
//
//       long milisec =  System.currentTimeMillis() - lastOrderedTime.getTime();
//        return (milisec/100/60);
//    }
//
//
//    public double findFirstMile(Location Orderlocation, Location DaLocation) {
//
//        double distance = DistanceCalculator.calculateDistance(Orderlocation , DaLocation);
//        double time =  (distance/Constants.SPEED);
//        return (time*Constants.FIRST_MILE);
//
//    }
//
//}
