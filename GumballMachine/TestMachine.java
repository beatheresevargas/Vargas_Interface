package GumballMachine;

public class TestMachine {

	public static void main (String[] args)
	{
		System.out.println("1 gumball = 2 coins" + "\n");
		
		GumballMachine gumballMachine = new GumballMachine();
		Person person = new Person(4);
		
		person.insertCoin(gumballMachine, 6);
		System.out.println();
		person.insertCoin(gumballMachine, 3);
		System.out.println();
		person.insertCoin(gumballMachine, 1);
		System.out.println();
		person.insertCoin(gumballMachine, 4);
		System.out.println();
	}
}
