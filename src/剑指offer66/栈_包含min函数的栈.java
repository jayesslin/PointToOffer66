package ��ָoffer66;

import java.util.Stack;

/*
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 * 
 */
public class ջ_����min������ջ {
	public class Solution {
		Stack<Integer> re = new Stack<Integer>();
		Stack<Integer> min = new Stack<Integer>();
		int mintmp= Integer.MAX_VALUE;
		public void push(int node) {
	    	re.push(node);
	        //ֻ��nodeС��mintmp������ջ�� ���Ұ�mintmp��Ϊ��ǰnodeֵ 
	    	// ����ѹ��ջ re = 3 4 5 2 5 1
	    	// ��СջΪ Min = 3 3 3 2 2 1 
	    	if(node<mintmp) {
	        	mintmp=node;
	        	min.push(node);
	        }else {
	        	min.push(mintmp);
	        }
	    }
	    //��Ҫ��ʱ��ջ ���ҵ�����Сջ��Ԫ�ع�ϵ
	    public void pop() {
	        re.pop();
	        min.pop();
	    }
	    public int top() {
	        return re.peek();
	    }
	    public int min() {
	        return min.peek();
	    }
	}
}
