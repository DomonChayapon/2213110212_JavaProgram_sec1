import java.util.*;
import java.time.Year;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book b1 = new Book();
		System.out.print("Input book title : ");
		b1.setTitle(scan.nextLine());
		System.out.print("Input book Price : ");
		b1.setPrice(scan.nextFloat());
		System.out.print("Input publish year : ");
		b1.setPublishyear(scan.nextInt());
		System.out.println();
		System.out.println(b1);
	}

}
