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
    public boolean isPalindrome(ListNode head) {
        List <Integer> a=new ArrayList<> ();
        ListNode cur=head;
        while(cur!=null){
            a.add(cur.val);
            cur=cur.next;
        }
        int start=0;
        int end=a.size()-1;
        while (start<end){
            if(  a.get(start).equals(a.get(end))){
                start++;
                end--;
            }
            else  return false;
        }
        return true;
    }
}