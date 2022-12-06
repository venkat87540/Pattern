package com.test2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =7;
		for(int i=1;i<a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=a-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
