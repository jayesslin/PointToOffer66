package ��ָoffer66;

public class ����_����ת {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	} 
	/*
	 * ����ָ�벻ͣά��һ���Է�ת����
	 */
	public ListNode ReverseList(ListNode head) {
		ListNode next ,pre;
		pre = null;
		if (head == null)
            return head;
		while (head!=null) {
			next = head .next;
			head.next = pre;
			pre = head; 
			head = next ; 
		}
		return pre;
	        
	    }
}
