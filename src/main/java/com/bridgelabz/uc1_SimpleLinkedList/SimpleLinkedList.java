package com.bridgelabz.uc1_SimpleLinkedList;

public class SimpleLinkedList {
    public static void main(String[] args) {
        Node firsNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        firsNode.next = secondNode;
        secondNode.next = thirdNode;
    }
}
