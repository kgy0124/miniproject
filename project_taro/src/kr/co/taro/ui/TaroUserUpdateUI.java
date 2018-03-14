package kr.co.taro.ui;

import taro.ui.BaseUI;

/**
 * 회원 정보 수정 프로그램
 * @author eunj2n
 *
 */

public class TaroUserUpdateUI extends BaseUI{

	public void service() {
		System.out.println("--------------------------");
		System.out.println(">> 회원정보 수정을 선택하셨습니다 <<");
		System.out.println("--------------------------");
		
		getStr(">> 회원정보 수정을 하시겠습니까 ( Y : 회원정보 수정 / N : 메뉴로 돌아가기 ) : ");
		
		//회원확인
		getStr(">> ID를 입력해주세요 : ");
		getStr(">> 비밀번호를 입력해주세요 : ");
		
			// 틀린 정보일시..
		System.out.println(">> 입력하신 회원님의 정보가 올바르지 않습니다 <<");
		//다시 위로 리턴
		
			// 올바른 정보일시..
		System.out.println(">> 회원정보가 확인되었습니다 <<");
		System.out.println("--------------------------");
		if(getInt(">> 수정할 정보를 선택해주세요 ( 1. 생년월일 / 2. 비밀번호 ) : ") == 1 ) {
			// 1번 선택시(생년월일)
			getInt(">> 수정하실 생년월일을 입력해주세요 (ex 12341211) : ");
			
				// 입력된 숫자가 8자리일시
			System.out.println(">> 정상적으로 생년월일이 수정되었습니다 <<");
		
				// 입력된 값이 숫자 8자리가 아닐시
			System.out.println(">> 생년월일 양식이 올바르지 않습니다.<<");
			
			System.out.println(">> 메뉴로 돌아갑니다 <<");
			return;
		} else if(getInt(">> 수정할 정보를 선택해주세요 ( 1. 생년월일 / 2. 비밀번호 ) : ") == 2){
			// 2번 선택시(비밀번호)
			getStr(">> 수정하실 비밀번호를 입력해주세요 : ");
			System.out.println(">> 정상적으로 비밀번호가 수정되었습니다 <<");
			System.out.println(">> 메뉴로 돌아갑니다 <<");
			return;
		}
		
		
		
		
	}
}
