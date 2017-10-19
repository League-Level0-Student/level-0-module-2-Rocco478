import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
String a=JOptionPane.showInputDialog("What is your birthday? Month and day.");
if(a.equals ("10/18")) {
JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
else {
JOptionPane.showMessageDialog(null, "Merry unbirthday!");
}

}
}
