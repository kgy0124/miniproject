package kr.co.taro.detailedUI;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroUI;

public class LogOut extends BaseUI {

	public void service() {
		System.out.println("==================================================================");
		System.out.println("                         [사용자 로그아웃]                           ");
		System.out.println("------------------------------------------------------------------");
		
		while(true) {
			String result = getStr(">> 로그아웃을 진행하시겠습니까 ( Y : 회원 로그아웃 / N : 메뉴로 돌아가기 ) : ");
			if(result.equalsIgnoreCase("Y")) {
				TaroUI.usertmp = null;
				TaroUI.usertmp = new TaroUser();
				System.out.println(".......................................");
				System.out.println(">>       정상적으로 로그아웃 되었습니다                  <<");
				System.out.println(".......................................");
				break;
			}else if(result.equalsIgnoreCase("N")) {
				System.out.println(".......................................");
				System.out.println(">>           메뉴로 돌아갑니다                             <<");
				System.out.println(".......................................");
				return;
			}
			else {
				System.out.println(".......................................");
				System.out.println(">>    올바른 값이 아닙니다. 다시 입력해주세요         <<");
				System.out.println(".......................................");
				continue;
			}
		}
	}
}
