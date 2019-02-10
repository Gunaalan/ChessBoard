package com.swiggy.data;

import java.util.Date;

public class Order {

    private String id;
    private Location location;
    
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    private Date orderTime;
    
    private DeliveryAgent aeliveryAgent;
    
    public DeliveryAgent getAeliveryAgent() {
        return aeliveryAgent;
    }
    public void setAeliveryAgent(DeliveryAgent aeliveryAgent) {
        this.aeliveryAgent = aeliveryAgent;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
  
    public Date getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
    @Override
    public String toString() {
        return "Order [id=" + id + ", location=" + location + ", orderTime=" + orderTime + "]";
    }
    public Order(String id, Location location, Date orderTime, DeliveryAgent aeliveryAgent) {
        super();
        this.id = id;
        this.location = location;
        this.orderTime = orderTime;
        this.aeliveryAgent = aeliveryAgent;
    }
    
    
    public Order(){
        
    }
    
    
    
}
