import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputData = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		Product[] CheckStockProduct = new Product [inputData.nextInt()];
		
		for (int i=0;i<CheckStockProduct.length;i++) {
			CheckStockProduct[i] = new Product();
			
		}
	}

}
