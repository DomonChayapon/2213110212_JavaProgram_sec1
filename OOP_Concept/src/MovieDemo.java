import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id :");
		String Mid = scan.nextLine();
		System.out.print("Input movie name :");
		String Mname = scan.nextLine();
		System.out.println();
		System.out.print("Input director name :");
		String Dname = scan.nextLine();
		System.out.print("Input director e-mail :");
		String Demail = scan.nextLine();
		System.out.print("Input director gender :");
		String Dgender = scan.nextLine();
		while(!(Dgender=="m"||Dgender=="M"||Dgender=="f"||Dgender=="F")) {
			System.out.print("Input director gender, again :");
			Dgender = scan.nextLine();
		}
		System.out.println();
		System.out.print("Input Movie theater no. :");
		int theater = scan.nextInt();
		while(!(theater>=1&&theater<=15)) {
			System.out.print("Please input 1 - 15 only :");
			theater = scan.nextInt();
		}
		System.out.println();
		Theater theater = new Theater(Mid,Mname,Dname,Demail,Dgender,theater);
		System.out.print(theater);
	}

}
