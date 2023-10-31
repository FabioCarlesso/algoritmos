package com.fabiocarlesso.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
    public void append(int newData)
    {
        ListNode newNode = new ListNode(newData);

        if (next == null) {
            next = newNode;
            return;
        }

        ListNode last = next;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }
    public void createSequenceList(int first, int last){
        first++;
        while (first<=last) {
            if(next == null)
                next = new ListNode(first);
            else
                next.append(first);
            first++;
        }
    }
}
