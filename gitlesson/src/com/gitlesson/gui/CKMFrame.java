package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class CKMFrame extends JFrame{
	public CKMFrame() {
		//this(); //재귀
		super("ckm frame");
		this.getContentPane().setBackground(new Color(0,255,255));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(1000, 600, 300, 200);
		this.setVisible(true);
	}
}
