package com.bridgelabz.uc2_AddLinkedList;

public class LinkedList {
    Node head;

    /**
     * method to add linked list
     * push data where first in will be the last node
     *
     * @param data integer to be added in linked list
     */
    public void add(int data) {
        Node addNode = new Node(data);
        if (head == null) {
            head = addNode;
        } else {
            Node temp = head;
            head = addNode;
            addNode.next = temp;
        }
    }

    /**
     * show method is to display the linked list data
     */
    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList linkedListObj = new LinkedList();
        linkedListObj.add(70);
        linkedListObj.add(30);
        linkedListObj.add(56);
        linkedListObj.show();
    }
}
