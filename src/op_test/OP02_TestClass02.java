package op_test;
/*
입력, 출력, 나이를 만으로 연산하는 각가의 기능을 만드세요
변수는 인스턴스 변수로 변경하여 사용하세요
*/
import java.util.Scanner;

public class OP02_TestClass02 {
	private String name, grade;
	private int kor,eng,math,sum;
	private double avg;
	Scanner scan = new Scanner(System.in);
	public void startPro() {
		scanInput();
		sumFunc();
		display();
	}
	//입력
	private void scanInput() {
		
		System.out.println("이름 입력");
		name  = scan.next();
		System.out.println("성적을 입력해주세요");
		System.out.println("국어 : ");
		kor = scan.nextInt();
		System.out.println("영어 : ");
		eng = scan.nextInt();
		System.out.println("수학 : ");
		math = scan.nextInt();
	}
	//연산 : 합,평균,등급을 구하는 기능
	private void sumFunc() {
		sum = kor+eng+math;
		avg = sum / 3;
		if(avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
	}
	//출력
	private void display() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor+" 영어 : "+eng+" 수학 : "+math);
		System.out.println("총합 : "+sum);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println("등급 : "+grade);
	}
}

