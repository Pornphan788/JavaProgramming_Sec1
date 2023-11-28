import java.util.Scanner;
public class lab401 {

	public static void main(String[] args) {

		Scanner srn = new Scanner(System.in);
		System.out.print("Input value of X :");
		int x = srn.nextInt();
		System.out.print("Input value of Y :");
		int y= srn.nextInt();
		int sum=0;
		while (x>y) 
		{
			System.out.print("Input value of Y, again :");
			y= srn.nextInt();
		}
		
		System.out.println();
		while(x<y) {
			
			sum=x++;
			int total = sum+x;
		
			System.out.println(sum+" + "+x+" = "+total);
			
		}
	}
}
