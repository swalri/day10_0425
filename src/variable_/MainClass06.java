package variable_;

class TestClass06{
	private int num = 100;
	public void test() {
		num = 1000;
	}
	public void test2() {
		System.out.println(num);
	}
	public static final String KOREA = "대한민국";
	public static final String PATH = "C드라이브 특정위치";
}

public class MainClass06 {

	public static void main(String[] args) {
		TestClass06 t6 = new TestClass06();
		t6.test();
		t6.test2();
		System.out.println(TestClass06.KOREA);
	}
}


