package ��ָoffer66;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * 
 */
public class ��_�����ӡ������ {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		//����һ������ �Ƚ����
		Queue<TreeNode> tmp = (Queue<TreeNode>) new LinkedList<TreeNode>();
		ArrayList<Integer> res= new ArrayList<Integer>();
		//��һ����������
		if (root==null) return res;
		//��root������� 
		tmp.add(root);
		//������в��գ� �� �����ڵ�ֵȡ���� ��������res �����ҰѸý����ӽڵ�������
		while(!tmp.isEmpty()) {
			TreeNode root1 = tmp.poll();
			res.add(root1.val);
			if(root1.left!=null) tmp.add(root1.left);
			if(root1.right!=null)tmp.add(root1.right);
		}
		return res;
	        
	    }
	
		
	}

