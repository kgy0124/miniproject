package kr.co.taro.ui.tarouserui;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroUI;

public class TaroPasswordCheckUI extends BaseUI{
	public static TaroUser usertmp = new TaroUser();
	
	public TaroPasswordCheckUI() {
		super();
	}
		
	public void service() {
		while(true) {
			String password = getStr(">> 생성하실 비밀번호를 입력해주세요 : ");
			String respass = getStr(">> 비밀번호 재확인 : ");
			
			boolean result = TaroUI.dao.passwordResult(password, respass);
			
			if(result) {
				System.out.println("\n>> 비밀번호가 확인되었습니다 <<\n");
				usertmp.setPassword(password);
				return;
			} else {
				System.out.println("\n>> 올바르지 않은 비밀번호를 입력하셨습니다 <<");
				System.out.println(">> 비밀번호 초기설정 화면으로 돌아갑니다 <<\n");
				continue;
			}
		}
		
	}


}	
	
