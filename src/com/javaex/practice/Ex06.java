package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력
		
		int index;
		
		
		for(index=1; index<=100; index++) {
			if(index%5==0 && index%7==0) {
				System.out.println(index);
			}
		}
	}

}

/* 
1에서 100까지의 수 <- 범위가 정해져 있으니 for 문법 사용
가장 작은 정수를 출력하라고 했으면 출력 문법 아래에 break; 사용
*/