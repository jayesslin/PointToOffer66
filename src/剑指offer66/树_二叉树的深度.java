package ��ָoffer66;


/*
 * ����һ�ö����������������ȡ��Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
 */
public class ��_����������� {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val=x;
		}
	}
	 public int TreeDepth(TreeNode root) {
	        if(root==null) return 0;
	        return Math.max(1+TreeDepth(root.left),1+TreeDepth(root.right));
	    }
}
