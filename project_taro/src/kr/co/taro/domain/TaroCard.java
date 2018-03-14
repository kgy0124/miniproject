package kr.co.taro.domain;

public class TaroCard {
	 // 식별자 
    private String cardId;

    // 정방향 이름 
    private String cardName;

    // 기본설명 
    private String basicM;

    // 상세 설명 
    private String detailM;
    

    public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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
