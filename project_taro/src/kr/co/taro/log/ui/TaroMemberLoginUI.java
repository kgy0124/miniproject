package kr.co.taro.log.ui;

import kr.co.taro.detailedUI.LoginCheck;
import kr.co.taro.domain.TaroUser;
import kr.co.taro.ui.BaseUI;
import kr.co.taro.ui.TaroUI;

public class TaroMemberLoginUI extends BaseUI {

	@Override
	public void service() {
		while(true) {
			System.out.println("=======================================");
			System.out.println("|              [회원  로그인]              |");
			System.out.println("=======================================");
			// 신규 테이블 생성 후 id와 password 입력 받기
			TaroUser t = new TaroUser();
		
			// 위에서 입력 받은 테이블로 db에서 정보 받아 온 후 userTmp에 넘겨주기
			// userTmp와 t의 id, password 일치 여부 체크
			// 이상 없다면 로그인 완료를 날리고 return
			// 불일치로 로그인 실패인 경우 continue
			// [                 여기에 코드 작성                                      ]
			LoginCheck check=new LoginCheck();
			check.service();
			
			TaroUI.usertmp = t;
			return;
		}
	}
}
