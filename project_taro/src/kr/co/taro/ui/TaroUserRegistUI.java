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
		
		String result = "";
		while(true) {
		result = getStr(">> 회원등록을 하시겠습니까 ( Y : 회원등록 / N : 메뉴로 돌아가기 ) : ");
		if(result.equalsIgnoreCase("N")) {
			System.out.println(">> 메뉴로 돌아갑니다 <<");
			return;
		} else if(result.equalsIgnoreCase("Y")) {
			System.out.println();
			System.out.println(">> 회원 등록을 진행하겠습니다 ...<<");
			System.out.println();
			break;
		} else 
			System.out.println();
			System.out.println(">> 올바른 값이 아닙니다. 다시 입력해주세요  <<");
			System.out.println();
			continue;
		}
			TaroUser user = new TaroUser();
		
			String userId = "";
			while(true) {
				userId = (getStr(">> 사용하실 ID를 입력해주세요 : "));
				String idResult = mapper.userIdSelect(userId);
				if(idResult == null) {
					System.out.println(">> 사용 가능한 ID입니다 <<");
					break;
				}
				System.out.println(">> 이미 가입된 ID입니다 <<");
				continue;
			}
			user.setId(userId);
				
			
			
			user.setName(getStr(">> 이름을 입력해주세요 : "));

			String birth = "";
			while(true) {
				birth = getStr(">> 생년월일을 입력해주세요 (ex 12341211) : ");
				if(birth.length() != 8) {
					System.out.println();
					System.out.println(">> 생년월일을 양식에 맞게 입력해주세요 <<");
					System.out.println();
				} else break;
			}
			user.setBirth(birth);	
			
			String pass = "";
			while(true) {
				pass = (getStr(">> 생성하실 비밀번호를 입력해주세요 : "));
				String respass = getStr(">> 비밀번호 재확인 : ");
				if(pass.equals(respass)) {
					System.out.println(">> 비밀번호가 확인되었습니다 <<");
				} else {
					System.out.println(">> 올바르지 않은 비밀번호를 입력하셨습니다 <<");
					System.out.println(">> 비밀번호 초기설정 화면으로 돌아갑니다 <<");
					continue;
				}
				break;
				
			}	
			user.setPassword(pass);
			
			mapper.userInsert(user);
			// 회원 등록중 메시지에 대기시간을 주어 로딩하는 것처럼 표현하는 코드
			System.out.println(">> 회원등록중 <<");
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(500);
					System.out.print(".");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
		
		
			System.out.println(">>회원 등록이 완료 되었습니다 <<");
	}
}