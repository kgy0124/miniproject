package kr.co.taro.ui;

import kr.co.taro.ui.tarouserui.TaroBirthCheckUI;
import kr.co.taro.ui.tarouserui.TaroPasswordCheckUI;
import kr.co.taro.ui.tarouserui.TaroUserIdCheckUI;

/**
 * 회원 등록 프로그램
 * @author eunj2n
 *
 */
public class TaroUserRegistUI extends BaseUI{

	public void service() {
		System.out.println("==================================================================");
		System.out.println("                      [회원 등록을 선택하셨습니다]                         ");
		System.out.println("------------------------------------------------------------------");
		while(true) {
			String result = getStr("\n>> 회원 등록을 하시겠습니까 ( Y : 회원등록 / N : 메뉴로 돌아가기 ) : ");
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
				System.out.print(">> 회원 등록을 진행하겠습니다");
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
		
		new TaroUserIdCheckUI().service();
		
		System.out.println();
		TaroUI.usertmp.setName(getStr(">> 이름을 입력해주세요 : "));

		System.out.println();
		new TaroBirthCheckUI().service();	
		
		System.out.println();
		new TaroPasswordCheckUI().service();
			
		TaroUI.userMapper.userInsert(TaroUI.usertmp);
		
		System.out.println();
			
		System.out.print(">> 회원등록중");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(700);
				System.out.print(".");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println(".......................................");
		System.out.println(">>        회원 등록이 완료 되었습니다                    <<");
		System.out.println(".......................................");
		System.out.println(">> 메뉴로 돌아갑니다 <<");
		return;
	}
			

}

