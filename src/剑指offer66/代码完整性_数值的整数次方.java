package ��ָoffer66;
/*
 * 
 * ��Ҫ����  ������ָ��
 * 
 * */
public class ����������_��ֵ�������η� {
	public static double Power(double base, int exponent) {
        double result = base ;	
		for(int i =1; i<Math.abs(exponent);i++) {
        		result = result * base ; 
        	}
		if(exponent< 0 ) result  = 1 / result;
        	return result;
	  }
	public static void main(String args[]) {
		 System.out.println(Power(-2,-1));
	 }
}
