package variable_;

class TestClass04{
	static int num= 1000;
	int abc;
	public void test1() {
		test2();
		abc=100;
	}
	public void test2() {
		
	}
	

}

public class MainClass04 {
	int num = 222;
	public static void main(String[] args) {
		TestClass04.num=4444;
	}
	public void a() {
		TestClass04 t = new TestClass04();
		t.test1();
	}
}


