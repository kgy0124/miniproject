package kr.co.taro.ui;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import common.db.MyAppConfig;
import kr.co.taro.domain.TaroCard;
import kr.co.taro.mapper.TaroUserMapper;

/**
 * 비회원 타로보기  프로그램
 * @author MacBook
 *
 */
public class TaroNonViewUI extends BaseUI{
	
	public void service() {
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println(">> 비회원 타로보기를 선택하셨습니다 <<");
		System.out.println("--------------------------");
		System.out.println();
		taromenu();
	}	
}






	