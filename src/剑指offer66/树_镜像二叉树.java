package ��ָoffer66;

import ��ָoffer66.��_ǰ�������ؽ�������.TreeNode;

/*
 * ��Ŀ����
���������Ķ�����������任ΪԴ�������ľ���
��������:
�������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class ��_��������� {
	 public void Mirror(TreeNode root) {
	       if (root!=null) { 
	       TreeNode tmp = root.left; 
	       root.left =  root.right;
	       root.right =  tmp;
	       Mirror(root.left);
	       Mirror(root.right);
	       }
	    }
	 
}
