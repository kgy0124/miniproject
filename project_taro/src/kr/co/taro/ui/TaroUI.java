package kr.co.taro.ui;

public class TaroUI {
	private TaroMainUI m = new TaroMainUI();

	public void service() {
		BaseUI ui = null;
		while(true) {
			switch(m.menu()) {
			case 1: ui = new TaroRegistUI(); break;
			case 2:
			case 3:
			case 0: m.quit();
			}
			ui.service();
		}
	}	
}
