package kr.co.taro.mapper;

import java.util.List;

import kr.co.taro.domain.TaroCard;

public interface TaroCardMapper {

	List<TaroCard> selectTaroCardLove();
	List<TaroCard> selectTaroCardMoney();
	List<TaroCard> selectTaroCardHealth();
	
}
