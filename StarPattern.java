package com.test2;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		for(int i=0;i<m;i++) {
			for(int j=m-i;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
