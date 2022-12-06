package com.test2;
import java.util.Scanner;
public class ButterflyPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=i*2;k<=m*2-1;k++) {
			System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=m-1;i++) {
			for(int j=m-1;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i*2;k++) {
				System.out.print(" ");
				
			}
			for(int l=m-1;l>=i;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
	}
}