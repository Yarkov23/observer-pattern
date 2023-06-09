package org.yarkov.medium;

import org.yarkov.structure.ListNode;

public class NodeMerge {

    public ListNode mergeNodes(ListNode head) {
        return readThroughList(head.next, new ListNode());
    }

    private ListNode readThroughList(ListNode head, ListNode result) {

        if (head == null || head.next == null) {
            return result;
        } else if (head.val == 0) {
            result.next = new ListNode();
            readThroughList(head.next, result.next);
        } else {
            result.val += head.val;
            readThroughList(head.next, result);
        }

        return result;
    }

    public static void readListNode(ListNode head) {
        if (head == null)
            return;

        System.out.print(head.val + " ");
        head = head.next;

        readListNode(head);
    }

}
