package kr.co.taro.domain;

import java.util.Date;

//이전운세 저장테이블 
public class TaroUserDb {

 // 회원아이디 
 private String id;

 // 등록일 
 private Date regDate;

 // 식별자 
 private String listId;
 
 // 카드 번호
 private int no;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public Date getRegDate() {
	return regDate;
}

public void setRegDate(Date regDate) {
	this.regDate = regDate;
}

public String getListId() {
	return listId;
}

public void setListId(String listId) {
	this.listId = listId;
}

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
} 


 
 
 
 
// list.get(i).sdf.format(getRegDate()).startsWith("2018"))
 
}