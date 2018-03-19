package kr.co.taro.mapper;

import java.util.List;

import kr.co.taro.domain.TaroUserDb;

public interface TaroUserDbMapper {
	
	void saveUserDate(TaroUserDb parameter);
	
	List<TaroUserDb> loadLoveDate(String parameter);
	List<TaroUserDb> loadMoneyDate(String parameter);
	List<TaroUserDb> loadHealthDate(String parameter);
	
}
