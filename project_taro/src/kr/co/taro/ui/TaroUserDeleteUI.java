package kr.co.taro.ui;

import kr.co.taro.detailedUI.LoginCheck;
import kr.co.taro.domain.TaroUser;

/**
 * 회원 탈퇴 프로그램
 * @author eunj2n
 *
 */
public class TaroUserDeleteUI extends BaseUI{

	public void service() {
		System.out.println("==================================================================");
		System.out.println("                      [회원 탈퇴를 선택하셨습니다]                         ");
		System.out.println("------------------------------------------------------------------");
		while(true) {
			String result = getStr("\n>> 회원탈퇴를 하시겠습니까 ( Y : 회원탈퇴 / N : 메뉴로 돌아가기 ) : ");
			if(result.equalsIgnoreCase("N")) {
				System.out.print("\n>> 메뉴로 돌아갑니다");
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(300);
						System.out.print(".");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n");
				return;
			} else if(result.equalsIgnoreCase("Y")) {
				System.out.print(">> 회원 탈퇴를 진행하겠습니다");
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(300);
						System.out.print(".");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n");
				break;
			} else 
			System.out.println("\n>> 올바른 값이 아닙니다. 다시 입력해주세요  <<");
			continue;
		}
		
		LoginCheck login = new LoginCheck();
		login.service();
		String userId = TaroUI.usertmp.getId();
		
		while(true) {
			String userRe = getStr("\n>> 정말로 Taro회원 탈퇴하시겠습니까? ( Y : 회원탈퇴 / N : 메뉴로 돌아가기 ) : ");
			if(userRe.equalsIgnoreCase("N")) {
				System.out.println(">> 메뉴로 돌아갑니다 <<");
				return;
			} else if(userRe.equalsIgnoreCase("Y")) {
				System.out.print(">> 회원 탈퇴 진행중");
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(300);
						System.out.print(".");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				System.out.println(".......................................");
				System.out.println(">>      정상적으로 탈퇴 처리가 되었습니다                <<");
				System.out.println(".......................................\n");
				TaroUI.userMapper.userDelete(userId);
				TaroUI.usertmp = null;
				TaroUI.usertmp = new TaroUser();
				break;
			} else {
				System.out.println(".......................................");
				System.out.println(">>    올바른 값이 아닙니다. 다시 입력해주세요          <<");
				System.out.println(".......................................\n");
				continue;
			}
		}
		
	}
}

