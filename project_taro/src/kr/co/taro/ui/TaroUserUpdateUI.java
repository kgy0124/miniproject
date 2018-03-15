package kr.co.taro.ui;

import kr.co.taro.ui.tarouserui.TaroBirthCheckUI;
import kr.co.taro.ui.tarouserui.TaroPasswordCheckUI;

/**
 * 회원 정보 수정 프로그램
 * @author eunj2n
 *
 */

public class TaroUserUpdateUI extends BaseUI{

	public void service() {
		System.out.println("--------------------------");
		System.out.println(">> 회원정보 수정을 선택하셨습니다 <<");
		System.out.println("--------------------------");
		
		while(true) {
			String result = getStr(">> 회원정보 수정을 하시겠습니까 ( Y : 회원정보 수정 진행 / N : 메뉴로 돌아가기 ) : ");
			if(result.equalsIgnoreCase("N")) {
				System.out.println(">> 메뉴로 돌아갑니다 <<");
				return;
			} else if(result.equalsIgnoreCase("Y")) {
				System.out.println();
				System.out.println(">> 회원정보 수정을 진행하겠습니다 ...<<");
				System.out.println();
				break;
			} else {
				System.out.println();
				System.out.println(">> 올바른 값이 아닙니다. 다시 입력해주세요  <<");
				System.out.println();
				continue;
			}
		}
		
		
		//회원확인
		getStr(">> ID를 입력해주세요 : ");
		getStr(">> 비밀번호를 입력해주세요 : ");
		while(true) {
			switch(getInt(">> 수정할 정보를 선택해주세요 ( 1. 생년월일 / 2. 비밀번호 ) : ")) {
			case 1 : new TaroBirthCheckUI().service(); 
					 String msg = TaroUI.usertmp.getBirth();
					
			break;
			case 2 : new TaroPasswordCheckUI(); break;
			}
		}
		
		
		
			
	}
}
