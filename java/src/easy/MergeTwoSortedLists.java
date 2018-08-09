package easy;

import utils.ListNode;

/**
 * Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 */
class MergeTwoSortedLists {

  public static void main(String[] args) {
    ListNode a = new ListNode(1);
    a.next = new ListNode(2);
    a.next.next = new ListNode(4);

    ListNode b = new ListNode(1);
    b.next = new ListNode(3);
    b.next.next = new ListNode(4);

    ListNode.printListNode(mergeTwoLists(a, b));
  }

  private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode cur = new ListNode(0);
    ListNode head = cur;
    while (l1 != null || l2 != null) {
      if (l2 != null && (l1 == null || l1.val >= l2.val)) {
        cur.next = new ListNode(l2.val);
        l2 = l2.next;
        cur = cur.next;
      }
      if (l1 != null && (l2 == null || l2.val >= l1.val)) {
        cur.next = new ListNode(l1.val);
        l1 = l1.next;
        cur = cur.next;
      }
    }
    return head.next;
  }
}
