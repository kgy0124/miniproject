package kr.co.taro.detailedviewUI;

import java.util.List;

import kr.co.taro.domain.TaroCard;
import kr.co.taro.domain.TaroUserDb;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroMainUI;
import kr.co.taro.ui.TaroUI;

public class TaroLoadUI extends BaseUI{
	public void service() {
		if(TaroUI.usertmp.getId() == null) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("              회원만 이용할 수 있는 메뉴입니다. 로그인 후 사용해주세요!              ");
			return;
		}
		
		System.out.println("==================================================================");
		System.out.println("                       [저장된 운세 기록 보기]                           ");
		System.out.println("------------------------------------------------------------------");
		while(true) {
			
			String yn ="";
			yn = getStr("\n>> 저장된 운세를  다시 보겠습니까 ( Y : 보기 / N : 메뉴로 돌아가기 ) : ");
			
			if(yn.equalsIgnoreCase("N")) {
				System.out.print("\n>> 메뉴로 돌아갑니다");
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(300);
						System.out.print(".");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n");
				return;
			}else if(yn.equalsIgnoreCase("Y")) {
				List<TaroUserDb> llist=TaroUI.dbMapper.loadLoveDate(TaroUI.usertmp.getId());
				List<TaroUserDb> mlist=TaroUI.dbMapper.loadMoneyDate(TaroUI.usertmp.getId());
				List<TaroUserDb> hlist=TaroUI.dbMapper.loadHealthDate(TaroUI.usertmp.getId());
				
				System.out.println("==================================================================");
				System.out.println(">> ["+TaroUI.usertmp.getId()+"]님의 이전 타로운세 기록 <<");
				System.out.println("------------------------------------------------------------------");
				System.out.print("기록을 불러오는 중");
				
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(500);
						System.out.print(".");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n");
				System.out.printf("총 [%d]개의 타로운세의 기록이 조회 되었습니다 \n",llist.size()+mlist.size()+hlist.size());
				System.out.println("------------------------------------------------------------------");
				
				for(TaroUserDb db:llist) {
					System.out.printf("%02d번 카드  ||  ",db.getNo());
					System.out.print(db.getListId()+" ||  ");
					System.out.print(db.getCard().getCardName()+"  ||  ");
					System.out.println(db.getCard().getDetailM());
				}
				for(TaroUserDb db:mlist) {
					System.out.printf("%02d번 카드  ||  ",db.getNo());
					System.out.print(db.getListId()+" ||  ");
					System.out.print(db.getCard().getCardName()+"  ||  ");
					System.out.println(db.getCard().getDetailM());
				}
				for(TaroUserDb db:hlist) {
					System.out.printf("%02d번 카드  ||  ",db.getNo());
					System.out.print(db.getListId()+" ||  ");
					System.out.print(db.getCard().getCardName()+"  ||  ");
					System.out.println(db.getCard().getDetailM());
				}
				System.out.println("------------------------------------------------------------------");
			}else {
				System.out.println("\n>> 올바른 값이 아닙니다. 다시 입력해주세요  <<");
				continue;
			}
	    }
	}	

}
