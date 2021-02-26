import javax.swing.JOptionPane;
public class Sum {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification1 ="";
		String strNotification2 ="";
		String strNotification3 ="";
		String strNotification4 ="";

		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		double sum = num1 + num2;
		double dif = num1 - num2;
		double product = num1 * num2;
		double quo = num1/num2;
		JOptionPane.showMessageDialog(null, strNotification1+="Sum of two number: " + sum,
					"Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strNotification2+="Difference of two number: "+ dif,
				"Difference of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strNotification3+="Product of two number: " + product,
				"Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, strNotification4+="Quotient of two number: " + quo,
				"Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
