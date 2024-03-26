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
    ListNode dummy=new ListNode(0);
    dummy.next=head;

    ListNode fptr=dummy;
    ListNode sptr=dummy;

    for(int i=0;i<n;i++){
        sptr=sptr.next;
    }

    while(sptr.next!=null){
        fptr=fptr.next;
        sptr=sptr.next;
    }

    fptr.next=fptr.next.next;
    return dummy.next;

    }

}

//  ListNode temp=head;
//         ListNode dummy=new ListNode(0);
//         ListNode join=head;
//         dummy.next=head;
//         if(n==1){
//             return null;
//         }
//         int count=0;
//          while(temp!=null){
//             count++;
//             temp=temp.next;
//          }
//          if(count==2){
//             if(count-n==1){
//                 head.next=null;
//                 return head;
//             }
//             if(count-n==2){
//                 return head.next;
//             }
//          }
//          for(int i=1;i<count-n;i++){
//              join=join.next;
//          }
//          join.next=join.next.next;
//         return head;