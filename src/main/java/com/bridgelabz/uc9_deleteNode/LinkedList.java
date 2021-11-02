package com.bridgelabz.uc9_deleteNode;

public class LinkedList {
    Node head;
    Node tail;
    int size;

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
        size++;
    }

    /**
     * Method to delete the node in linked list
     *
     * @param key is the data value which should be deleted
     */
    public void deleteNode(int key) {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node temp = head;
            if (head.data == key) {
                head = head.next;
                size--;
            }
            while (temp != null && temp.next != null) {
                if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    size--;
                }
                temp = temp.next;
            }
        }
    }

    /**
     * Method size is to check length of the node
     */
    public void size() {
        System.out.println("Size of the linked list is : " + size);
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
        LinkedList list = new LinkedList();
        list.linkedList(56);
        list.linkedList(30);
        list.linkedList(40);
        list.linkedList(70);
        list.show();
        list.size();
        list.deleteNode(40);
        list.show();
        list.size();
    }
}
