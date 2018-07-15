package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    // for test
    public static void printListNode(ListNode node) {
        if (node == null) System.out.println("node is null");
        List<Integer> nums = new ArrayList<>();
        while (node != null) {
            nums.add(node.val);
            node = node.next;
        }
        System.out.println(Arrays.toString(nums.toArray()));
    }
}
