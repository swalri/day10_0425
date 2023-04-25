package variable_;

class TestClass02{
	int test=1111;
	public int test01() {
		int num = 100;
		System.out.println("test01 : "+num);
		System.out.println("test : "+test);
		return num;
	}
	
	public void test02(int num) {
		System.out.println("test02 : "+num);
		System.out.println("test : "+test);
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t2 = new TestClass02();
		t2.test02(10);
	}
}


