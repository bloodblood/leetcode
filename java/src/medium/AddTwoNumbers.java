package medium;

import utils.ListNode;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);

        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);
        ListNode ans = addTwoNumbers(node1, node2);
        ListNode.printListNode(ans);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode ans = temp;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
            temp = temp.next;
        }
        return ans.next;
    }


}
