package com.example.demo.lintcode.easy;

/**
 * Created by longmu on 25/01/2018.
 */
public class RemoveElements {

    // ListNode的简单定义
    //public class ListNode {
    //    int val;
    //    ListNode next;
    //    ListNode(int x) { val = x;}
    //}

    public static class ListNode {
        ListNode next;
        int val;
        ListNode(int x) {val = x;}
    }

    public static ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (head == null) {return null;}

        head.next = removeElements(head.next,val);

        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode l = removeElements(l1,3);
        System.out.println(l.val);
    }
}
