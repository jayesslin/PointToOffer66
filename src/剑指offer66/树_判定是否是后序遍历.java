package ��ָoffer66;
/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 */
import model.TreeNode;
public class ��_�ж��Ƿ��Ǻ������ {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0) return false;
        if(sequence.length==1) return true;
        return judge(sequence,0,sequence.length-1);
    }
	public boolean judge(int[] x, int s,int e) {
		if(s>=e) return true;
		int i =s;
		while(x[i]<x[e]) {
			++i;
		}
		for(int j = i ; j<e;j++) {
			if(x[j]<x[e]) {
				return false;
			}
		}
		return judge(x,s,i-1)&&judge(x,i,e-1);
	}
}
	/* ʧ�ܷ���
	 * ˼·
	 * 1. �ҵ�root ���������һ��
	 * 2. �������������� �ҵ���һ������root����
	 * 3. �����������ұߵ��� ��������rootС�� ����false 
	 * 4.  �ݹ��������� ��1 ��2��3��
	 */
	/*public boolean VerifySquenceOfBST(int [] sequence ) {
		if(sequence==null) return true;
		int[] a = null,b=null;
		boolean res= true;
        int i = sequence[0];
        //������������ʼ��
        int x = sequence[0];
        int temp=0; 
        int pivot = sequence[sequence.length-1];
        for(;i<sequence.length-2;i++) {
        	if(sequence[i]>pivot) {
        		temp=i;
        		for (int j = temp;j<sequence.length-2;j++) {
                	if(sequence[j]<pivot) {
                		res = false;
                		break;
                	}
                }
        		break;
        	}
        }
        if(x!=0){
        //������
	        for(;x<temp;x++  ) {
	        	a[x]=sequence[x];
	        }
        }
        if(temp!=0) {
        //������
	        for(;temp<sequence.length-2;temp++) {
	        	b[temp]=sequence[temp];
	        }
        }
        res= VerifySquenceOfBST(a)&&VerifySquenceOfBST(b);
        
		return res;
    }*/

