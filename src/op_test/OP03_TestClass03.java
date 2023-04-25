package op_test;

import java.util.HashMap;
import java.util.Scanner;

public class OP03_TestClass03 {
	Scanner scan = new Scanner(System.in);
	private String id, pwd;
	private int i=0;
	private HashMap<String,String> player = new HashMap<>();
	
	//id
	private String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	
	//pwd
	private String getPwd() {
		return pwd;
	}
	private void setPwd(String pwd) {
		this.pwd = pwd;
	}

	//실행
	public void display() {
		int num;
		while(true) {
			System.out.println("===================");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = scan.nextInt();
			switch(num) {
			case 1:
				login();
				break;
			case 2:
				test();
				break;
			case 3:
				endplay();
				break;
			default:
				System.out.println("오류");
				break;
			}
		}
	}
	
	//id 입력
	private void inputId() {
		String id;
		System.out.print("id : ");
		id = scan.next();
		setId(id);
	}
	//pwd 입력
	private void inputPwd() {
		String pwd;
		System.out.print("pwd : ");
		pwd = scan.next();
		setPwd(pwd);
	}
	
	//로그인
	private void login() {
		if(i==0) {
			System.out.println("등록되어있는 회원이 없습니다.");
		}else {
			inputId();
			if(player.containsKey(getId())) {
				inputPwd();
				if(getPwd().equals(player.get(getId()))) {
					System.out.println(getId()+"님 어서오세요");
				}else {
					System.out.println("비밀번호가 다름니다");
				}
			}else {
				System.out.println("없는 아이디 입니다");
			}
		}
	}
	
	//회원가입
	private void test() {
		inputId();
		if(player.containsKey(getId())) {
			System.out.println("사용중인 아이디 입니다");
		}else {
			inputPwd();
			player.put(getId(), getPwd());
		}
		i++;
	}
	
	//종료
	private void endplay() {
		System.out.println("종료합니다");
		System.exit(0);
	}
}