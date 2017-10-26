package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class KDYFrame extends JFrame{
	public KDYFrame() {
		//this(); //재귀
		super("kdy frame");
		this.getContentPane().setBackground(Color.CYAN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(1000, 600, 300, 200);
		this.setVisible(true);
	}
}
