package com.runetooncraft.tutorials.episode2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Episode2 extends JFrame {
	private static Episode2 frame = null;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Episode2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Episode2() {
		setResizable(false);
		setTitle("This is a title");
		setBounds(100,100,294,385);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Press me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You pressed me!");
			}
		});
		btnNewButton.setBounds(10, 11, 268, 77);
		getContentPane().add(btnNewButton);
		contentPane = new JPanel();
	}
}
