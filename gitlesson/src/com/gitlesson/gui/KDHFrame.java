package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class KDHFrame extends JFrame{
	public KDHFrame() {
		super("kdh frame");
		this.getContentPane().setBackground(Color.RED);
		this.setDefaultCloseOperation(3);
		this.setBounds(100, 100, 300, 300);
		this.setVisible(true);
	}
}

