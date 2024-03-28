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
     ListNode lessHead=new ListNode(0);
     ListNode less=lessHead;

     ListNode greatHead=new  ListNode(0);
     ListNode great=greatHead;

     ListNode cur=head;

     while(cur!=null){
        if(cur.val<x){
            less.next=cur;
            less=less.next;
        }
        else{
            great.next=cur;
            great=great.next;
        }
        cur=cur.next;
     }
     great.next=null;
     less.next=greatHead.next;
   
   return lessHead.next;
    }
}