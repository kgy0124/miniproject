package kr.co.taro.ui;

import kr.co.taro.detailedUI.LoginCheck;

/**
 * 회원 탈퇴 프로그램
 * @author eunj2n
 *
 */
public class TaroUserDeleteUI extends BaseUI{

	public void service() {
		System.out.println("=======================================");
		System.out.println("          [회원 탈퇴를 선택하셨습니다]          ");
		System.out.println("=======================================");
		
		while(true) {
			String result = getStr(">> 회원탈퇴를 진행 하시겠습니까 ( Y : 회원탈퇴 진행 / N : 메뉴로 돌아가기 ) : ");
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
				System.out.println();
				return;
			} else if(result.equalsIgnoreCase("Y")) {
				System.out.print("\n>> 회원 탈퇴를 진행하겠습니다");
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(300);
						System.out.print(".");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				System.out.println("---------------------------------------");
				break;
			} else 
			System.out.println("\n>> 올바른 값이 아닙니다. 다시 입력해주세요  <<\n");
			continue;
		}
		
		LoginCheck login = new LoginCheck();
		login.service();
		String userId = TaroUI.usertmp.getId();
		while(true) {
			String userRe = getStr(">> 정말로 Taro회원 탈퇴하시겠습니까? ( Y : 회원탈퇴 / N : 메뉴로 돌아가기 ) : ");
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
				TaroUI.userMapper.userDelete(userId);
				break;
			} else {
				System.out.println(">> 올바른 값이 아닙니다. 다시 입력해주세요 <<");
				continue;
			}
		}
		
	}
}

