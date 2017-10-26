package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KBJFrame extends JFrame{
		public KBJFrame() {
			//this(); //Àç±Í
			super("kbj frame");

			JButton b1 = new JButton("Hit");
			JButton b2 = new JButton("Stay");
			
			this.getContentPane().setBackground(new Color(0,255,255));
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setBounds(300, 300, 300, 300);
			this.setVisible(true);
		}
	}

