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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists ==null || lists.length==0){
            return null;
        }

        List <Integer> l=new ArrayList <>() ;
        for( ListNode list:lists){
            while(list!=null){
                l.add(list.val);
                list=list.next;
            }
        }
        Collections.sort(l);

        ListNode head= new ListNode(0);
        ListNode temp=head;


        for (int data:l){
            temp.next=new ListNode(data);
            temp=temp.next;
        }

        return head.next;

    }
}