package kr.co.taro.ui;

import kr.co.taro.detailedUI.LoginCheck;
import kr.co.taro.ui.tarouserui.TaroBirthCheckUI;
import kr.co.taro.ui.tarouserui.TaroPasswordCheckUI;

/**
 * 회원 정보 수정 프로그램
 * @author eunj2n
 *
 */

public class TaroUserUpdateUI extends BaseUI{

	public void service() {
		System.out.println("==================================================================");
		System.out.println("                      [회원 정보 수정을 선택하셨습니다]                     ");
		System.out.println("------------------------------------------------------------------");
		while(true) {
			String result = getStr("\n>> 회원 정보 수정을 하시겠습니까 ( Y : 회원 정보 수정 / N : 메뉴로 돌아가기 ) : ");
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
				System.out.print(">> 회원 정보 수정을 진행하겠습니다");
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
		
		while(true) {
			switch(getInt("\n>> 수정할 정보를 선택해주세요 ( 1. 생년월일 / 2. 비밀번호 / 3. 메뉴로 돌아가기 ) : ")) {
			case 1 : new TaroBirthCheckUI().service(); 
					TaroUI.userMapper.userBirthUpdate(TaroUI.usertmp);
					System.out.println(".......................................");
					System.out.println(">>       수정이 정상적으로 완료되었습니다                <<");
					System.out.println(".......................................");
					break;
			case 2 : new TaroPasswordCheckUI().service();
					TaroUI.userMapper.userPasswordUpdate(TaroUI.usertmp);
					System.out.println(".......................................");
					System.out.println(">>       수정이 정상적으로 완료되었습니다                <<");
					System.out.println(".......................................");
					break;
			case 3 : System.out.println(">> 메뉴로 돌아갑니다 <<");
					return;
			}
		}
		
		
		
			
	}
}
