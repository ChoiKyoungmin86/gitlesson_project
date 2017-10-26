package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class LHSFrame extends JFrame{
	public LHSFrame() {
		//this();  --> 재귀
		super("lhs Frame");
		this.getContentPane().setBackground(new Color(50, 50, 255));
		this.setDefaultCloseOperation(3);
		this.setBounds(600, 0, 300, 600);
		this.setResizable(false);
		this.setVisible(true);
	}
}
