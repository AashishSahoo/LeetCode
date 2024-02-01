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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr= head;
        // ListNode ptr2=ptr1.next;
       
        while(ptr!=null && ptr.next!=null){
           if(ptr.val==ptr.next.val){
               ptr.next=ptr.next.next;
           }    else{
           ptr=ptr.next;

           }

        }
        return head;
    }
}