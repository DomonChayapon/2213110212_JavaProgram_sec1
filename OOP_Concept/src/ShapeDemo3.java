import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		double[] radius = new double[5];
		double[] height = new double[5];
		double[] Volume =new double[5];
		for(int i =0;i<=4;i++) {
			String str = JOptionPane.showInputDialog("Input radius,hight "+(i+1)+":");
			String[] input = str.split(" ");
			radius[i] = Double.parseDouble(input[0]);
			height[i] = Double.parseDouble(input[1]);
			 Cylinder cy = new Cylinder(radius[i],height[i]);
			 Volume[i] = cy.getVolume();
		}
		
		JOptionPane.showMessageDialog(null,"Cylinder 1 , volume="+Volume[0]+
				"\nCylinder 2 , volume="+Volume[1]+
				"\nCylinder 3 , volume="+Volume[2]+
				"\nCylinder 4 , volume="+Volume[3]+
				"\nCylinder 5 , volume="+Volume[4]);
	}

}
