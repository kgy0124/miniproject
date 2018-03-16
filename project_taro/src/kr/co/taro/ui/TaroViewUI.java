package kr.co.taro.ui;

import java.util.Scanner;

import kr.co.taro.detailedUI.LogOut;
import kr.co.taro.detailedUI.LoginCheck;
import kr.co.taro.detailedviewUI.TaroSaveUI;

public class TaroViewUI extends BaseUI {
	private Scanner sc = new Scanner(System.in);
	
	public void service() {
		BaseUI ui = null;		
		while(true) {
			switch(menu()) {
			case 1:if(TaroUI.usertmp.getId() == null)
				   ui=new LoginCheck();
				   else ui=new LogOut();break;
			case 2:break;
			case 3: ui = new TaroSaveUI(); break;
			case 0: return;
			}
			ui.service();
		}
	}
	
	public int menu() {
		System.out.println("==================================================================");
		System.out.println("                         [회원 전용 타로 운세]                        ");
		System.out.println("------------------------------------------------------------------\n");
		if (TaroUI.usertmp.getId() == null) System.out.println("1. 유저 로그인");
		else System.out.println("1. 유저 로그아웃");
		System.out.println("2. 저장된 운세 기록 보기");
		System.out.println("3. 새로운 운세 보기");
		System.out.println("0. 메인으로 돌아가기");
		System.out.println("------------------------------------------------------------------");
		System.out.print(">> 원하시는 메뉴의 번호를 입력해주세요 : ");
		return Integer.parseInt(sc.nextLine());
	}
}


		
		
		
		



