package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int index;
		int row;
		
		for(index=1; index<=num; index++){
			for(row=1; row<=index; row++) {
				System.out.print(index);
			}
			
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
