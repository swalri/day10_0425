package op_test;
/*
입력, 출력, 나이를 만으로 연산하는 각가의 기능을 만드세요
변수는 인스턴스 변수로 변경하여 사용하세요
*/
import java.util.Scanner;
public class OP01_TestClass01 {
	private String name;
	private int age;
	Scanner scan = new Scanner(System.in);
	//실행, 입력
	public void display() {
		System.out.println("이름 입력");
		name  = scan.next();
		System.out.println("나이 입력");
		age  = scan.nextInt();
		
		age_display(age);
		sysout_display(name,age);
	}
	//만 나이 계산
	private int age_display(int n) {
		age = n-1;
		return age;
	}
	//출력
	private void sysout_display(String name, int age) {
		System.out.println("이름 : "+name);
		System.out.println("만 나이 : "+age);
	}
}
/*

*/

