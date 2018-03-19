package kr.co.taro.ui;

import java.util.Scanner;

public abstract class BaseUI {
	protected Scanner sc = new Scanner(System.in);
	
	public abstract void service();
	
	public int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	public String getStr(String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	public void taromenu() {
		while(true) {
			String yn ="";
			yn = getStr(">> 타로를 보시겠습니까?  ( Y : 타로보기 / N : 메뉴로 돌아가기 ) : ");
			
			if(yn.equalsIgnoreCase("N")) {
				System.out.println();
				System.out.println(">> 메뉴로 돌아갑니다. <<");
				System.out.println();
			    return;
			}else if(yn.equalsIgnoreCase("Y")) {
				RealTaroViewUI aaa = new RealTaroViewUI();
				aaa.service();
				break;
			}else {
				System.out.println(">> 올바른 값이 아닙니다. 다시 골라주세요 <<");
				System.out.println();
				continue;
			}
	    }//while
	}	
	
	// ID 중복확인
	public boolean idCheck(String userId) {
		String result = TaroUI.userMapper.userIdSelect(userId);
		if(result == null) {
			return true;
		} 
		return false;
	}
	
	// 생일 입력 양식 확인
	public boolean birthResult(String birth) {
		if(birth.length() == 8 && isNumber(birth)) {
			return true;
		}
		return false;
	}
	
	// 비밀번호 확인
	public boolean passwordResult(String password,String repass) {
		if(password.equals(repass)) {
			return true;
		}
		return false;
	}
	
	// 문자열에 입력된 값이 숫자인지 확인
	public static boolean isNumber(String msg) {
        if( msg == null || msg.equals("") ) {
            return false;
        }
        for( int i = 0 ; i < msg.length() ; i++ ) {
            char ch = msg.charAt(i);
            if(ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
	
	
	
}
