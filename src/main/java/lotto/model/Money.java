package lotto.model;

public class Money {
	private static final int LOTTO_PRICE = 1000;

	private final int money;

	public Money(String strMoney) {
		money = Integer.parseUnsignedInt(strMoney);
	}
}