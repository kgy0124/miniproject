package kr.co.taro.ui;

public class TaroUI {
	private TaroMainUI m = new TaroMainUI();

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
