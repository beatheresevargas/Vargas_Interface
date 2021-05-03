package Jukebox;

public class TestJukebox {

	public static void main(String[] args)
	{
		System.out.println("insert 1 coin to play a song...");
		
		Jukebox jukebox = new Jukebox();
		user User = new user(1);
		
		User.insertCoin(jukebox, 1);
		User.insertCoin(jukebox, 0);
		
	}
}

