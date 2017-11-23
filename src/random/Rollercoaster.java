package random;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("How tall are you in inches?");
		int b = Integer.parseInt(a);
		if (b > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the ride");
		} else {
			JOptionPane.showMessageDialog(null, "You need to grow more");
		}
	}
}
