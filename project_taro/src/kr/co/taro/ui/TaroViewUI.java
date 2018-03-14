package kr.co.taro.ui;

import java.util.Scanner;

public class TaroViewUI extends BaseUI {
	public void service() {
		Scanner sc=new Scanner(System.in);
		String ch="";
		while(true) {
		System.out.print("타로를 보시겠습니까?(Y/N):");
		ch=sc.nextLine();
		if(ch.equalsIgnoreCase("N")) {
			System.out.println("메인 화면으로 돌아갑니다.");
			return;
		}else if(ch.equalsIgnoreCase("Y")) {
			System.out.println("계속 합니다.");
			break;
		}else
			System.out.println("올바른 값이 아닙니다. 다시 입력하십시오.");
		}
		
		System.out.print("아이디를 입력하십시오:");
		String id=sc.nextLine();
		System.out.print("패스워드를 입력하십시오:");
		String password=sc.nextLine();
		
		System.out.print("연도를 입력하십시오:");
		sc.nextLine();
		System.out.print("월을 입력하십시오:");
		sc.nextLine();

		
		
		
		

	}
}
