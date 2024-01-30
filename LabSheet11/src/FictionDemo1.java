import java.util.Scanner;

public class FictionDemo1 {
	public static void main (String[] args) {
	Scanner srn = new Scanner(System.in);

	System.out.print("Input Title :");
	String Btitle = srn.nextLine();
	System.out.print("Input public year : ");
	int year = srn.nextInt();
	FictionBook Book = new FictionBook(Btitle,year);
	System.out.print("Input Author name : ");
	String ATname = srn.nextLine();
	Book.setAuthorName(ATname);
	
	System.out.print("Author email : ");
	String authorEmail = srn.nextLine();
	Book.setEmail(authorEmail);
	while(!Book.CheckEmail()) {
		System.out.print("Input Author email again : ");
		authorEmail = srn.nextLine();
		Book.setEmail(authorEmail);
	}
	System.out.println(Book);
	}
	
}

