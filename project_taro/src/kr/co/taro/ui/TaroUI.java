package kr.co.taro.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppConfig;
import kr.co.taro.dao.TaroDAO;
import kr.co.taro.mapper.TaroUserMapper;

public class TaroUI {
	private TaroMainUI m = new TaroMainUI();
    public static TaroUserMapper mapper;
    public static TaroDAO dao = new TaroDAO();
    public TaroUI() {
		SqlSession sql = MyAppConfig.getSqlSessionInstance();
		mapper = sql.getMapper(TaroUserMapper.class);
	}
	
	public void service() {
		BaseUI ui = null;
		while(true) {
			switch(m.menu()) {
			case 1: ui = new TaroUserRegistUI(); break;
			case 2: ui = new TaroUserUpdateUI(); break;
			case 3: ui = new TaroUserDeleteUI(); break;
			case 4: ui = new TaroViewUI(); break;
			case 5:
			case 0: m.quit();
			}
			ui.service();
		}
	}	
}
