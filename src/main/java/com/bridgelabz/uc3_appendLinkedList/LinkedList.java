package com.bridgelabz.uc3_appendLinkedList;

public class LinkedList {
    Node head;
    Node tail;

    /**
     * This method is used to append the data in linked list
     *
     * @param data is integer which appends in linked list
     */
    public void append(int data) {
        Node appendNode = new Node(data);
        if (head == null) {
            head = appendNode;
            tail = appendNode;
        } else {
            tail.next = appendNode;
            tail = tail.next;
        }
    }

    /**
     * Show method is to display the linked list data
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
        linkedListObj.append(56);
        linkedListObj.append(30);
        linkedListObj.append(70);
        linkedListObj.show();
    }
}
