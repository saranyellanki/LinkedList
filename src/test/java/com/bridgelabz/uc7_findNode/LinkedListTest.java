package com.bridgelabz.uc7_findNode;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void search() {
        LinkedList list = new LinkedList();
        list.linkedList(56);
        list.linkedList(30);
        list.linkedList(70);
        Assert.assertTrue(list.search(30));
    }
}