package kr.co.taro.mapper;

import kr.co.taro.domain.TaroUser;

public interface TaroUserMapper {

	// 회원가입
	void userInsert(TaroUser user);
	
	//아이디 중복 체크
	String userIdSelect(String userId);
	
	TaroUser loadInfo(TaroUser user);
	
//	void logInStatus(String userId);
	
	// 생년월일 변경
	void userBirthUpdate(TaroUser user);
	
	// 비밀번호 변경
	void userPasswordUpdate(TaroUser user);
	
//	void logOutStatus(String userId);

	//회원 탈퇴 
	void userDelete(String userId);
}
