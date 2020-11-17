package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

/*예상

*   y=0 일 때

**  y=1 일 때

**  y=2 일 때 y<2 조건 불충족 -> y의 반복문 끝 (x=0일 때 반복까지 진행)

**
**  x=1 일 때 (y는 3번 반복하여 2번 true 결과 **를 만들어냄)

**
**
** x=2 일 때

**
**
**
** x=3 일 때

**
**
**
**  x=4 일 때 x<4 조건 불충족 -> x의 반복문 끝  -> 종료


**
**
**
**    <- 결과

*/
