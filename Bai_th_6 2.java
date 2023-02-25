package thuchanhjava;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Bai_th_6 extends JFrame{
	private JButton
		bn = new JButton("North"),
		bs = new JButton("South"),
		be = new JButton("East"),
		bw = new JButton("West"),
		bc = new JButton("Center");
	public Bai_th_6() {
		setTitle("border layout");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		add(BorderLayout.NORTH, bn);
		add(BorderLayout.SOUTH, bs);
		add(BorderLayout.EAST, be);
		add(BorderLayout.WEST, bw);
		add(BorderLayout.CENTER, bc);
		
		bn.setBackground(Color.red);
		bn.setForeground(Color.cyan);
		
		be.setBackground(Color.green);
		be.setForeground(Color.blue);
		
	}
	
	public static void main(String[] args) {
		new Bai_th_6().setVisible(true);
	}
}
