package ��ָoffer66;

public class ��_ǰ�������ؽ������� {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			this.val=x;
		}
	}
	public class solution{
		public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        TreeNode node = reConstructBinaryTree(pre,0, pre.length-1,in,0,in.length-1);
	        return node;
	    }
		private TreeNode reConstructBinaryTree(int[] pre, int prestart, int preend,int[] in, int instart, int inend) {
			//�ݹ��˳����������ʼ���ڽ�����λ�� ֱ���˳� ��Ҷ���ΪNULL
			if(prestart>preend||instart>inend) {
			return null;
			}
			//���ڵ� Ϊ���������һ�����
			TreeNode root = new TreeNode(pre[prestart]);
			//������������� 
			for(int i = instart; i<=inend; i++) 
				if (in[i]==pre[prestart]) {
					//���ǰ�����  ��������ĸ��ڵ���� Ϊ �������������� �� �ұ� Ϊ ������������
					//���� i��ֵ �� ǰ����λ�� ȷ�� ������ �� ǰ��ķ�Χ��   ��������ķ�Χ
					root.left=reConstructBinaryTree(pre,prestart+1,i-instart+prestart,in,instart,i-1);
					//���� i��ֵ �� ǰ����λ�� ȷ�� ������ �� ǰ��ķ�Χ��   ��������ķ�Χ
					root.right =reConstructBinaryTree(pre,i-instart+prestart+1,preend,in,i+1,inend);
				}	
			//ƥ����� ����ѭ�� ��Χ������ ���ڵ�
			return root;
			
		
		}
	}
}
