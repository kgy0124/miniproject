package kr.co.taro.mapper;

import kr.co.taro.domain.TaroUser;

public interface TaroUserMapper {

	void userInsert(TaroUser user);
	
	String userIdSelect(String userId);
	
	TaroUser loadInfo(TaroUser user);
	
//	void logInStatus(String userId);
	
	void userBirthUpdate(TaroUser user);
	
	void userPasswordUpdate(TaroUser user);
	
//	void logOutStatus(String userId);

	void userDelete(String userId);
}
