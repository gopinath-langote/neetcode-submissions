/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;

        while (n > 0) {
            right = right.next;
            n--;
        }

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }

    int size(ListNode head) {
        int size = 0;
        ListNode node = head;

        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    ListNode remove(ListNode head, int index) {
        if (index == 0 || head == null || head.next == null) {
            return head == null? null : head.next;
        }
        ListNode node = head;
        while (index > 1 && node.next.next != null) {
            node = node.next;
            index--;
        }
        if (index == 1) {
            node.next = node.next.next;
        }
        return head;
    }
    
}
