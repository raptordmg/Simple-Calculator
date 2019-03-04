package CalcNSpace;

import java.lang.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("unused")
public class CalcInterface {

	private JFrame frmCalc;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnDivide;
	private JButton btnTimes;
	private JButton btnSubtract;
	private JButton btnAdd;
	private JButton btnCalculate;
	private JButton btnBack;
	private JButton btnClear;
	private JButton btnCE;
	private JButton btnSqrt;
	private JLabel lblDisplay;
	public static char operation;
	public static float num1;
	public static float num2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcInterface window = new CalcInterface();
					window.frmCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/*
	 * Creates funtion for numbers
	 */
	public void getNumber(String number) {
		if (lblDisplay.getText() == "" || lblDisplay.getText() == "0") {
			lblDisplay.setText(number);
		}
		else {
			String temp = lblDisplay.getText() + number;
			lblDisplay.setText(temp);
		}
	}
	
	public void clear() {
		lblDisplay.setText("");
		num1 = 0;
		operation = ' ';
	}
	
	public void CE() {
		if (num1 != 0) {
			lblDisplay.setText(String.valueOf(num1));
			num2 = 0;
		}
		else {
			lblDisplay.setText(String.valueOf(num2));
		}
	}
	
	public void backSpace() {
		if (lblDisplay.getText() != "") {
			String str = lblDisplay.getText();
			lblDisplay.setText(str.substring(0, str.length() - 1));
		}
	}
	
	public void point() {
		if (lblDisplay.getText() != "") {
			String temp = lblDisplay.getText();
			if (temp.charAt(temp.length() - 1) == '.') {
				lblDisplay.setText(temp);
			}
			else {
				temp = lblDisplay.getText() + ".";
				lblDisplay.setText(temp);
			}
		}
	}
	
	public void newOperation(char sign) {
		if (lblDisplay.getText() != "") {
			num1 = Float.parseFloat(lblDisplay.getText());
			operation = sign;
			lblDisplay.setText("");
		}
	}
	
	public void negate() {
		if (lblDisplay.getText() != "") {
			if (lblDisplay.getText().charAt(0) != '-')
				lblDisplay.setText("-" + lblDisplay.getText());
			else if (lblDisplay.getText().charAt(0) == '-')
				lblDisplay.setText(lblDisplay.getText().substring(1));
		}
	}
	
	public void sqrt() {
		if (lblDisplay.getText() != "") {
			num1 = Float.parseFloat(lblDisplay.getText());
			lblDisplay.setText(String.valueOf((Math.sqrt(Double.parseDouble(lblDisplay.getText())))));
		}
	}
	
	public void calculate() {
		if (lblDisplay.getText() != "") {
			num2 = Float.parseFloat(lblDisplay.getText());
			double total;
			switch (operation) {
			case '+':
				total = num1 + num2;
				lblDisplay.setText(String.valueOf(total));
				break;
			case '-':
				total = num1 - num2;
				lblDisplay.setText(String.valueOf(total));
				break;
			case '*':
				total = num1 * num2;
				lblDisplay.setText(String.valueOf(total));
				break;
			case '/':
				total = num1 / num2;
				lblDisplay.setText(String.valueOf(total));
				break;
			}
		}
	}

	/**
	 * Create the application.
	 */
	public CalcInterface() {
		
		frmCalc = new JFrame();
		frmCalc.getContentPane().setBackground(new Color(240, 248, 255));
		frmCalc.setResizable(false);
		frmCalc.setTitle("Calculator");
		frmCalc.setBounds(100, 100, 419, 284);
		frmCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalc.getContentPane().setLayout(null);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				getNumber("1");
			}
		});
		btn1.setBounds(22, 70, 53, 35);
		frmCalc.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("2");
			}
		});
		btn2.setBounds(85, 70, 53, 35);
		frmCalc.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("3");
			}
		});
		btn3.setBounds(148, 70, 53, 35);
		frmCalc.getContentPane().add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("4");
			}
		});
		btn4.setBounds(22, 116, 53, 35);
		frmCalc.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("5");
			}
		});
		btn5.setBounds(85, 116, 53, 35);
		frmCalc.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("6");
			}
		});
		btn6.setBounds(148, 116, 53, 35);
		frmCalc.getContentPane().add(btn6);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("7");
			}
		});
		btn7.setBounds(22, 162, 53, 35);
		frmCalc.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("8");
			}
		});
		btn8.setBounds(85, 162, 53, 35);
		frmCalc.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("9");
			}
		});
		btn9.setBounds(148, 162, 53, 35);
		frmCalc.getContentPane().add(btn9);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNumber("0");
			}
		});
		btn0.setBounds(22, 208, 116, 35);
		frmCalc.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				point();
			}
		});
		btnDot.setBounds(148, 208, 53, 35);
		frmCalc.getContentPane().add(btnDot);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newOperation('/');
			}
		});
		btnDivide.setBounds(211, 70, 53, 35);
		frmCalc.getContentPane().add(btnDivide);
		
		btnTimes = new JButton("*");
		btnTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newOperation('*');
			}
		});
		btnTimes.setBounds(211, 116, 53, 35);
		frmCalc.getContentPane().add(btnTimes);
		
		btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newOperation('-');
			}
		});
		btnSubtract.setBounds(211, 162, 53, 35);
		frmCalc.getContentPane().add(btnSubtract);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newOperation('+');
			}
		});
		btnAdd.setBounds(211, 207, 53, 35);
		frmCalc.getContentPane().add(btnAdd);
		
		btnCalculate = new JButton("=");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCalculate.setBounds(274, 162, 53, 81);
		frmCalc.getContentPane().add(btnCalculate);
		
		btnBack = new JButton("<--");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backSpace();
			}
		});
		btnBack.setBounds(274, 116, 53, 35);
		frmCalc.getContentPane().add(btnBack);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnClear.setBounds(274, 70, 53, 35);
		frmCalc.getContentPane().add(btnClear);
		
        btnSqrt = new JButton("\u221A");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sqrt();
			}
		});
		btnSqrt.setBounds(337, 70, 53, 35);
		frmCalc.getContentPane().add(btnSqrt);
		
		btnCE = new JButton("+/-");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				negate();
			}
		});
		btnCE.setBounds(337, 116, 53, 35);
		frmCalc.getContentPane().add(btnCE);
		
		btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CE();
			}
		});
		btnCE.setBounds(337, 162, 53, 35);
		frmCalc.getContentPane().add(btnCE);
		
		lblDisplay = new JLabel("");
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setForeground(new Color(0, 0, 0));
		lblDisplay.setBackground(new Color(255, 255, 255));
		lblDisplay.setBounds(22, 11, 305, 52);
		frmCalc.getContentPane().add(lblDisplay);
	}
}