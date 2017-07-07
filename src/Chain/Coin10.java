package Chain;

public class Coin10 implements Coin {

	private static final int coinValue=10;
	
	@Override
	public void separateCoins(int amount) {
		if(amount>0)
		{
			System.out.println("Coins of value "+coinValue+":" + (amount-amount%coinValue)/coinValue);
			amount%=coinValue;
		}
		System.out.println("Alles klar.");
		
	}

}
