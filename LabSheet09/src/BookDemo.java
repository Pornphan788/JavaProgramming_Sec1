import java.util.Scanner;

public class BookDemo {



	public static void main(String[] args) {
		
		Book book = new Book();

		Scanner srn = new Scanner(System.in);
		System.out.print("Input book title : ");
		book.setTitle(srn.nextLine());
		System.out.print("Input book price : ");
		book.setPrice(srn.nextFloat());
		System.out.print("Input publih year : ");
		book.setPublishyear(srn.nextInt());
		System.out.println();
		System.out.print(book.toString());
		
	}

}
