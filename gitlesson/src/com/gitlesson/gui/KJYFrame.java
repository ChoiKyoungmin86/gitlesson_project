package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class KJYFrame extends JFrame{
	
	public KJYFrame(){
		super("kjy frame");
		this.getContentPane().setBackground(Color.CYAN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(1000, 600, 300, 400);
		this.setVisible(true);
	}

}
