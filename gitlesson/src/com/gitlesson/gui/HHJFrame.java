package com.gitlesson.gui;

import java.awt.Color;

import javax.swing.JFrame;

public class HHJFrame extends JFrame {
	public HHJFrame() {
		//this(); 재귀함수 
		super("HHJFrame");
		this.setDefaultCloseOperation(3);
		this.setBounds(500, 300, 300, 400);
		this.setVisible(true);
		while(true) {
			this.getContentPane().setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new HHJFrame();
	}
}
