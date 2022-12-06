package com.test2;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		char ascii;
		for(int i=1;i<=a;i++) {
			for(int j=a;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				int o = 64 +k;
				ascii =(char)o;
				System.out.print(ascii);
			}
			for(int m=1;m<i;m++) {
				int u =64 +m;
				ascii =(char)u;
				System.out.print(ascii);
			}System.out.println("");

		}


	}

}
