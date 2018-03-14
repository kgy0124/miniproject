package kr.co.taro.main;

import kr.co.taro.ui.TaroUI;

public class TaroMain {
	public static void main(String[] args) {
		try {
			TaroUI ui = new TaroUI();
			ui.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
