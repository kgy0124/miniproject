package kr.co.taro.ui.tarouserui;

import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroUI;

public class TaroUserIdCheckUI extends BaseUI {

	public void service() {
		while(true) {
			String userId = getStr(">> 사용하실 ID를 입력해주세요 : ");
			System.out.print("\n>> ID 중복 확인중 입니다");
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(500);
					System.out.print(".");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			boolean result = TaroUI.dao.idCheck(userId);
			
			if(result) {
				System.out.println("\n\n>> !!사용 가능한 ID입니다!! <<\n");
				TaroUI.usertmp.setId(userId);
				return;
			} else {
				System.out.println("\n\n>> !!이미 가입된 ID입니다!! <<\n");
				continue;
			}
		}
	}
}
