package random;

import javax.swing.JOptionPane;

public class votingbooth {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("How old are you in years?");
		int b = Integer.parseInt(a);
		if (b > 17) {
			JOptionPane.showInputDialog("Who do you think the next president will be?");
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");

		}
	}
}
