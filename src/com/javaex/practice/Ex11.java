package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum=0;
		
		
			if(num%2!=0) {
				for(int a=1; a<=num; a=a+2) {
					sum=sum+a;
				}
				System.out.println("결과값: "+sum);
				
			}else {
				for(int a=2; a<=num; a=a+2) {
					sum=sum+a;
				}
				System.out.println("결과값: "+sum);
			}
		
			sc.close();	
		}
		
	
		
	}


