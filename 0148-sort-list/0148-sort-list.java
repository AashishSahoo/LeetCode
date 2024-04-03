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
    public ListNode sortList(ListNode head) {
        ListNode cur=head;
        List <Integer> l=new ArrayList<>();

        while(cur!=null){
            l.add(cur.val);
            cur=cur.next;
        }

       Collections.sort(l);

       ListNode dummy=new ListNode(0);
       ListNode temp=dummy;
       for(int i:l){
            temp.next=new ListNode(i);
            temp=temp.next;
       }

       return dummy.next;
    }
}