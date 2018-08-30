import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class HelloGUI extends JFrame {

	public static void main(String[] args) {
		new HelloGUI();
	}
	
	public HelloGUI() {
		this.setSize(600,600);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight() / 2);
		
		this.setLocation(xPos, yPos);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Hey.");
		
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel("futtbuzz.");
		
		label1.setToolTipText("buzzfut");
		
		JButton button1 = new JButton("Full Send");
		
		
		thePanel.add(label1);
		thePanel.add(button1);
		this.add(thePanel);
		
		this.setVisible(true);
	}

}
