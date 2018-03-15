package kr.co.taro.ui;

import kr.co.taro.dao.TaroDAO;
import kr.co.taro.domain.TaroUser;
import kr.co.taro.mapper.TaroUserMapper;
import kr.co.taro.ui.tarouserui.TaroBirthCheckUI;
import kr.co.taro.ui.tarouserui.TaroPasswordCheckUI;
import kr.co.taro.ui.tarouserui.TaroUserIdCheckUI;

/**
 * 회원 등록 프로그램
 * @author eunj2n
 *
 */
public class TaroUserRegistUI extends BaseUI{
	protected TaroUser user = new TaroUser();
	private TaroUserMapper mapper;
	
	public TaroUserRegistUI() {
		super();
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
		new TaroUserIdCheckUI().service();
		
		TaroDAO.user.setName(getStr(">> 이름을 입력해주세요 : "));
		
		new TaroBirthCheckUI().service();	
		
		new TaroPasswordCheckUI().service();
			
		TaroDAO.userMapper.userInsert(TaroDAO.user);
			
		System.out.print(">> 회원등록중");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(500);
				System.out.print(".");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\n\n>>회원 등록이 완료 되었습니다 <<\n");
		return;
	}
			

}

