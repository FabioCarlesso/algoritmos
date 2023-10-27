package com.fabiocarlesso.linkedlist;

public class LinkedListFunctions {
    private LinkedListFunctions(){
        throw new IllegalStateException("Utility class");
    }
    public static ListNode reverseList(ListNode head) {
        return rev(head, null);
    }

    private static ListNode rev(ListNode node, ListNode pre) {
        if (node == null) return pre;
        ListNode temp = node.next;
        node.next = pre;
        return rev(temp, node);
    }
}
