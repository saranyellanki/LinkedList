package com.bridgelabz.uc7_findNode;

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
     * Method is used to find the node from linked list
     */
    public boolean search(int data){
        Node temp = head;
        boolean isPresent = false;
        if(head==null){
            System.out.println("Linked List is empty");
            return false;
        }else {
            while (temp!=null){
                if(temp.data==data){
                    isPresent = true;
                    break;
                }else {
                    temp = temp.next;
                }
            }
        }
        return isPresent;

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
        list.linkedList(70);
        list.show();
        list.search(78);
    }
}