// https://leetcode.com/problems/merge-two-sorted-lists/

package day20;

class ListNode {
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

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists list = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(0, new ListNode());
        ListNode l2 = new ListNode();

        list.mergeTwoLists(l1, l2);

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        return null;
    }
}



