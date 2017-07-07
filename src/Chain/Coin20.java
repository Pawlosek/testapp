package Chain;

public class Coin20 implements Coin {

	private static final int coinValue=20;
	
	@Override
	public void separateCoins(int amount) {
		if(amount>0)
		{
			System.out.println("Coins of value "+coinValue+":" + (amount-amount%coinValue)/coinValue);
			amount%=coinValue;
			Coin10 newCoinSeperataor = new Coin10();
			newCoinSeperataor.separateCoins(amount);	
		}
		
	}

}
