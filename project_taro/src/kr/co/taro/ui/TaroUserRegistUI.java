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
		System.out.println("=======================================");
		System.out.println("          [회원 등록을 선택하셨습니다]          ");
		System.out.println("=======================================");
		
		while(true) {
			String result = getStr(">> 회원등록을 하시겠습니까 ( Y : 회원등록 / N : 메뉴로 돌아가기 ) : ");
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
				System.out.print("\n>> 회원 등록을 진행하겠습니다");
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
		
		new TaroUserIdCheckUI().service();
		
		TaroUI.usertmp.setName(getStr(">> 이름을 입력해주세요 : "));
		
		new TaroBirthCheckUI().service();	
		
		new TaroPasswordCheckUI().service();
			
		TaroUI.userMapper.userInsert(TaroUI.usertmp);
			
		System.out.print(">> 회원등록중");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(500);
				System.out.print(".");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\n\n>> 회원 등록이 완료 되었습니다 <<\n");
		return;
	}
			

}

