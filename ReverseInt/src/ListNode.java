public class ListNode {
    int val;
    ListNode next;
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
        ListNode reverseListNext = new ListNode(head.val);
        ListNode reverseList = new ListNode(head.next.val, reverseListNext);
        head = head.next.next;
        while (head != null) {
            ListNode currentNode = new ListNode(head.val, reverseList);
            reverseList = currentNode;
            head = head.next;
        }
    return reverseList;
    }
}
