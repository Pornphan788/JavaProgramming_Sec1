import java.io.*;
public class PiggyBank {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public	int one;
	public	int two;
	public	int five;
	public	int ten;
	public	int size;

 
	public  void setPiggyBank(int s) 
	{
		Clear();
		size = s;
	}//SPGB
	public int getPiggyBank() 
	{
		return size;
	}
	public  void Clear() 
	{
		one=0;
		two=0;
		five=0;
		ten=0;
	}//Clear
	public  int getTotal() 
	{
		return one + (2*two)+(5*five)+(10*ten);
	}//GTT
	public  void addOne(int c) 
	{
		if(getTotal()+c<=size) 
		{
			one = one+c;
		}//end if
		else 
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}//end else
	}//AO
	public  void addTwo(int c) 
	{
		if(getTotal()+(c*2)<=size) 
		{
			two = two+c;
		}//end if
		else 
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}//end else
	}//AT
	public  void addFive(int c) 
	{
		if(getTotal()+(c*5)<=size) 
		{
			five = five+c;
		}//end if
		else 
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}//end else
	}//AF
	public  void addTen(int c) 
	{
		if(getTotal()+(c*10)<=size) 
		{
			ten = ten+c;
		}//end if
		else 
		{
			System.out.println(ANSI_RED + "Piggy Bank Full" + ANSI_RESET);
		}//end else
	}//ATEN

}//PGB