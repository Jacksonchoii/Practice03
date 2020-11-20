package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		for(int r=1; r<=num; r++) {
			for(int i=num; i>=r; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int r=1; r<num; r++) {
			for(int i=1; i<=r+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		
		
		sc.close();
	}

}
