package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class LEEFrame extends JFrame{
	public LEEFrame() {
		//this(); //재귀
		super("lee frame");
		this.getContentPane().setBackground(Color.CYAN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("sdsd");
	}

}
