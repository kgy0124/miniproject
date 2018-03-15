package kr.co.taro.dao;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.ui.TaroUI;

public class TaroDAO extends TaroUI{
	public static TaroUser user = new TaroUser();


	// ID 중복확인
	public boolean idCheck(String userId) {
		String result = mapper.userIdSelect(userId);
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
