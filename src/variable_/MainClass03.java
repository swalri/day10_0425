package variable_;

class TestClass03{
	int num;
	public void test01() {
		num = 1000;
//		int abc;
		System.out.println("test01 : "+num);
	}
	
	public void test02() {
		System.out.println("test02 : "+num);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t2 = new TestClass03();
		t2.test01();
		t2.test02();
	}
}


