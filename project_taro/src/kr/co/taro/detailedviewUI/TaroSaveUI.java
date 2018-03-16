package kr.co.taro.detailedviewUI;

import kr.co.taro.domain.TaroCard;
import kr.co.taro.domain.TaroUserDb;
import kr.co.taro.ui.RealTaroViewUI;
import kr.co.taro.ui.TaroUI;

public class TaroSaveUI {
	public void service() {	
		RealTaroViewUI viewui = new RealTaroViewUI();
		viewui.service();
		TaroCard tc = viewui.loadCard();
		
		System.out.println(tc.getListId());
		System.out.println(tc.getNo());
		
		//RealTaroViewUI에서 뽑힌 카드번호 받아오는 과정
		
		
		TaroUserDb db=new TaroUserDb();
		db.setListId(tc.getListId());
		db.setNo(tc.getNo());
		
		System.out.println(TaroUI.usertmp.getId());
		System.out.println(TaroUI.usertmp.getName());
		
		String id=TaroUI.usertmp.getId();
		System.out.println(id);
		db.setId(id);
		
		TaroUI.dbMapper.saveUserDate(db);
	}
}
