package com.room;
import java.util.Scanner;
public class PatternDiamond {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b =a/2;
		for(int i=0;i<a/2;i++){
			for(int k=a/2;k>i;k--){
				System.out.print("*");
			}
			for(int m=0;m<i;m++){
				System.out.print("b");
			}for(int t=0;t<i;t++){
				System.out.print("b");
			}
			for(int o=b;o>i;o--){
				System.out.print("*");
			}System.out.println("");

		}
		
		for(int i=1;i<a/2;i++){
			for(int k=0;k<=i;k++){
				System.out.print("*");
			}
			for(int m=(b-i);m>1;m--){
				System.out.print("b");
			}for(int t=b-i;t>1;t--){
				System.out.print("b");
			}
			for(int o=b-i;o<=b;o++){
				System.out.print("*");
			}System.out.println("");

		}
		
	}
}



