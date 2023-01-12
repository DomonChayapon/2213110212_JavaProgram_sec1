import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumber1.setBounds(55, 11, 99, 41);
		contentPane.add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumber2.setBounds(55, 63, 99, 33);
		contentPane.add(lblNumber2);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(210, 19, 180, 27);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(210, 67, 180, 27);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JComboBox cmbOperator = new JComboBox();
		cmbOperator.setBounds(210, 110, 65, 22);
		cmbOperator.addItem("+");
		cmbOperator.addItem("-");
		cmbOperator.addItem("*");
		cmbOperator.addItem("/");
		contentPane.add(cmbOperator);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//sum = num1+num2;
					operator = (String)cmbOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					//JRadioButton
					if(oneDigit.isSelected())
						frmNumber = new DecimalFormat("#,###.0");
					else if(twoDigit.isSelected())
						frmNumber = new DecimalFormat("#,###.00");
					
					lblResult.setText(String.format("%.2f",sum));
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1 Digit");
		rdbtnNewRadioButton.setBounds(210, 149, 65, 23);
		contentPane.add(rdbtnNewRadioButton);
		                                             
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2 Digit");
		rdbtnNewRadioButton_1.setBounds(281, 149, 65, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		btnOK.setBounds(115, 217, 87, 33);
		contentPane.add(btnOK);
		
		JButton btnCancel = new JButton("EXIT");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(240, 217, 87, 33);
		contentPane.add(btnCancel);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblResult.setBounds(190, 179, 200, 27);
		contentPane.add(lblResult);
		
		JLabel lblNewLabel = new JLabel("Operator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(55, 107, 65, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How to show digit");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(55, 149, 122, 14);
		contentPane.add(lblNewLabel_1);
		
		
		

	}
}
