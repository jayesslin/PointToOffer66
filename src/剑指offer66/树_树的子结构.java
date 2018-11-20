package ��ָoffer66;

import ��ָoffer66.��_ǰ�������ؽ�������.TreeNode;

/*
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 */
public class ��_�����ӽṹ {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	//���ñ�ʶ�� ��Ϊһ��ƥ��ɹ�result����Ϊtrue��
    	//ʣ�µĴ��벻��ִ�У����ƥ�䲻�ɹ���Ĭ�Ϸ���false
    	boolean res = false;
    	
    	if (root1 != null && root2!=null) {
			if (root1.val==root2.val) {
		    	res =  HasSameNode(root1, root2);
		    }
			if(!res) {
				//�ݹ�˷��� �������Ƶ��������
				res = HasSubtree(root1.left, root2);
			}
			if(!res) {
				//�ݹ�˷��� �������Ƶ������Ҳ�
				res= HasSubtree(root1.right, root2);
			}
    	}   
		return res;
    }
    public boolean HasSameNode(TreeNode root1,TreeNode root2) {
    	if (root1 ==null && root2 !=null) return false;
    	if (root2==null) return true;
    	//����  �� ���2�� Ϊ�� ˵�� 2���������� ��
    	//else if (root1 !=null && root2 ==null) return false;
    	//ǧ��ע�� �����ǱȽ�ֵ����������
    	if (root1.val!=root2.val) return false ;
    	return HasSameNode(root1.left,root2.left) && HasSameNode(root1.right,root2.right);
    }
}
