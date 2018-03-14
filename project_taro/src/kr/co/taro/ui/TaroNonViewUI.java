package kr.co.taro.ui;

import java.util.Scanner;

public class TaroNonViewUI extends BaseUI{

	public void service() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println("");
		System.out.println("어떤 운세를 보시겠습니까? ");
		String l = "연애";
		String j = "직업";
		String m = "금전";
		System.out.printf("1.%s 2.%s 3.%s  ", l,j,m);
		int num = Integer.parseInt(sc.nextLine());
		
		if(num ==1) {
			String love = "연애";
            System.out.printf("%s님의 %s운을 보겠습니다\n", name, love);
		}
		else if(num ==2) {
			String job = "직업";
	        System.out.printf("%s님의 %s운을 보겠습니다\n", name, job);
		}
		else {
			String health = "건강";
	        System.out.printf("%s님의 %s운을 보겠습니다\n", name, health);
		}
		System.out.println("");
		try {
			System.out.println("카드를 섞겠습니다. 3초간 집중하시고... ");
			Thread.sleep(1000);
			System.out.println("3");
			Thread.sleep(1000);
			System.out.println("2");
			Thread.sleep(1000);
			System.out.println("1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("\n1~44 중 마음에 드는 카드를 선택해 주세요^0^ ");
		int cardnum = Integer.parseInt(sc.nextLine());
		System.out.printf("%s카드를 선택했습니다! 카드의 기본적 의미는%s 이고\n", cardnum, ??);
		System.out.printf("%s카드가 말해주는 당신의 최근 연애운은  %s \n", cardnum,??);
		
		
		
		
	}
	
	
	
}
