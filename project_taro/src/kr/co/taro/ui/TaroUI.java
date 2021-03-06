package kr.co.taro.ui;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppConfig;
import kr.co.taro.domain.TaroUser;
import kr.co.taro.mapper.TaroCardMapper;
import kr.co.taro.mapper.TaroUserDbMapper;
import kr.co.taro.mapper.TaroUserMapper;

public class TaroUI {
	private TaroMainUI m = new TaroMainUI();
    public static TaroUserMapper userMapper;
    public static TaroCardMapper cardMapper;
    public static TaroUserDbMapper dbMapper;
    public static TaroUser usertmp = new TaroUser();
    public TaroUI() {
		SqlSession sql = MyAppConfig.getSqlSessionInstance();
		userMapper = sql.getMapper(TaroUserMapper.class);
		cardMapper = sql.getMapper(TaroCardMapper.class);
		dbMapper   = sql.getMapper(TaroUserDbMapper.class);
	}
	
	public void service() {
		BaseUI ui = null;
		while(true) {
			switch(m.menu()) {
			case 1: ui = new TaroUserRegistUI(); break;
			case 2: ui = new TaroUserUpdateUI(); break;
			case 3: ui = new TaroUserDeleteUI(); break;
			case 4: ui = new TaroViewUI(); break;
			case 5: ui = new TaroNonViewUI(); break;
			case 0: m.quit();
			}
			ui.service();
		}
	}	
}
