package kr.co.taro.ui;

/**
 * 비회원 타로보기  프로그램
 * @author MacBook
 *
 */
public class TaroNonViewUI extends BaseUI{
	public void service() {
		while(true) {
			System.out.println("=======================================");
			System.out.println("|             [비회원 타로보기]             |");
			System.out.println("=======================================");
			String yn ="";
			yn = getStr(">> 타로를 보시겠습니까?  ( Y : 타로보기 / N : 메뉴로 돌아가기 ) : ");
			
			if(yn.equalsIgnoreCase("N")) {
				System.out.println();
				System.out.println(">> 메뉴로 돌아갑니다. <<");
				System.out.println();
			    return;
			}else if(yn.equalsIgnoreCase("Y")) {
				RealTaroViewUI aaa = new RealTaroViewUI();
				aaa.service();
			}else {
				System.out.println(">> 올바른 값이 아닙니다. 다시 골라주세요 <<");
				System.out.println();
				continue;
			}
	    }
	}	
}






	