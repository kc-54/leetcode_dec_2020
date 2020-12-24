package com.leet.leetcode_dec_2020;

public class Dec24_Swap_Nodes_in_Pairs {

    public ListNode swapPairs(ListNode head) {

        ListNode preHead = new ListNode();
        ListNode curHead = preHead;

        preHead.next = head;

        while(curHead.next != null && curHead.next.next != null){

            ListNode first_node = curHead.next;
            ListNode second_node = curHead.next.next;

            curHead.next = second_node;
            first_node.next = second_node.next;
            second_node.next = first_node;

            curHead = first_node;

        }


        return preHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
