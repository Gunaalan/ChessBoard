//package com.swiggy.service;
//
//import java.util.List;
//
//import com.swiggy.data.DeliveryAgent;
//import com.swiggy.data.DistributionType;
//import com.swiggy.data.Order;
//
//public class BasicDistribution extends DistributionStrategy{
//
//    DistributiionService DistributionService;
//
//    public DistributiionService getDistributionService() {
//        return DistributionService;
//    }
//    public void setDistributionService(DistributiionService distributionService) {
//        DistributionService = distributionService;
//    }
//    @Override
//    public void register() {
//        DistributionService.register(DistributionType.BASIC, this);
//    }
//    @Override
//    public void distribute(Order order , List< DeliveryAgent> agentList) {
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
//
//
//}
