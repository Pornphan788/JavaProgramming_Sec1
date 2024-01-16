import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
	
		Scanner srn = new Scanner(System.in);
		System.out.print("Input author name   : ");
		String name = srn.nextLine();
		System.out.print("Input author email  : ");
		String email = srn.nextLine();
		System.out.print("Input author gender : ");
		char gender = srn.next().charAt(0);
		Author author = new Author(name , email , gender);
		System.out.println();
		System.out.println(author);

	}

}
