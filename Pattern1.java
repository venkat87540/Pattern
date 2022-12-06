package com.test2;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=5;
		for(int i=0;i<=m;i++){
			for(int j=m-i;j<m;j++) {
				System.out.print(" ");
			}
			for(int k=m;k>i;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}