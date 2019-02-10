package com.company.guna.Models;

import java.awt.print.Pageable;

/**
 * Created by guna on 02/04/18.
 */
public class StackModel {

    public static final int stack_max = 1000;

    int arr[] = new int[stack_max];
    int top;

    boolean isEmpty() {
        if (this.arr.length == 0) {
            return true;
        }
        return false;

    }

    boolean push(int newNumber) {
        if (top >= 0) {
            top++;
            arr[top] = newNumber;
            return true;
        } else {
            return false;
        }
    }

    int pop() {
        if (top > 0) {
            int temp = arr[top];
            System.out.println(temp + "popped");
            top = top - 1;
            return temp;
        }
        System.out.println("Stack underflow");
        return 0;
    }
}
