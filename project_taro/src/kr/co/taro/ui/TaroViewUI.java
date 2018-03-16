package kr.co.taro.ui;

import java.util.Scanner;

import kr.co.taro.detailedUI.LogOut;
import kr.co.taro.log.ui.TaroMemberLoginUI;

public class TaroViewUI extends BaseUI {
	private Scanner sc = new Scanner(System.in);
	
	public void service() {
		BaseUI ui = null;
		TaroUI.usertmp = null;
		while(true) {
			switch(menu()) {
			case 1:if(TaroUI.usertmp==null)
				 ui=new TaroMemberLoginUI();
			else ui=new LogOut();break;
			case 2:
			case 3:
			case 0: return;
			}
			ui.service();
		}
	}
	
	public int menu() {
		System.out.println("=======================================");
		System.out.println("|            [회원 전용 타로 운세]            |");
		System.out.println("=======================================");
		if (TaroUI.usertmp == null) System.out.println("1. 유저 로그인");
		else System.out.println("1. 유저 로그 아웃");
		System.out.println("2. 기존 운세 보기");
		System.out.println("3. 새로운 운세 보기");
		System.out.println("0. 메인으로 돌아가기");
		System.out.println("=======================================");
		System.out.print(">> 메뉴 입력 : ");
		return Integer.parseInt(sc.nextLine());
	}
}


		
		
		
		



