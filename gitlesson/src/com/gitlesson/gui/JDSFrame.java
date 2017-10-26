package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class JDSFrame extends JFrame{
	public JDSFrame() {
		//this();//재귀함수 
		
		super("jds frame");
		this.getContentPane().setBackground(Color.PINK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(1500, 10, 200, 200);
		this.setVisible(true);
		System.out.println("안녕하세요~~~~~");
	}
}
