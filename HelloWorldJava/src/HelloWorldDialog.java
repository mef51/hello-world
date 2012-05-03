import javax.swing.*;
/**
 * 
 * @author mohammedafif
 *
 */
public class HelloWorldDialog 
{
	
	public static void main(String[] args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){}
		JOptionPane.showMessageDialog(null, "Hello, World!");
	}
} // end class
