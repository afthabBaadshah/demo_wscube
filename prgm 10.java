package p10;
import javax.swing.*;  // Importing Swing components
import java.awt.event.*; // For action events
public class p10 {
  
	public static void main(String[] args) {
		JFrame frame = new JFrame("Text Field Example");
        JButton button = new JButton("Click me");
        // Action listener to display text
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "button clicked ");
            }
        });
        // Adding components to frame
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}

}