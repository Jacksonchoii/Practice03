package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum=1;
		
		
		for(int a=1; a<=num; a++) {
			sum=sum*a;
		}
		System.out.println("결과값: "+sum);
		
		sc.close();	
		
	}

}
