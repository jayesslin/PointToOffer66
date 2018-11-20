package ��ָoffer66;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ��������_��������_���������� {
	public static Map<Integer,Integer> numIslands(int[][] grid) {
		int num = 0 ;
		//ͳ����������
		int area =  0;
		int tmp;
		Map<Integer,Integer> res= new HashMap<Integer,Integer>();
		if(grid==null)return res;
		for(int i =0 ; i< grid.length;i++) {
			for (int j =0 ; j < grid[i].length;j++) {
				if (grid[i][j]==1) {
					num++;
					//grid = account(grid,i,j);
					//System.out.println(grid[i][j]);
					area =  Math.max(accountArea(grid,i,j), area);
				}
			}
		}
		res.put(num, area);
		return res;
	}
	public static int[][] account(int[][] grid, int i ,int j) {
		grid[i][j] = 0; 
		//������
		if(i>0 && grid[i-1][j]==1) {
			grid=account(grid,i-1,j);
		}
		if(j<grid[i].length-1 && grid[i][j+1]==1) {
			grid=account(grid,i,j+1);
		}
		if(j>0 &&grid[i][j-1]==1) {
			grid=account(grid,i,j-1);
		}
		if(i<grid.length-1 && grid[i+1][j]==1) {
			grid=account(grid,i+1,j);
		}
		return grid; 
	}
	//������������
	public static int accountArea(int[][] grid,int i,int j ) {
		//���ó�������  �ж��ĸ��ߵ�Խ������  �� ������� 1  ֱ�ӷ���0 
		if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=1) return 0;
		grid[i][j]=0;
		return 1+accountArea(grid,i-1,j)+accountArea(grid,i+1,j)+accountArea(grid,i,j+1)+accountArea(grid,i,j-1);
	}
	
	public static void main(String[] args) {
		int[][] a = {	{1,1,1,0,0},
						{0,1,0,0,0},
						{0,1,1,1,1},
						{0,0,0,0,0}, 
						{0,0,0,0,1}
					};
		int[][] b = {
				{1,1,1},{0,1,0}
		};
		/*int[][] c = null ;
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int i= in.nextInt();
			int j= in.nextInt();
			c= new int[i][j];
			for(int x =0 ; x<i;x++) {
				for (int y =0 ; y<j;y++) {
					System.out.print("��������"); 
					c[x][y] = in.nextInt();
				}
			}System.out.println(numIslands(c));*/
		
			/*for(int x =0 ; x<i;x++) {
				for (int y =0 ; y <j;y++) {
					System.out.print(c[x][y]+""); 
				}System.out.println(); 
			}*/
		
		//System.out.println(numIslands(a));
		Map<Integer,Integer> res = numIslands(a);
		for(int num : res.keySet()) {
			int area = res.get(num);
			System.out.println("�������"+ num+ " ������ "+area);
		}
		//System.out.println(numIslands(a));
	}
}
