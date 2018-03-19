package kr.co.taro.ui;

/**
 * 비회원 타로보기  프로그램
 * @author MacBook
 *
 */
public class TaroNonViewUI extends BaseUI{
	public void service() {
		System.out.println("==================================================================");
		System.out.println("                    [비회원 타로보기를 선택하셨습니다]                      ");
		System.out.println("------------------------------------------------------------------");
		while(true) {
			
			String yn ="";
			yn = getStr("\n>> 타로운세 보기를 시작하시겠습니까 ( Y : 타로보기 / N : 메뉴로 돌아가기 ) : ");
			
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
				RealTaroViewUI aaa = new RealTaroViewUI();
				aaa.service();
			}else {
				System.out.println("\n>> 올바른 값이 아닙니다. 다시 입력해주세요  <<");
				continue;
			}
	    }
	}	
}






	