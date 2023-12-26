import java.util.*;

public class Lab703 {

	public static void main(String[] args) {

		Scanner srn = new Scanner(System.in);
		int numbers[] = {78,36,58,41,25,92,75};
		int inputnumber;
		System.out.print("Input index of array : ");
		
		inputnumber = srn.nextInt();
		
		while(inputnumber<0||inputnumber>=numbers.length) 
		{
			System.out.print("Input index of array, again : ");
			inputnumber = srn.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Value in current index is "+numbers[inputnumber]);
		
		if(inputnumber==(numbers.length-1)) 
		{
			System.out.println("Sorry, "+inputnumber+" is the last index in array.");
		}
		else 
			System.out.println("Value in next    index is "+numbers[inputnumber+1]);
	}

}
