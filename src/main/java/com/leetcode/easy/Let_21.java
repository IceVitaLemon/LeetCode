package com.leetcode.easy;

public class Let_21 {
    public static void main(String[] args){

    }

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode tmp = new ListNode(0);
        ListNode result = tmp;

        while (l1 != null && l2 != null){
            if (l1.val > l2.val){
                tmp.next = new ListNode(l2.val);
                tmp = tmp.next;
                l2 = l2.next;
            }else {
                tmp.next = new ListNode(l1.val);
                tmp = tmp.next;
                l1 = l1.next;
            }
        }

        while (l1 != null){
            tmp.next = new ListNode(l1.val);
            tmp = tmp.next;
            l1 = l1.next;
        }

        while (l2 != null){
            tmp.next = new ListNode(l2.val);
            tmp = tmp.next;
            l2 = l2.next;
        }

        return result.next;
    }
}
