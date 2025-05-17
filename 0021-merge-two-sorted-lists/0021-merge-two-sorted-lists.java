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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null && list2==null){
            return null;
        }
        else{
            ListNode result=new ListNode();
            result.val=0;

            ListNode temp=null;
            ListNode head=result;
        
            while(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    temp=list1.next;
                    head.next=list1;
                    list1=temp;

                }
                else{
                   temp=list2.next;
                    head.next=list2;
                    list2=temp;
                }
                head=head.next;
            }
            while(list1!=null){
                temp=list1.next;
                head.next=list1;
                list1=temp;
                head=head.next;
            }
            while(list2!=null){
                temp=list2.next;
                head.next=list2;
                list2=temp;
                head=head.next;
            }
            return result.next;
            
        }
            
            
        
    }
}