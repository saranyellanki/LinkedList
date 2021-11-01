package com.bridgelabz.uc4_insertLinkedList;

public class LinkedList {
    Node head;
    Node tail;

    /**
     * Method to create linked list
     *
     * @param data is integer data assigned in linked list
     */
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
        }
    }

    /**
     * Method to insert between two nodes
     *
     * @param x integer value of the adjacent node
     * @param y integer value of the adjacent node
     * @param z integer value of inserted node
     */
    public void insertBetween(int x, int y, int z) {
        Node newNode = new Node(z);
        Node temp = head;
        while (temp.next != null) {
            if ((temp.data == x && temp.next.data == y) || (temp.data == y && temp.next.data == x)) {
                Node afterZ = temp.next;
                temp.next = newNode;
                temp.next.next = afterZ;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * Method to display the linked list
     */
    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList linkedListObj = new LinkedList();
        linkedListObj.insert(56);
        linkedListObj.insert(70);
        linkedListObj.show();
        linkedListObj.insertBetween(56, 70, 30);
        linkedListObj.show();
    }
}
