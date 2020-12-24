package com.leet.leetcode_dec_2020;

import org.junit.jupiter.api.Test;

import com.leet.leetcode_dec_2020.Dec24_Swap_Nodes_in_Pairs.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Dec24_TestCase {

    Dec24_Swap_Nodes_in_Pairs dec24_swap_nodes_in_pairs = new Dec24_Swap_Nodes_in_Pairs();


    @Test
    void leetcode_test_case_1(){

        //prepare
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;

        //execute
        ListNode result = dec24_swap_nodes_in_pairs.swapPairs(head);

        //check
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertEquals(4, result.next.next.val);
        assertEquals(3, result.next.next.next.val);

        assertEquals(second, result);
        assertEquals(head, result.next);
        assertEquals(fourth, result.next.next);
        assertEquals(third, result.next.next.next);
        assertNull(result.next.next.next.next);

    }

    @Test
    void leetcode_test_case_2(){

        //prepare
        ListNode head = null;

        //execute
        ListNode result = dec24_swap_nodes_in_pairs.swapPairs(head);

        //check
        assertEquals(head,result);

    }

    @Test
    void leetcode_test_case_3(){

        //prepare
        ListNode head = new ListNode(1);

        //execute
        ListNode result = dec24_swap_nodes_in_pairs.swapPairs(head);

        //check
        assertEquals(1,result.val);

        assertEquals(head,result);

        assertNull(result.next);

    }


}
