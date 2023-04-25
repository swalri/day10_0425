package overloading_;

import java.util.ArrayList;

/*
메소드 오버로딩
 - 메소드의 이름을 동일하게 사용하는 것
 - 서로 다른 메소드로 인식하기 위해서는 매개변수의 개수 또는 타입이 달라야함
*/
class TestClass01{
	public void sumFunc(int n1, int n2) {
		int sum = n1+n2;
		System.out.println("합은 "+sum+"입니다");
	}
	public void sumFunc(String s1, String s2) {
		String sum = s1+s2;
		System.out.println(sum);
	}	
}
public class MainClass01 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		TestClass01 t = new TestClass01();
		t.sumFunc(n1,n2);
		String s1="test",s2="안녕";
		t.sumFunc(s1, s2);
		ArrayList<String> arr = new ArrayList<>();
		arr.add(s2);
		
	}
}


