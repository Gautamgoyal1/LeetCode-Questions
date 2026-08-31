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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {-1,-1};
        if(head.next.next == null) return arr;
        int start = 0;
        int prev = 0;
        int value = head.val;
        int maxi = 0;
        int mini = Integer.MAX_VALUE;
        head = head.next;
        int count = 2;
        while(head.next != null){
            int curr = head.val;
            int future = head.next.val;
            if(curr > value && curr > future){
                if(prev == 0){
                    prev = count;
                    start = count;
                }
                else {
                    maxi = Math.max(maxi,count - start);
                    mini = Math.min(mini,count-prev);
                    prev =  count;
                }
            }
            else if(curr < value && curr < future){
                if(prev == 0){
                    prev = count;
                    start = count;
                }
                else {
                    maxi = Math.max(maxi,count - start);
                    mini = Math.min(mini,count-prev);
                    prev =  count;
                }
            }
            count++;
            value = curr;
            head = head.next;
        }
        if(mini == Integer.MAX_VALUE && maxi == 0){
            return new int[] {-1,-1};
        }
        return new int[] {mini,maxi};
    }
}