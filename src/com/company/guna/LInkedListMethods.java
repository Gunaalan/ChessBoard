package com.company.guna;

import com.company.guna.Models.LinkedListNode;
import sun.awt.image.ImageWatched;

/**
 * Created by guna on 30/03/18.
 */
public class LInkedListMethods {


    public static void printList(LinkedListNode head) {
        LinkedListNode iter = head;
        System.out.println("your linked list is");
        while (iter != null) {
            System.out.print(iter.getData() + "->");
            iter = iter.getNext();
        }
        System.out.println("");
        return;

    }

    public static LinkedListNode addToLinkedList(LinkedListNode head, LinkedListNode node, int pos) {
        LinkedListNode iter = head;
        for (int i = 1; i < pos; i++) {
            if (i == pos - 1) {
                LinkedListNode temp = iter.getNext();
                System.out.println("adding node -> " + node.getData());
                iter.setNext(node);
                node.setNext(temp);
            }
            iter = iter.getNext();
        }
        return head;
    }

    public static void deleteNodeAtPosition(LinkedListNode head, int pos) {
        LinkedListNode iter = head;
        for (int i = 1; i < pos; i++) {
            if (i == pos - 1) {
                LinkedListNode temp = iter.getNext();
                System.out.println("deleting node -> " + temp.getData());
                iter.setNext(iter.getNext().getNext());
            }
            iter = iter.getNext();
        }
        return;
    }

    public static void reverseALinkedList(LinkedListNode head) {
        LinkedListNode iter = head;
        LinkedListNode prev = head;
        while (iter != null) {
            LinkedListNode nextNode = iter.getNext();
            iter.setNext(prev);
            prev = iter;
            iter = nextNode;
        }
        System.out.println("your linked list is reversed");
        printList(head);
    }

    public static void detectLoopAndFindIntersectionPoint(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode iter1 = head1;
        LinkedListNode iter2 = head2;
        LinkedListNode longHeadNode = null;
        LinkedListNode stuckNode = null;
        LinkedListNode smallHeadNode = null;

        while (iter1 != null && iter2 != null) {
            if (iter1.getData() == iter2.getData()) {
                System.out.println("Both linked list are of same length" + iter1.getData());
                System.out.println("this is the itersection node " + iter1.getData());
                return;
            }
            iter1 = iter1.getNext();
            iter2 = iter2.getNext();
        }
        if (iter1 == null && iter2 != null) {
            longHeadNode = head2;
            stuckNode = iter2;
            smallHeadNode = head1;
        } else if (iter1 != null && iter2 == null) {
            longHeadNode = head1;
            stuckNode = iter1;
            smallHeadNode = head2;
        }

        while (longHeadNode != null && stuckNode != null) {
            longHeadNode = longHeadNode.getNext();
            stuckNode = stuckNode.getNext();
        }

        while(longHeadNode != null && smallHeadNode != null) {
            if(longHeadNode.getData() == smallHeadNode.getData()) {
                System.out.println("The intersection point is " + longHeadNode.getData());
                return ;
            }
            longHeadNode = longHeadNode.getNext();
            smallHeadNode = smallHeadNode.getNext();
        }
    }

    public static LinkedListNode forLinkedListFromArray(int arr[]) {
        LinkedListNode head = new LinkedListNode(arr[0]);
        LinkedListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            LinkedListNode newNode = new LinkedListNode(arr[i]);
            temp.setNext(newNode);
            temp = newNode;
        }
        return head;
    }

    public static void StringTo(StringBuilder a ) {
       a = a.append("PPOP");
    }
}
