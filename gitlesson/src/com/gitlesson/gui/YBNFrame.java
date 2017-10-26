package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class YBNFrame extends JFrame{
	public YBNFrame() {
		super("ybn frame");
		this.getContentPane().setBackground(Color.GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300, 154, 350, 330);
		this.setVisible(true);
	}
}
