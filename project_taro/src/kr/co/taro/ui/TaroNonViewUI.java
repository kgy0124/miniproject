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
			
	
	
	public TaroNonViewUI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void service() {
		System.out.println("--------------------------");
		System.out.println(">> 비회원 타로보기를 선택하셨습니다 <<");
		System.out.println("--------------------------");
		String yn ="";
		yn = getStr(">> 타로를 보시겠습니까?  ( Y : 타로보기 / N : 메뉴로 돌아가기 ) : ");
		String name = "";
		name = getStr(">> 이름을 입력해주세요 : ");
		System.out.println("-----------------------");
		

		
		System.out.println(">> 어떤 운세를 보시겠습니까? ");
		System.out.println("1. 연애");
		System.out.println("2. 직업");
		System.out.println("3. 금전");
		System.out.println("-----------------------");
		
		int result = getInt("보고싶은 운세의 숫자를 입력해주세요: ");
		
		while(true) {
			switch (result) {
			case 1: System.out.println("연애운을 선택하셨습니다.");
			        System.out.println("타로를 진행하겠습니다");break;
					
			case 2: System.out.println("직업운을 선택하셨습니다.");
					System.out.println("타로를 진행하겠습니다");break;
					
			case 3: System.out.println("건강운을 선택하셨습니다.");
					System.out.println("타로를 진행하겠습니다");break;
			}
			break;
		}
		
		try {
			System.out.println("카드를 섞겠습니다. 3초간 집중하시고... ");
			Thread.sleep(1000);
			System.out.println("3");
			Thread.sleep(1000);
			System.out.println("2");
			Thread.sleep(1000);
			System.out.println("1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 카드해석 불러오기
		List<TaroCard> list = TaroUI.cardMapper.selectTaroCardLove();
		Collections.shuffle(list);
		
		int cardnum =0;
		while(true) {
			System.out.print("원하는 카드 번호를 선택하세요(1 ~ 44) : ");
			cardnum = Integer.parseInt(sc.nextLine());
			
			if (cardnum > 44 && cardnum < 1) {
				System.out.println("없는 카드입니다... 다시 집중하고 골라주세요.");
				continue;
			} 
			break;
		}
		
		TaroCard resultnum = list.get(cardnum-1);
		System.out.println(resultnum.getCardName());
		System.out.println(resultnum.getBasicM());
		System.out.println(resultnum.getDetailM());
		
		
		
	}	
	
	
	
	
	
}




	