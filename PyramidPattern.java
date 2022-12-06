package com.test2;
import java.util.Scanner;
public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int i = 1; i <= a ;i++) {
			for(int j=a;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int m=1;m<i;m++) {
				System.out.print("*");
			}System.out.println("");
			//for(int l=i;l<a;l++) {
				//System.out.print(" ");

			//}
		}s.close();


	}

}
