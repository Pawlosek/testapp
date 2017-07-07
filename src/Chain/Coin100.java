package Chain;

public class Coin100 implements Coin {

	private static final int coinValue=100;
	
	@Override
	public void separateCoins(int amount) {
		if(amount>0)
		{
			System.out.println("Coins of value "+coinValue+":" + (amount-amount%coinValue)/coinValue);
			amount%=coinValue;
			Coin50 newCoinSeperataor = new Coin50();
			newCoinSeperataor.separateCoins(amount);	
		}
	}

}
