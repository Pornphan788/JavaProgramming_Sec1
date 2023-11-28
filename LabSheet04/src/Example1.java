import java.util.*;
public class Example1 {

	public static void main(String[] args) {

		Scanner srn = new Scanner(System.in);
		
		System.out.print("Input number :");
		int previousNumber = srn.nextInt();
		int currentNumber;
		
		while(true) 
		{
			System.out.print("Input number :");
			currentNumber =srn.nextInt();
			if(currentNumber<previousNumber) 
			{
				System.out.print("\nBYE BYE");
				break;
			}//end
			previousNumber = currentNumber;
		}//end

	}

}
