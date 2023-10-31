package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.linkedlist.LinkedListFunctions;
import com.fabiocarlesso.linkedlist.ListNode;

public class LinkedListMain {
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";
    public static final String LIST_STRING = "List: ";

    private LinkedListMain(){
        throw new IllegalStateException("Utility class");
    }
    public static void linkedListMain(){
        System.out.println("\n\nLinked List");
        reverseListMain();
        mergeTwoListsMain();
        reorderListMain();
    }
    private static void reverseListMain() {
        System.out.println("\nReverse Linked List");
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        System.out.println("\n"+RESULT_CASE_1);
        System.out.println(LIST_STRING);
        list.printList(list);
        ListNode listReverse = LinkedListFunctions.reverseList(list);
        String stringReverse = "\nReverse: ";
        System.out.println(stringReverse);
        list.printList(listReverse);
        System.out.println("\n"+RESULT_CASE_2);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        System.out.println(LIST_STRING);
        list.printList(list2);
        ListNode listReverse2 = LinkedListFunctions.reverseList(list2);
        System.out.println(stringReverse);
        list.printList(listReverse2);
        System.out.println("\n"+RESULT_CASE_3);
        ListNode list3 = new ListNode();
        System.out.println(LIST_STRING);
        list.printList(list3);
        ListNode listReverse3 = LinkedListFunctions.reverseList(list3);
        System.out.println(stringReverse);
        list.printList(listReverse3);
    }
    private static void mergeTwoListsMain() {
        System.out.println("\nMerge Two Sorted Lists");
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(3);
        System.out.println("\n"+RESULT_CASE_1);
        System.out.println(LIST_STRING);
        list.printList(list);
        System.out.println("\n"+LIST_STRING);
        list.printList(list2);
        ListNode listMerge = LinkedListFunctions.mergeTwoLists(list, list2);
        String stringListMerge = "\nMerge: ";
        System.out.println(stringListMerge);
        list.printList(listMerge);
        System.out.println("\n"+RESULT_CASE_2);
        list = new ListNode();
        list2 = new ListNode();
        System.out.println(LIST_STRING);
        list.printList(list);
        System.out.println("\n"+LIST_STRING);
        list.printList(list2);
        ListNode listMerge2 = LinkedListFunctions.mergeTwoLists(list, list2);
        System.out.println(stringListMerge);
        list.printList(listMerge2);
        System.out.println("\n"+RESULT_CASE_3);
        list = new ListNode();
        list2 = new ListNode(0);
        System.out.println(LIST_STRING);
        list.printList(list);
        System.out.println("\n"+LIST_STRING);
        list.printList(list2);
        ListNode listMerge3 = LinkedListFunctions.mergeTwoLists(list, list2);
        System.out.println(stringListMerge);
        list.printList(listMerge3);
    }
    private static void reorderListMain() {
        System.out.println("\nReorder List");
        ListNode list = new ListNode(1);
        list.createSequenceList(1,4);
        System.out.println("\n"+RESULT_CASE_1);
        System.out.println(LIST_STRING);
        list.printList(list);
        String stringReorder = "\nReorder: ";
        System.out.println(stringReorder);
        LinkedListFunctions.reorderList(list);
        list.printList(list);
        System.out.println("\n"+RESULT_CASE_2);
        ListNode list2 = new ListNode(1);
        list2.createSequenceList(1,5);
        System.out.println(LIST_STRING);
        list.printList(list2);
        System.out.println(stringReorder);
        LinkedListFunctions.reorderList(list2);
        list.printList(list2);
    }
}
