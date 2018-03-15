package kr.co.taro.ui.tarouserui;

import kr.co.taro.dao.TaroDAO;
import kr.co.taro.ui.TaroUI;
import kr.co.taro.ui.TaroUserRegistUI;

public class TaroBirthCheckUI extends TaroUserRegistUI{
	
	public void service() {
		while(true) {
			String birth = getStr("\n>> 생년월일을 입력해주세요 (ex 12341211) : ");
			System.out.print("\n>> 생년월일 확인 중");
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(300);
					System.out.print(".");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			boolean result = TaroUI.dao.birthResult(birth);
			if(result) {
				System.out.println("\n\n>> 확인 되었습니다 <<\n");
				TaroDAO.user.setBirth(birth);	
				return;
			} else {
				System.out.println("\n>> 생년월일을 양식에 맞게 입력해주세요 <<");
				continue;
			}
		}
	}
}

