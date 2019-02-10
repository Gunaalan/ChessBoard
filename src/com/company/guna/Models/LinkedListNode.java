package com.company.guna.Models;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * Created by guna on 30/03/18.
 */

public class LinkedListNode {
    private int data;

    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode() {
    }

    public int getData() {
        return data;
    }



    public void setData(int data) {
        this.data = data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
