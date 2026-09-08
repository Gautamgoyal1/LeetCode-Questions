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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode small = new ListNode(0);
        ListNode larger = new ListNode(0);
        ListNode temp = head;
        ListNode s = small;
        ListNode l = larger;
        while(temp != null){
            if(temp.val < x){
                s.next = temp;
                s = s.next;
                if(temp != null) temp = temp.next;
            }
            else{
                l.next = temp;
                l = l.next;
                if(temp != null) temp = temp.next;
            }
        }
        s.next = larger.next;
        l.next = null;
        return small.next;
    }
}