package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("=====================================");
		
		int right = 63;
	
		while(true) {
			

			System.out.print("숫자입력>>");
			int answer = sc.nextInt();
			
			
			if(answer<right) {
				System.out.println("더 높게");
				continue;
			}
			
			if(answer>right) {
				System.out.println("더 낮게");
				continue;
			}
			
			if(answer==right) {
				System.out.println("정답입니다");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				char finish = sc.next().charAt(0);
				
				if(finish=='y') {
					System.out.println("=====================================");
					System.out.println("\t[숫자맞추기게임 종료]");
					System.out.println("=====================================");
					break;
					
				}else if(finish=='n') {
					System.out.println("=====================================");
					System.out.println("\t[숫자맞추기게임 시작]");
					System.out.println("=====================================");
					continue;
				}
				
			
			}		
		sc.close();
		}
		
	}
	
}
