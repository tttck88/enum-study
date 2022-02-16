package com.company;

public enum ColorOverride {

	RED("빨강",100) {
		@Override
		public int calc(int a, int b) {
			return a+b;
		}
	}, GREEN("초록",10) {
		@Override
		public int calc(int a, int b) {
			return a-b;
		}
	}, BLUE("파랑",30) {
		@Override
		public int calc(int a, int b) {
			return a*b;
		}
	};

	private String koreName;
	private int pay;

	private ColorOverride(String koreName, int pay) {
		this.koreName = koreName;
		this.pay = pay;
	}

	public void colorInfo(){
		System.out.println(koreName +"의 비용은 " + pay +"입니다.");
	}

	public abstract int calc(int a, int b);
}
