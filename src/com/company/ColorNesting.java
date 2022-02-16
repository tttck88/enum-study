package com.company;

public enum ColorNesting {
	RED("빨강",100,CheckPay.RED ), GREEN("초록",30,CheckPay.RED), BLUE("파랑",49,CheckPay.BLUE);

	private String koreName;
	private int pay;
	private CheckPay checkPay;

	ColorNesting(String koreName, int pay, CheckPay checkPay) {
		this.koreName = koreName;
		this.pay = pay;
		this.checkPay = checkPay;
	}

	public int calc() {
		return this.checkPay.calc(pay);
	}

	private enum CheckPay{
		RED {
			@Override
			public int calc(int pay) {
				return pay * 100;
			}
		}, BLUE{
			@Override
			public int calc(int pay) {
				return pay * 50;
			}
		};
		public abstract int calc(int pay);
	}
}
