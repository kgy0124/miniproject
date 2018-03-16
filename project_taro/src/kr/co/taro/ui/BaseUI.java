package kr.co.taro.ui;

import java.util.Scanner;

public abstract class BaseUI {
	protected Scanner sc = new Scanner(System.in);
	
	public abstract void service();
	
	public int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	public String getStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	public void taromenu() {
		while(true) {
			String yn ="";
			yn = getStr(">> 타로를 보시겠습니까?  ( Y : 타로보기 / N : 메뉴로 돌아가기 ) : ");
			
			if(yn.equalsIgnoreCase("N")) {
				System.out.println();
				System.out.println(">> 메뉴로 돌아갑니다. <<");
				System.out.println();
			    return;
			}else if(yn.equalsIgnoreCase("Y")) {
				RealTaroViewUI aaa = new RealTaroViewUI();
				aaa.service();
				break;
			}else {
				System.out.println(">> 올바른 값이 아닙니다. 다시 골라주세요 <<");
				System.out.println();
				continue;
			}
	    }//while
	}	
	
	
	
}
