package com.gitlesson.gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;

class KBJFrame extends JFrame {
	JButton b1 = new JButton("Hit");
	JButton b2 = new JButton("Stay");
	

		//this(); //재귀함수
		public KBJFrame() {
			this.setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.insets = new Insets(5, 5, 5, 5);
			
			gbc.gridx = 0;
			gbc.gridy = 0;
			this.add(b1,gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 1;
			this.add(b2,gbc);

			this.getContentPane().setBackground(new Color(0,255,255));
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setBounds(300, 300, 300, 300);
			this.setVisible(true);
		}
	
}
	


