package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int sum=0;
		int result = num/5;
		for(int i=5; i<=num; i++) {
			if(num%5!=0) {
			
			}
			
			
		}
			System.out.println("5의배수의 개수: "+result);
			System.out.println("5의 배수의 합: "+sum);
		
		
		sc.close();
	}

}
