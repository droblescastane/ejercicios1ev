package unidad2;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {
		//
		
		String euros = JOptionPane.showInputDialog("Introduce el valor en euros");
		
		double c=Double.parseDouble(euros);
		
		double dolares=1.22;
		
		System.out.println(c*dolares);
		
	}

}
