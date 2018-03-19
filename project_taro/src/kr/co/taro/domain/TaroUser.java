package kr.co.taro.domain;

public class TaroUser {
	    // 회원아이디 
	    private String id;
	    // 이름 
	    private String name;
	    // 생년월일 
	    private String birth;
	    // 비밀번호 
	    private String password;

		public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getBirth() {
	        return birth;
	    }

	    public void setBirth(String birth) {
	        this.birth = birth;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

}

