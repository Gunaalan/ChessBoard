//package com.swiggy.service;
//
//import java.util.EnumMap;
//import java.util.List;
//import java.util.Map;
//
//import com.swiggy.data.DeliveryAgent;
//import com.swiggy.data.DistributionType;
//import com.swiggy.data.Order;
//
//
//public class DistributiionService {
//
//    private Map<DistributionType, DistributionStrategy> paymentServiceMap = new EnumMap<>(DistributionType.class);
//
//    public void register(DistributionType type, DistributionStrategy stretegy) {
//        paymentServiceMap.put(type, stretegy);
//    }
//
//
//    public void assignDa(Order order , List< DeliveryAgent> agentList , DistributionType type){
//
//        paymentServiceMap.get(type).distribute(order , agentList);
//
//    }
//
//}
