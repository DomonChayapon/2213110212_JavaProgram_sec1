import javax.swing.*;
public class MusicWorldApp {

	public static void main(String[] args) {
		String cdIdstr;
		String cdTitle;
		String cdQuantitystr;
		String cdPricestr;
		double cdSubtotal;
		double cdTotal;
		final double TAX_RATE = .0625;
		cdIdstr = JOptionPane.showInputDialog("This program calculates the total cost of a CD order"
				+ "\nPlease enter the ID of the CD");
		int cdId = Integer.parseInt(cdIdstr);
		cdTitle = JOptionPane.showInputDialog("Please enmter the title of the CD");
		cdPricestr = JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars");
		double cdPrice = Double.parseDouble(cdPricestr);
		cdQuantitystr = JOptionPane.showInputDialog("Please enter the quantily tobe purchased");
		int cdQuantity = Integer.parseInt(cdQuantitystr); 
		cdSubtotal = cdPrice * cdQuantity;
		cdTotal = cdSubtotal * (1 + TAX_RATE);
		double Tax = TAX_RATE*100;
		JOptionPane.showMessageDialog(null,
				"Summary of the transaction:"+
				"\n\nCD ID: "+cdId+
				"\nCD Title: "+cdTitle+
				"\nCD Unit Price: $"+cdPrice+
				"\nCD Quantity: "+cdQuantity+
				"\n\nSubtotal: $"+cdSubtotal+
				"\nTax rate: "+Tax+"%"+
				"\nTotal: $"+cdTotal+
				"\n\nEnd of Program");
		
	}

}
