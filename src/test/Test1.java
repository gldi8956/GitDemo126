package test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		System.out.println("Hello, java");
		System.out.println("아자아자 126기 화이팅~~");
		
		Scanner sc100 = new Scanner(System.in); //시험
		
		int score = sc100.nextInt(); //시험
		
		 //int score = 80;
		char grade = ' ';
		
		if((score > 100) || (score < 0)) {
			System.out.println(score + "은(는) 잘못된 점수 입니다.");
		}
		else {
		
			if (score >= 90) {
				grade = 'A';
			}
			else if (score >= 80) {
				grade = 'B';
			}
			else if (score >= 70) {
				grade = 'C';
			}
			else if (score >= 60) {
				grade = 'D';
			}
			else {
				grade = 'F';
			}
			System.out.println("점수: " + score + "\t학점: " + grade);
		
		}	
		
		sc100.close();
	}
}
