package Chain;

public class ATM implements Iterator {
	private int amount;
	
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	sysout
	public void withdraw() {
		Coin coin = new Coin100();
		coin.separateCoins(amount);
		
	}

}
