package kr.co.taro.detailedUI;

import kr.co.taro.domain.TaroUser;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroUI;


public class LoginCheck extends BaseUI{
	
	public void service() {
		
		while(true) {
			System.out.println("==================================================================");
			System.out.println("                            [사용자 로그인]                           ");
			System.out.println("------------------------------------------------------------------");
			
			TaroUser user=new TaroUser(); //테스트 위한 타로 클래스
			
			user.setId(getStr(">> 아이디를 입력하십시오 : "));
			user.setPassword(getStr(">> 패스워드를 입력하십시오 : "));
					
			user = TaroUI.userMapper.loadInfo(user);
			TaroUI.usertmp = user;

			System.out.print(">> 로그인 시도");
			
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(700);;
					System.out.print(".");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			
			if(TaroUI.usertmp == null) {
				System.out.println(".......................................");
				System.out.println(">>             로그인 실패                                  <<");
				System.out.println(">>   일치하는 아이디,비밀번호가 존재하지 않습니다       <<");
				System.out.println(".......................................");
				continue;
			}
			System.out.println(".......................................");
			System.out.println(">>       로그인 성공_" + TaroUI.usertmp.getName() +"님 환영합니다.       <<");
			System.out.println(".......................................");	
			break;
			}
		}
	}

