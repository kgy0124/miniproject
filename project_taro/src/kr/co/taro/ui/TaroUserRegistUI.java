package kr.co.taro.ui;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.mapper.TaroUserMapper;

/**
 * 회원 등록 프로그램
 * @author eunj2n
 *
 */
public class TaroUserRegistUI extends BaseUI{
	private TaroUserMapper mapper;
	
	public TaroUserRegistUI(TaroUserMapper mapper) {
		this.mapper = mapper;
	}
	
	public void service() {
		System.out.println("--------------------------");
		System.out.println(">> 회원등록을 선택하셨습니다 <<");
		System.out.println("--------------------------");
		
		getStr(">> 회원등록을 하시겠습니까 ( Y : 회원등록 / N : 메뉴로 돌아가기 ) : ");
		
		// Y입력시
		TaroUser user = new TaroUser();
		
		user.setId(getStr(">> 사용하실 ID를 입력해주세요 : "));
		user.setName(getStr(">> 이름을 입력해주세요 : "));
		user.setBirth(getStr(">> 생년월일을 입력해주세요 (ex 12341211) : "));
			// 숫자 8자리가 아닐시 되묻기
			getInt(">> 생년월일을 양식에 맞게 입력해주세요  (ex 12341211) : ");
		user.setPassword(getStr(">> 설정하실 비밀번호를 입력해주세요 : "));
		String respass = getStr(">> 비밀번호 재확인 : ");
		if(user.getPassword() != respass) {
			// 비밀번호가 같지 않을시 비밀번호 설정으로
			System.out.println(">> 비밀번호 초기설정 화면으로 돌아갑니다 <<");
			user.setPassword(getStr(">> 설정하실 비밀번호를 입력해주세요 : "));
			
		}
		
		System.out.println(">>회원 등록이 완료 되었습니다 <<");
		
		// N 입력시
		System.out.println(">> 메뉴로 돌아갑니다 <<");
		
	}
}
