package Jukebox;

public class user {
	
	public user(int coins)
	{
	}
	
	public void insertCoin(coin Coin, int coins)
	{
		System.out.println("\n\ncoins inserted: " + coins);
		
		if (coins > 0)
		{
			if(!coin.insertCoin())
			{
				System.out.print("now playing: I Love You 3000 by Jackson Wang");
			}
			
		}
		
		if (coins == 0)
		{
			System.out.print("no song is currently playing");
		}
		
		
	}

}
