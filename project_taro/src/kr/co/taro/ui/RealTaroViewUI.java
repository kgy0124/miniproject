package kr.co.taro.ui;

import java.util.Collections;
import java.util.List;

import kr.co.taro.domain.TaroCard;

public class RealTaroViewUI extends BaseUI{

	
	public void service() { 
	
		while(true) {
			System.out.println();
			System.out.println(">> 타로를 진행하겠습니다. <<");
			System.out.println();
			String name = "";
			System.out.println("-----------------------");
			name = getStr(">> 이름을 입력해주세요 : ");
			System.out.println("-----------------------");
			System.out.println();
			System.out.println("-----------------------");
			
			System.out.println(">>" +name + "님! 어떤 운세를 보시겠습니까? <<");
			
			int result=0;
			while(true) {
				System.out.println("1. 연애	2. 직업	3. 금전");
				System.out.println();
				result = getInt("보고싶은 운세의 숫자를 입력해주세요: ");
				
				if(result>0 && result<4) break;
				System.out.println("다시 입력해주세요.");
			}
			List<TaroCard> list=null;
			switch (result) {
			case 1: 
				System.out.println("연애운을 선택하셨습니다.");
				System.out.println();
				System.out.println("타로를 진행하겠습니다");
				list = TaroUI.cardMapper.selectTaroCardLove();
				break;
			case 2: 
				System.out.println("직업운을 선택하셨습니다.");
				System.out.println("타로를 진행하겠습니다");
				list = TaroUI.cardMapper.selectTaroCardMoney();
				break;
			case 3: 
				System.out.println("건강운을 선택하셨습니다.");
				System.out.println("타로를 진행하겠습니다.");
				list = TaroUI.cardMapper.selectTaroCardHealth();
				break;
			}
			try {
				System.out.println();
				System.out.println("카드를 섞겠습니다. 3초간 집중하시고... ");
				Thread.sleep(1000);
				System.out.println("3");
				Thread.sleep(1000);
				System.out.println("2");
				Thread.sleep(1000);
				System.out.println("1");
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int cardnum =0;
			while(true) {
				System.out.print("원하는 카드 번호를 선택하세요(1 ~ 44) : ");
				cardnum = Integer.parseInt(sc.nextLine());
				
				if (cardnum > 44 || cardnum < 1) { // 한글도 못입력하게 하기
					System.out.println("없는 카드입니다... 다시 집중하고 골라주세요.");
					continue;
				} 
				break;
			}
		// 카드해석 불러오기
			Collections.shuffle(list);
			
			TaroCard resultnum = list.get(cardnum-1);
			System.out.println();
			System.out.println(resultnum.getCardName());
			System.out.println(resultnum.getBasicM());
			System.out.println(resultnum.getDetailM());
			System.out.println();
		
			
			taromenu();
			
		
		}
    }

}

	

