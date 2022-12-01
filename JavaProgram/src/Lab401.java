import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		int space= fullName.indexOf(' ');
		if(space == -1) {
			System.out.print("incorrect");
		}
		else {
			System.out.println("first Name: "+fullName.substring(0,space).toUpperCase());
			System.out.println("last  Name: "+fullName.substring(space+1).toLowerCase());
		}
	}

}
