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
        ListNode prev=head;
        ListNode end=head;

        for(int i=0;i<n;i++)
        {
            end=end.next;
        }
        if(end==null) return head.next;
        end=end.next;
        while(end!=null)
        {
            end=end.next;
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}