package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class KGMFrame extends JFrame{
	public KGMFrame() {
		//this() 재귀함수
		super("kgm frame");
		this.getContentPane().setBackground(Color.CYAN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500, 700, 400, 400);		
	}

}
