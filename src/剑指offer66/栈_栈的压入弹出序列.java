package ��ָoffer66;

import java.util.Stack;
/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ
 * ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 */
public class ջ_ջ��ѹ�뵯������ {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	    if(pushA.length==0||popA.length==0) {return false;}
	    if(pushA.length!=popA.length) {return false;}
		int i =0 ;
	    int j =popA.length-1;
	    boolean res = true;
		while (i<pushA.length-1) {
	    	  if(pushA[i++]!=popA[j--]) { res= false;} 
	      }
	     return res;
    }
	public static void main(String args[]) {
		int[] a= {};
		int[] b= {1,2};
		System.out.println(IsPopOrder(a,b));
	}
}
