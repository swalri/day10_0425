package variable_;

class TestClass05{
	static int num;
	static {
		num = 1000;
	}
	public void test() {
		System.out.println("num : "+num);
	}
	static int n1 = 100;
	public static void test02() {
		System.out.println("n1 : "+n1);
	}
}

public class MainClass05 {

	public static void main(String[] args) {
//		TestClass05 t5 = new TestClass05();

	}
}


