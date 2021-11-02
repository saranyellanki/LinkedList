package com.bridgelabz.uc8_InsertAfter;

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
     * Method is used to insert the node in linked list
     */
    public void insertAfter(int insertAfter, int insertData){
        Node temp = head;
        Node insertNode = new Node(insertData);
        if(head==null){
            System.out.println("Linked List is empty");
        }else{
            while(temp!=null){
                if(temp.data==insertAfter){
                    Node node = temp.next;
                    temp.next = insertNode;
                    insertNode.next = node;
                    temp = node;
                }else {
                    temp = temp.next;
                }
            }
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
        LinkedList list = new LinkedList();
        list.linkedList(56);
        list.linkedList(30);
        list.linkedList(70);
        list.show();
        list.insertAfter(30,40);
        list.show();
    }
}