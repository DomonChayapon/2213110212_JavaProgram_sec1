import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] radius = new double[5];
		double[] height = new double[5];
		for(int i =0;i<=4;i++) {
			System.out.print("Input radius,height "+(i+1)+":");
			 radius[i] = scan.nextDouble();
			 height[i] = scan.nextDouble();
		}
		
		for(int i=0;i<=4;i++) {
			Cylinder cy = new Cylinder(radius[i],height[i]);
			System.out.println("Cylinder "+(i+1)+", volume="+cy.getVolume());
		}
	}

}
