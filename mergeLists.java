/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//Runtime: 1 ms, faster than 20.83% of Java online submissions for Merge Two Sorted Lists.
//Memory Usage: 39.5 MB, less than 17.17% of Java online submissions for Merge Two Sorted Lists.

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3;
        if (l1 == null || l2 == null) {
            if (l1 == null && l2 == null) {
                return null;
            }
            if (l1 == null) {
                return l2;
            }
            return l1;
        }
        if (l1.val <= l2.val) {
            l3 = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            l3 = new ListNode(l2.val);
            l2 = l2.next; 
        }       
        ListNode temp = l3;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) { 
                ListNode temp2 = new ListNode(l1.val);
                temp.next = temp2;
                temp = temp.next;
                l1 = l1.next;
            } else {
                ListNode temp2 = new ListNode(l2.val);
                temp.next = temp2;
                temp = temp.next;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            ListNode temp2 = new ListNode(l1.val);
            temp.next = temp2;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode temp2 = new ListNode(l2.val);
            temp.next = temp2;
            temp = temp.next;
            l2 = l2.next; 
        }
        return l3;
    }
}