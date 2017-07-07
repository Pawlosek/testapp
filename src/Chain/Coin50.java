package Chain;

public class Coin50 implements Coin {

	private static final int coinValue=50;
	
	@Override
	public void separateCoins(int amount) {
		if(amount>0)
		{
			System.out.println("Coins of value "+coinValue+":" + (amount-amount%coinValue)/coinValue);
			amount%=coinValue;
			Coin20 newCoinSeperataor = new Coin20();
			newCoinSeperataor.separateCoins(amount);	
		}
		
	}

}
