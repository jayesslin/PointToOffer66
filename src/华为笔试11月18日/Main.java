package ��Ϊ����11��18��;

import java.util.Scanner;



public class Main {
	public static void c(int n, int m){  
        int r = 0;  
        for (int i = 2; i <= n; i++) {  
            r = (r + m) % i;  
        }  
        System.out.println(r+1);
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
		String s1 = in.nextLine();
		String[] s2 = s1.split(",");//��s1�ö��ŷָ����ŵ�s2������
		int a = Integer.parseInt(s2[0]);//���ַ����������
		int b = Integer.parseInt(s2[1]);
		c(a,b);	
			}
		        
	}
}
