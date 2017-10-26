package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class HHJFrame extends JFrame {
	public HHJFrame() {
		//this(); 재귀함수 
		super("HHJFrame");
		this.getContentPane().setBackground(new Color((int)Math.random(), (int)Math.random(), (int)Math.random()));
		this.setDefaultCloseOperation(3);
		this.setBounds(500, 300, 300, 400);
		this.setVisible(true);
	}
}
