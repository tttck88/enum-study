package com.company;

public enum ColorAttr {

	RED("빨강",100), GREEN("초록",10), BLUE("파랑",30);

	private String koreName;
	private int pay;
	
	// 빨강, 100 순서대로 할당
	private ColorAttr(String koreName, int pay) {
		this.koreName = koreName;
		this.pay = pay;
	}

	public void colorInfo(){
		System.out.println(koreName +"의 비용은 " + pay +"입니다.");
	}
}
