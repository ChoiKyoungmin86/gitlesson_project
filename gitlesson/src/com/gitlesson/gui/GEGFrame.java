package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class GEGFrame extends JFrame {
	public GEGFrame() {
		//this(); 재귀함수 - 메모리를 잡아먹기 때문에 위험해
		//JFrame 호출
		super("geg frame"); //제목표시줄 이름 
		this.getContentPane().setBackground(Color.YELLOW);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 800, 150, 150);
		this.setVisible(true);
	}
}
