package com.bridgelabz.uc5_deleteFirstNode;

public class LinkedList {
    Node head;
    Node tail;

    /**
     * method to create a linked list
     *
     * @param data is the integer value of the node
     */
    public void linkedList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    /**
     * Method is used to pop the head node
     */
    public void pop() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = temp.next;
        }
    }

    /**
     * Show method is used to display the data in the nodes
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
        linkedListObj.linkedList(56);
        linkedListObj.linkedList(30);
        linkedListObj.linkedList(70);
        linkedListObj.show();
        linkedListObj.pop();
        linkedListObj.show();
    }
}
