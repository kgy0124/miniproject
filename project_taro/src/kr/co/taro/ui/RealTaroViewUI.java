package kr.co.taro.ui;

import java.util.Collections;
import java.util.List;

import kr.co.taro.domain.TaroCard;
import kr.co.taro.domain.TaroUser;

public class RealTaroViewUI extends BaseUI{
	private TaroCard cardResult = null;
	
	public void service() { 
		TaroUser ts = new TaroUser(); 
		System.out.println(">> 타로를 진행 하겠습니다 <<");
		ts.setName(getStr(">> 당신의 이름은? : "));
		System.out.println("------------------------------------------------------------------");
		System.out.println("   	    	[" + ts.getName() + "]님! 어떤 운세를 보시겠습니까?         ");
		System.out.println("------------------------------------------------------------------");
		
		int result=0;
		while(true) {
			result = getInt(">> 1. 연애   | 2. 직업   | 3. 금전 : ");
			System.out.println();
			if(result>0 && result<4) break;
			System.out.println("다시 입력해주세요.");
		}
		List<TaroCard> list=null;
		switch (result) {
		case 1: 
			System.out.println(">> [연애운]을 선택하셨습니다  <<");
			System.out.println(">> [연애운] 타로 보기를 시작합니다  <<");
			list = TaroUI.cardMapper.selectTaroCardLove();
			break;
		case 2: 
			System.out.println(">> [직업운]을 선택하셨습니다  <<");
			System.out.println(">> [직업운] 타로 보기를 시작합니다  <<");
			list = TaroUI.cardMapper.selectTaroCardMoney();
			break;
		case 3: 
			System.out.println(">> [건강운]을 선택하셨습니다  <<");
			System.out.println(">> [건강운] 타로 보기를 시작합니다  <<");
			list = TaroUI.cardMapper.selectTaroCardHealth();
			break;
		}
		try {
			System.out.println("------------------------------------------------------------------");
			StringBuffer msg = new StringBuffer();
			System.out.print(msg.append("\n카드 섞는 중"));
			for (int i = 0; i < 58; i++) {
				System.out.print(".");
				Thread.sleep(80);
				
			}
			System.out.println("\n\n------------------------------------------------------------------");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int cardnum =0;
		while(true) {
			cardnum = getInt(">> 원하는 카드 번호를 선택하세요(1 ~ 44) : ");
			
			if (cardnum > 44 || cardnum < 1) { // 한글도 못입력하게 하기
				System.out.println("없는 카드입니다... 다시 집중하고 골라주세요~");
				continue;
			} 
			break;
		}
		
		System.out.print("\n" + cardnum + "번 카드에 해당하는 운세는 ");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(900);
				System.out.print(".");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	// 카드해석 불러오기
		Collections.shuffle(list);
		
		TaroCard resultnum = list.get(cardnum-1);
		
		try {
			System.out.println("\n>> 카드명 : " + resultnum.getCardName());
			Thread.sleep(1500);
			System.out.println(">> 기본 해석 : " + resultnum.getBasicM());
			Thread.sleep(1500);
			System.out.println(">> 상세 해석 : " + resultnum.getDetailM());
			Thread.sleep(1500);
			System.out.println();
			System.out.println("------------------------------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		cardResult = resultnum;
	}
	
	public TaroCard loadCard() {
		return cardResult;
	}
}