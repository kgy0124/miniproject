package kr.co.taro.ui.tarouserui;

import kr.co.taro.ui.TaroUI;
import kr.co.taro.ui.TaroUserRegistUI;

public class TaroBirthCheckUI extends TaroUserRegistUI{
	
	public void service() {
		while(true) {
			String birth = getStr(">> 생년월일을 입력해주세요 (ex 12341211) : ");
			System.out.print(">> 생년월일 확인 중");
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(300);
					System.out.print(".");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			boolean result = birthResult(birth);
			if(result) {
				TaroUI.usertmp.setBirth(birth);
				return;
			} else {
				System.out.println(".......................................");
				System.out.println(">>      생년월일을 양식에 맞게 입력해주세요             <<");
				System.out.println(".......................................");
				continue;
			}
		}
	}
}

