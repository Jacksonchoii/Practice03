package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2단부터 9단까지 구구단
		
		for(int row=1; row<=9; row++) {
			for(int col=2; col<=9; col++) {
				System.out.print(col+"*"+row+"="+col*row+"\t");
			}
			System.out.println();
		}
	}

}
