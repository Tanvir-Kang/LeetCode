package MergeTwoLists;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * I think this is similar to a zipper
	 * You have the New list 'zipper' together the existing nodes
	 */
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode head = new ListNode();
	        ListNode dummyNode = head; 

	        
	        while(l1!=null && l2 !=null){
	            
	            if (l1.val <= l2.val ){
	                dummyNode.next = l1;
	                l1 = l1.next;
	            }
	            else{
	                dummyNode.next = l2;
	                l2 = l2.next;
	            }

	            dummyNode = dummyNode.next;
	          
	        }

	        if(l1 != null){
	            dummyNode.next=l1;
	        } else if( l2 != null){
	            dummyNode.next=l2;
	        }

	        return head.next;
	    }

}
