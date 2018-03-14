package kr.co.taro.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppConfig;
import kr.co.taro.mapper.TaroUserMapper;

public class TaroUI {
	private TaroMainUI m = new TaroMainUI();
	
	private TaroUserMapper mapper;
	public TaroUI() {
		SqlSession sql = MyAppConfig.getSqlSessionInstance();
		mapper = sql.getMapper(TaroUserMapper.class);
	}
	
	public void service() {
		BaseUI ui = null;
		while(true) {
			switch(m.menu()) {
			case 1: ui = new TaroUserRegistUI(mapper); break;
			case 2: ui = new TaroUserUpdateUI(mapper); break;
			case 3: ui = new TaroUserDeleteUI(mapper); break;
			case 4: ui = new TaroViewUI(mapper); break;
			case 5:
			case 0: m.quit();
			}
			ui.service();
		}
	}	
}
