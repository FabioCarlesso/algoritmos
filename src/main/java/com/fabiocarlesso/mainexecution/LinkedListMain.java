package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.linkedlist.LinkedListFunctions;
import com.fabiocarlesso.linkedlist.ListNode;

public class LinkedListMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";
    public static final String TARGET = "Target: ";
    private LinkedListMain(){
        throw new IllegalStateException("Utility class");
    }
    public static void linkedListMain(){
        System.out.println("\n\nLinked List");
        reverseListMain();
    }
    private static void reverseListMain() {
        System.out.println("\nReverse Linked List");
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        System.out.println("\n"+RESULT_CASE_1);
        String stringList = "List: ";
        System.out.println(stringList);
        list.printList(list);
        ListNode listReverse = LinkedListFunctions.reverseList(list);
        String stringReverse = "\nReverse: ";
        System.out.println(stringReverse);
        list.printList(listReverse);
        System.out.println("\n"+RESULT_CASE_2);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        System.out.println(stringList);
        list.printList(list2);
        ListNode listReverse2 = LinkedListFunctions.reverseList(list2);
        System.out.println(stringReverse);
        list.printList(listReverse2);
        System.out.println("\n"+RESULT_CASE_3);
        ListNode list3 = new ListNode();
        System.out.println(stringList);
        list.printList(list3);
        ListNode listReverse3 = LinkedListFunctions.reverseList(list3);
        System.out.println(stringReverse);
        list.printList(listReverse3);
    }
}
