package kr.co.taro.mapper;

import kr.co.taro.domain.TaroUser;

public interface TaroUserMapper {

	void userInsert(TaroUser user);
	
	String userIdSelect(String userId);
}
