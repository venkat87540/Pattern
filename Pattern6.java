package com.test2;
import java.util.Scanner;
public class Pattern6 {
	/*
	 * 
	 * bbbb*bbbb
	   bbb***bbb
       bb*****bb
       b*******b
	   *********
       b*******b
       bb*****bb
       bbb***bbb
       bbbb*bbbb
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int i=0;i<=a/2;i++) {
			for(int j=a/2 ;j>i;j--) {
				System.out.print("b");
			}for(int k=0;k<=i;k++) {
				System.out.print("*");
			}for(int m=0;m<i;m++) {
				System.out.print("*");
			}for(int n=a/2;n>i;n--) {
				System.out.print("b");
			}
			System.out.println("");

		}
		
		for(int i=0;i<a/2;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("b");
			}for(int k=a/2;k>i;k--) {
				System.out.print("*");
			}for(int m=(a/2)-1;m>i;m--) {
				System.out.print("*");
			}for(int n=0;n<=i;n++) {
				System.out.print("b");
			}
			System.out.println("");

		}

	}

}
