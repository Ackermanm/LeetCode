/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class L02AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l2.next != null) {
            if (l1.val + l2.val < 10) {
                return new ListNode(l1.val + l2.val, addTwoNumbers(new ListNode(0), l2.next));
            } else {
                return new ListNode((l1.val + l2.val) % 10, addTwoNumbers(new ListNode(1), l2.next));
            }
        }

        if (l1.next != null && l2.next == null) {
            if (l1.val + l2.val < 10) {
                return new ListNode(l1.val + l2.val, addTwoNumbers(new ListNode(0), l1.next));
            } else {
                return new ListNode((l1.val + l2.val) % 10, addTwoNumbers(new ListNode(1), l1.next));
            }
        }

        if (l1.next == null && l2.next == null) {
            if (l1.val + l2.val < 10) {
                return new ListNode(l1.val + l2.val);
            } else {
                return new ListNode((l1.val + l2.val) % 10, new ListNode(1));
            }
        }

        ListNode result = new ListNode();
        if (l1.val + l2.val < 10) {
            result = new ListNode(l1.val + l2.val, addTwoNumbers(l1.next, l2.next));
        } else {
            l1.next.val = l1.next.val + 1;
            result = new ListNode((l1.val + l2.val) % 10, addTwoNumbers(l1.next, l2.next));
        }

        return result;
    }

    public class ListNode {
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
