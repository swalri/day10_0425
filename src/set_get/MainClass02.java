package set_get;


class TestClass02{
	private int age;
	
	
	public void setAge(int age) {
		this.age = age - 1;
	}
	public void printAge() {
		System.out.println(age);
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		
		TestClass02 t2 = new TestClass02();
		t2.setAge(20);
		t2.printAge();
	}
}


