package com.runetooncraft.tutorials.calculator;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JTextField;

public class Calculator extends JFrame {
	private static Calculator frame = null;
	private Container contentPane;
	private JTextField txtOutput;
	public static ArrayList<Object> TypeList = new ArrayList<Object>(); //String = Text; Integer = Numbers Booleans = true,false; Objects = Covers all variables that exist
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Calculator();
					frame.setVisible(true);
					SetTypeList();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			private void SetTypeList() {
				for(int i = 0; i <= 9; i++) {
					TypeList.add(Integer.toString(i));
				}
				TypeList.add("+");
				TypeList.add("-");
				TypeList.add("/");
				TypeList.add("*");
				TypeList.add(".");
				TypeList.add("=");
			}
		});
	}
	
	public boolean CanType(Object o) {
		if(TypeList.contains(o)) {
			return true;
		}else {
			return false;
		}
	}
	
	public Calculator() {
		setResizable(false);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		setTitle("Calculator");
		setBounds(100,100,196,183);
		contentPane = getContentPane();
		contentPane.setLayout(null);
		txtOutput = new JTextField();
		txtOutput.setEditable(false);
		txtOutput.setBounds(10, 12, 166, 20);
		getContentPane().add(txtOutput);
		txtOutput.setColumns(10);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(7);
			}
		});
		button_7.setBounds(10, 35, 40, 20);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(8);
			}
		});
		button_8.setBounds(52, 35, 40, 20);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(9);
			}
		});
		button_9.setBounds(94, 35, 40, 20);
		contentPane.add(button_9);
		
		JButton button_clear = new JButton("C");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		button_clear.setBounds(136, 35, 40, 20);
		contentPane.add(button_clear);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(4);
			}
		});
		button_4.setBounds(10, 58, 40, 20);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(5);
			}
		});
		button_5.setBounds(52, 58, 40, 20);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(6);
			}
		});
		button_6.setBounds(94, 58, 40, 20);
		getContentPane().add(button_6);
		
		JButton button_divide = new JButton("/");
		button_divide.setBounds(136, 58, 40, 20);
		contentPane.add(button_divide);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(1);
			}
		});
		button_1.setBounds(10, 81, 40, 20);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(2);
			}
		});
		button_2.setBounds(52, 81, 40, 20);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input(3);
			}
		});
		button_3.setBounds(94, 81, 40, 20);
		contentPane.add(button_3);
		
		JButton button_multiply = new JButton("*");
		button_multiply.setBounds(136, 81, 40, 20);
		contentPane.add(button_multiply);
		
		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				input(0);
			}
		});
		button_0.setBounds(10, 104, 82, 20);
		contentPane.add(button_0);
		
		JButton button_decimal = new JButton(".");
		button_decimal.setBounds(94, 104, 40, 20);
		contentPane.add(button_decimal);
		
		JButton button_subtract = new JButton("-");
		button_subtract.setBounds(136, 104, 40, 20);
		contentPane.add(button_subtract);
		
		JButton button_add = new JButton("+");
		button_add.setBounds(10, 127, 82, 20);
		contentPane.add(button_add);
		
		JButton button_equals = new JButton("=");
		button_equals.setBounds(94, 127, 82, 20);
		contentPane.add(button_equals);
		contentPane.setFocusable(true);
		contentPane.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent event) {
				String TypedLetter = Character.toString(event.getKeyChar());
				System.out.println(TypedLetter);
				if(CanType(TypedLetter)) {
					input(TypedLetter);
				}else if(event.getKeyCode() == event.VK_ENTER) {
					//TODO: Calculate code
				}
			}
		});
		contentPane.requestFocusInWindow();
	}
	private void input(Object o) {
		txtOutput.setText(txtOutput.getText() + o);
		contentPane.requestFocusInWindow();
	}
	private void clear() {
		txtOutput.setText("");
		contentPane.requestFocusInWindow();
	}
}
