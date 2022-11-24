import java.util.Scanner;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// Declare constants
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; // Terminating value for input
		// Declare variables
		int sales; // Input gross sales
		double salary; // Salary to be computed
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("##,###.00");
		
		do{
			System.out.print("Enter sales in dollars (or -1 to end):");
			sales = scan.nextInt();
		}while(sales !=-1); 
		System.out.print("bye");
	}

}
