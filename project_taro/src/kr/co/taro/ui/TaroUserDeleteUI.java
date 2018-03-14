package kr.co.taro.ui;

/**
 * 회원 탈퇴 프로그램
 * @author eunj2n
 *
 */
public class TaroUserDeleteUI extends BaseUI{

	public void service() {
		System.out.println("--------------------------");
		System.out.println(">> 회원탈퇴를 선택하셨습니다 <<");
		System.out.println("--------------------------");
		
		getStr(">> 회원탈퇴를 하시겠습니까 ( Y : 회원탈퇴 / N : 메뉴로 돌아가기 ) : ");

		// 회원확인
		getStr(">> ID를 입력해주세요 : ");

		getStr(">> 비밀번호를 입력해주세요 : ");
		
		// 틀린 정보일시..
		System.out.println(">> 입력하신 회원님의 정보가 올바르지 않습니다 <<");
		
		// 맞는 정보일시
		// 탈퇴의사 확인
		getStr(">> 정말로 Taro회원 탈퇴하시겠습니까? ( Y : 회원탈퇴 / N : 메뉴로 돌아가기 ) : ");
		
		// Y선택시
		System.out.println(">> 정상적으로 탈퇴처리 되었습니다 <<");
		System.out.println(">> 메뉴로 돌아갑니다 <<");
		
		// N선택시
		System.out.println(">> 메뉴로 돌아갑니다 <<");
		
	}
}
