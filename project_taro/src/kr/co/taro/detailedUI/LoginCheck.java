package kr.co.taro.detailedUI;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroUI;


public class LoginCheck extends BaseUI{
	
	public void service() {
		
		while(true) {
			TaroUser user=new TaroUser(); //테스트 위한 타로 클래스
			System.out.println("로그인 화면");
			
			System.out.print("아이디를 입력하십시오:");
			String id=sc.nextLine();
			user.setId(id);
			
			System.out.print("패스워드를 입력하십시오:");
			String password=sc.nextLine();
			user.setPassword(password);
					
			user=TaroUI.userMapper.loadInfo(user);
			if(user==null) {
				System.out.println("일치하는 아이디,비밀번호가 존재하지 않습니다.");
				continue;
			}

			System.out.println(user.getName() +"님 환영합니다.");
			TaroUI.userMapper.logInStatus(user.getId());
		
			break;
			}
	}

	}
