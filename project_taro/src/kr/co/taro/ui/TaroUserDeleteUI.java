package kr.co.taro.ui;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.mapper.TaroUserMapper;

/**
 * 회원 탈퇴 프로그램
 * @author eunj2n
 *
 */
public class TaroUserDeleteUI extends BaseUI{
	private TaroUserMapper mapper;
	private TaroUser user = new TaroUser();
	
	
	public TaroUserDeleteUI() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void service() {
		System.out.println("--------------------------");
		System.out.println(">> 회원 탈퇴를 선택하셨습니다 <<");
		System.out.println("--------------------------");
		
		String result = "";
		while(true) {
			result = getStr(">> 회원정보 수정을 하시겠습니까 ( Y : 회원탈퇴진행 / N : 메뉴로 돌아가기 ) : ");
			if(result.equalsIgnoreCase("N")) {
				System.out.println(">> 메뉴로 돌아갑니다 <<");
				return;
			} else if(result.equalsIgnoreCase("Y")) {
				System.out.println();
				System.out.println(">> 회원 탈퇴를 진행하겠습니다 ...<<");
				System.out.println();
				break;
			} else {
				System.out.println();
				System.out.println(">> 올바른 값이 아닙니다. 다시 입력해주세요  <<");
				System.out.println();
				continue;
			}
		}
		
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
}
