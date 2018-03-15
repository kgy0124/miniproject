package kr.co.taro.ui;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.mapper.TaroUserMapper;

/**
 * 회원 정보 수정 프로그램
 * @author eunj2n
 *
 */

public class TaroUserUpdateUI extends BaseUI{
	private TaroUser user = new TaroUser();
	

	public TaroUserUpdateUI() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void service() {
		System.out.println("--------------------------");
		System.out.println(">> 회원정보 수정을 선택하셨습니다 <<");
		System.out.println("--------------------------");
		
		String result = "";
		while(true) {
			result = getStr(">> 회원정보 수정을 하시겠습니까 ( Y : 회원정보 수정 진행 / N : 메뉴로 돌아가기 ) : ");
			if(result.equalsIgnoreCase("N")) {
				System.out.println(">> 메뉴로 돌아갑니다 <<");
				return;
			} else if(result.equalsIgnoreCase("Y")) {
				System.out.println();
				System.out.println(">> 회원정보 수정을 진행하겠습니다 ...<<");
				System.out.println();
				break;
			} else {
				System.out.println();
				System.out.println(">> 올바른 값이 아닙니다. 다시 입력해주세요  <<");
				System.out.println();
				continue;
			}
		}
		
		//회원확인
		getStr(">> ID를 입력해주세요 : ");
		getStr(">> 비밀번호를 입력해주세요 : ");
		getInt(">> 수정할 정보를 선택해주세요 ( 1. 생년월일 / 2. 비밀번호 ) : ")); 
		
		birthReg(getStr(">> 수정하실 생년월일을 입력해주세요 (ex 12341211) : "));
		passwordReg(getStr(">> 수정하실 비밀번호를 입력해주세요 : "));
		
		
			
		}
	}
}