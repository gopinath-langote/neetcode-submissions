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
        int size = size(head);
        int leftN = size - n;
        // if (leftN == 0) {
        //     return removeFirst(head);
        // }
        return remove(head, leftN);
    }

    ListNode removeFirst(ListNode head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
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
            return removeFirst(head);
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
