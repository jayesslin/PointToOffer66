package ��ָoffer66;

public class ����_������k����� {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode FindKthToTail(ListNode head,int k) {
      //ע��߽�����
	   if (k<=0||head==null) return null;
       ListNode x= head;
       ListNode y= head;
       int i ;
       //��ѧ��ϵ
       for(i = 1;i < k ; i++) {
			if(x.next!= null){
               x = x.next;
           }else {
               return null;
           }
       }
       while(x.next!=null) {
       	x = x.next;
       	y=y.next;
       }
       return y;
   }
}
