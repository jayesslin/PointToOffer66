package ��ָoffer66;
/*
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
 *�������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
 *n<=39
 */
public class 쳲��������� {
	public int Fibonacci(int n) {
        if (n==0) return 0;
        if(n==1)return 1;
        else return Fibonacci(n-1)+Fibonacci(n-2);
    }
}
