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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode firstStart = head;
        ListNode middle = middle(head);
        ListNode secondStart = middle.next;
        middle.next = null;

        ListNode reversedStart = reversed(secondStart);

        ListNode newStart = mergeAlternative(firstStart, reversedStart);
        head = newStart;
    }
    ListNode reversed(ListNode givenNode) {
        if (givenNode == null || givenNode.next == null) {
            return givenNode;
        }
        ListNode node = givenNode.next;
        ListNode prev = givenNode;
        givenNode.next = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
        }
        givenNode = prev;
        return givenNode;
    }
    private ListNode middle(ListNode h) {
        ListNode slow = h, fast = h;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    ListNode mergeAlternative(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (first != null && second != null) {
            current.next = first;
            first = first.next;
            current = current.next;

            current.next = second;
            second = second.next;
            current = current.next;
        }
        current.next = first;
        return dummy.next;
    }
}
