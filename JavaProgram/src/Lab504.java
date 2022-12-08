import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		String firstName = fullname.substring(0,(fullname.indexOf(" ")));
		abbreviatName(fullname);
		System.out.println(abbreviatName(fullname)+firstName);
	}//end of main()
	
	public static String abbreviatName(String fullname) {
		String letter = "";
		for(int i = 0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				letter = (letter + fullname.charAt(i+1)).toUpperCase();
				letter = letter + ".";
			}
		}
		return letter;
	}

}
