public class ListNode {
    int val;
    ListNode next;
    ListNode head;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode reverseList = new ListNode();
        reverseList.head = head.next;
        reverseList.head.next = head;
        reverseList.head.next.next = null;
        head = head.next;
        while (head.next != null) {
            ListNode node = head.next;
            node.next = reverseList.head;
            reverseList.head = node;
            head = head.next;
        }
    return reverseList;
    }
}
