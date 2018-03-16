package kr.co.taro.detailedUI;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroUI;

public class LogOut extends BaseUI {

	public void service() {
		System.out.println("==============================================");
		System.out.println("로그 아웃 하시겠습니까 (Y/N)");
		String ch=sc.nextLine();
		
		if(ch.equalsIgnoreCase("Y")) {
			TaroUI.usertmp = null;
			TaroUI.usertmp = new TaroUser();
			System.out.println("로그아웃 되었습니다.");
		}else if(ch.equalsIgnoreCase("N")) {
			System.out.println("메뉼로 돌아갑니다.");
			return;
			}
		else {
			System.out.println("올바른 값이 아닙니다.");
			return;
		}
	}

}
