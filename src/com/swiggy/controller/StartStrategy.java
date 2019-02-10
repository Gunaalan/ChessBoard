//package com.swiggy.controller;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import com.swiggy.data.DeliveryAgent;
//import com.swiggy.data.Location;
//import com.swiggy.data.Order;
//import com.swiggy.service.BasicDistribution;
//import com.swiggy.service.DistributiionService;
//
//public class StartStrategy {
//
//    public static final long onehour= 60 * 60 * 1000;
//
//    public static void main(String []args){
//
//        DistributiionService service = new DistributiionService();
//
//        BasicDistribution basic = new BasicDistribution();
//        basic.setDistributionService(service);
//        basic.register();
//
//        List <Order> orderList = new ArrayList<>();
//
//
//        // String id, Location location, Date orderTime, DeliveryAgent aeliveryAgent
//
//        orderList.add(new Order("1", new Location(20.9697, 70.80322), new Date(System.currentTimeMillis() - (1 *onehour )) , null));
//        orderList.add(new Order("2", new Location(30.9697, 71.80322), new Date(System.currentTimeMillis() - (2 * onehour)) , null));
//
//
//
//        List<DeliveryAgent> agentList = new ArrayList<>();
//
//        //String id, Location currentLocation, Date lastOrderedTime, boolean isAssigned
//
//        agentList.add(new DeliveryAgent("d1",new Location(20.9658, 70.80323),new Date(System.currentTimeMillis() - (1 *onehour )), false));
//        agentList.add(new DeliveryAgent("d2",new Location(21.9658, 70.90323),new Date(System.currentTimeMillis() - (2 *onehour )), false));
//
//        agentList.add(new DeliveryAgent("d3",new Location(22.9658, 71.80323),new Date(System.currentTimeMillis() - (1 *onehour )), false));
//
//        agentList.add(new DeliveryAgent("d4",new Location(23.9658, 72.80323),new Date(System.currentTimeMillis() - (1 *onehour )), false));
//
//        for(Order order :orderList){
//            basic.distribute(order, agentList);
//        }
//
//        for(Order order :orderList){
//            System.out.println("----------------------------");
//            System.out.println("order id "+ order.getId());
//            if(order.getAeliveryAgent()!=null){
//                System.out.println("agent id "+ order.getAeliveryAgent().getId());
//            }
//        }
//
//
//    }
//}
