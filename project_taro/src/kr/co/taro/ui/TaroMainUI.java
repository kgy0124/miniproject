package kr.co.taro.ui;

import java.util.Scanner;

public class TaroMainUI {
	public TaroMainUI() {}

	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("|            [타마 타로 프로그램]            |");
		System.out.println("=======================================");
		System.out.println("| 1. 회원 등록                                                              |");
		System.out.println("---------------------------------------");
		System.out.println("| 2. 회원 정보 수정                                                       |");
		System.out.println("---------------------------------------");
		System.out.println("| 3. 회원 탈퇴                                                              |");
		System.out.println("---------------------------------------");
		System.out.println("| 4. 회원 타로 보기                                                       |");
		System.out.println("---------------------------------------");
		System.out.println("| 5. 비회원 타로 보기                                                    |");
		System.out.println("---------------------------------------");
		System.out.println("| 0. 타마 타로 끝내기                                                    |");
		System.out.println("=======================================");
		System.out.print(">> 메뉴 선택 : ");
		return Integer.parseInt(sc.nextLine());
	}

	
	public void quit() {
		try {
			System.out.println("\n>> 타로는 순전히 재미로만 보시는 것을 권해 드려요~ <<");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(">> 타로 프로그램을 종료합니다. <<");
		System.exit(0);
	}
}
