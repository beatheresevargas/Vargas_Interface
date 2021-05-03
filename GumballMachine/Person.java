package GumballMachine;

public class Person {

	private int coins;
	private int price;
	
	public Person(int coins)
	{
		this.coins = coins;
		this.price = 2;
	}
	
	public void insertCoin (Coinable coinable, int coins)
	{
		System.out.println("coins inserted: " + coins);
		
		if(coins >0)
		{
			if(!coinable.insertCoin())
			{
				System.out.println("coins refunded");
			}
			else
			{
				coins = coins - price;
				System.out.println("Change: " + coins);
			}
		}
		else
		{
			System.out.println("Coins are not enough. " + coins + " coins returned.");
		}
	}
}
