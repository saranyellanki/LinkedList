package com.bridgelabz.uc8_InsertAfter;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void insertAfter() {
        LinkedList list = new LinkedList();
        list.linkedList(56);
        list.linkedList(30);
        list.linkedList(70);
        list.show();
        list.insertAfter(30,40);
        list.show();
    }
}