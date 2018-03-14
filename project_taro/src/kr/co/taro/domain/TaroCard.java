package kr.co.taro.domain;

public class TaroCard {
	 // 식별자 
    private String cardId;

    // 정방향 이름 
    private String nameUp;

    // 역방향 이름 
    private String nameDo;

    // 기본설명 
    private String basicM;

    // 상세 설명 
    private String detailM;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getNameUp() {
        return nameUp;
    }

    public void setNameUp(String nameUp) {
        this.nameUp = nameUp;
    }

    public String getNameDo() {
        return nameDo;
    }

    public void setNameDo(String nameDo) {
        this.nameDo = nameDo;
    }

    public String getBasicM() {
        return basicM;
    }

    public void setBasicM(String basicM) {
        this.basicM = basicM;
    }

    public String getDetailM() {
        return detailM;
    }

    public void setDetailM(String detailM) {
        this.detailM = detailM;
    }

}
