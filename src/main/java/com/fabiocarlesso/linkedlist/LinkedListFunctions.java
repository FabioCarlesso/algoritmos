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

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
}
