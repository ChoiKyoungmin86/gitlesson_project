package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class KDH2Frame extends JFrame {
	public KDH2Frame() {
		//this(); //재귀함수 - 나를호출
		super("김다혜 프레임");
		this.getContentPane().setBackground(Color.ORANGE);
		setVisible(true);
		this.setDefaultCloseOperation(3);
		this.setBounds(1000, 200, 800, 200);
	}
	
}
