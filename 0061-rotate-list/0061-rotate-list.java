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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)return head;

        ListNode  tail=head;
        int cnt=1;
        while(tail.next!=null){
            tail=tail.next;
            cnt++;
        }
        k=k%cnt;
        tail.next=head;
        for(int i=1;i<=cnt-k;i++){
            tail=tail.next;
            head=head.next;
        }
        tail.next=null;
        return head;
        
    }
}