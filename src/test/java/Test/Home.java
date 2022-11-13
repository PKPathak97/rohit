package Test;

import org.testng.annotations.Test;

public class Home {
	
	@Test
	public void homemade()
	{
		System.out.println("home cooked");
	}

	@Test
	public void multiplication()
	{
		int a =5;
		int b=6;
		int c =a*b;
		System.out.println(c);
	}
}
