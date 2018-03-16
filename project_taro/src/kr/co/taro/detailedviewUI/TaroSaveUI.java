package kr.co.taro.detailedviewUI;

import kr.co.taro.domain.TaroCard;
import kr.co.taro.domain.TaroUserDb;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.RealTaroViewUI;
import kr.co.taro.ui.TaroUI;

public class TaroSaveUI extends BaseUI{
	public void service() {	
		RealTaroViewUI viewui = new RealTaroViewUI();
		viewui.service();
		TaroCard tc = viewui.loadCard();
		
		//RealTaroViewUI에서 뽑힌 카드번호 받아오는 과정
		
		TaroUserDb db=new TaroUserDb();
		db.setListId(tc.getListId());
		db.setNo(tc.getNo());
		
		String id=TaroUI.usertmp.getId();
		db.setId(id);
		
		TaroUI.dbMapper.saveUserDate(db);
	}
}
