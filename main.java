import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main implements ActionListener {
	
	 int count = 0;
	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	
	public main() {
		
		frame = new JFrame();
		
		JButton button = new JButton("click me");
		button.addActionListener(this);
		label = new JLabel("Number of clicks: 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
	    public static void main(String[] args) {	    	
	     new main();
	    	
	    }



		@Override
		public void actionPerformed(ActionEvent e) {
			count++;
			label.setText("Number of clicks: " +count);
		}
	    
	}


