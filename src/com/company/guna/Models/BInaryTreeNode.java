package com.company.guna.Models;

/**
 * Created by guna on 06/04/18.
 */

public class BInaryTreeNode {
    int data;

    public BInaryTreeNode left, right;

    public BInaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
