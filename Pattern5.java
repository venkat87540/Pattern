package com.test2;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		for(int i=1;i<=a;i++) {
			if(i==1 || i==a) {
				for(int j=1;j<=b;j++) {
					System.out.print("* ");
				}
			}
			else {
				if(i!=1 || i!=a) {
					System.out.print("* ");
					for(int j=2;j<b;j++) {
						System.out.print("  ");
					}for(int k=i-i;k>=0;k--) {
						System.out.print("*");
					}
				}
			}System.out.println("");

		}

	}

}
