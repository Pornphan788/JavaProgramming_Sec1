import java.util.*;
public class TestPiggyBank {
	
	static PiggyBank pb = new PiggyBank();
	static Scanner srn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		inputCoin();
		mainmenu();
		
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
	}//main
	
	public static void inputCoin() 
	{
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of PiggyBank :");
		int sizeofPiggyBank = srn.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Sie of your PiggyBank: "+pb.getPiggyBank());
	}//end input
	
	public static void mainmenu() 
	{

		while(true) 
		{
			System.out.print("\n=======================\nMunu of piggyBank"
					+ "\n======================="
					+ "\n[1] one baht."
					+ "\n[2] two baht."
					+ "\n[3] five baht."
					+ "\n[4] ten baht."
					+ "\n[5] Exit."
					+ "\n=======================\n");
			System.out.print("Pease SelectMenu[1-5] : ");
			int SLM = srn.nextInt();
			if(SLM==1) 
			{
				System.out.print("Insert 1 Baht Money: ");
				int IM = srn.nextInt();
				pb.addOne(IM);
				pb.getTotal();
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(SLM==2) 
			{
				System.out.print("Insert 2 Baht Money: ");
				int IM = srn.nextInt();
				pb.addTwo(IM);
				pb.getTotal();
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(SLM==3) 
			{
				System.out.print("Insert 5 Baht Money: ");
				int IM = srn.nextInt();
				pb.addFive(IM);
				pb.getTotal();
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(SLM==4) 
			{
				System.out.print("Insert 10 Baht Money: ");
				int IM = srn.nextInt();
				pb.addTen(IM);
				pb.getTotal();
				System.out.println("Money Total : "+pb.getTotal());
			}
			else
			{
				System.out.print("Bye Bye");
				break;
			}
		}
	}
		
}//TestPGB
