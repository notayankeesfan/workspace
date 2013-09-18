import javax.swing.JOptionPane;


public class DialogVier {
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name");
		
		System.out.print ("Hello ");
		System.out.println (name);
		
		JOptionPane.showConfirmDialog(null, "Is this correct?");
	}
}
