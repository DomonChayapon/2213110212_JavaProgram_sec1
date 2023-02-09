import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double radius = scan.nextDouble();
		double height = scan.nextDouble();
		Circle cr = new Circle(radius,null);
		System.out.println("Circle[radius="+radius+"]");
		System.out.println("Circle[area="+cr.getArea()+"]");
		System.out.println();
		System.out.println("Cylinder[height="+height+",radius"+radius+"]");
		Cylinder cy = new Cylinder(radius,height);
		System.out.println("Cylinder[area="+cy.getArea()+"]");
		System.out.println("Cylinder[height="+cy.getVolume()+"]");
	}

}
