package kr.co.taro.mapper;

import kr.co.taro.domain.TaroUser;

public interface TaroUserMapper {

	void userInsert(TaroUser user);
	
	String userIdSelect(String userId);
	
	TaroUser loadInfo(TaroUser user);
	
	void logInStatus(String userId);
	
	void userBirthUpdate(String birth);
	
	void userPasswordUpdate(String password);
	
	void logOutStatus(String userId);
}
