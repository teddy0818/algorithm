package com.hbj.free;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int z=0; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
