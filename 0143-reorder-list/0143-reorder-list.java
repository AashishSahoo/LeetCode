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
    public static ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode newNode=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }

    public void reorderList(ListNode head) {

        ListNode l=reverse(mid(head));
        ListNode temp=new ListNode(0);
        ListNode dummy=temp;
        int i=0;
        while(head!=null && l!=null){
            if(i%2!=0){
                dummy.next=l;
                l=l.next;
            }
            else{
                dummy.next=head;
                head=head.next;
            }
            dummy=dummy.next;
            i++;
        }
    }
}