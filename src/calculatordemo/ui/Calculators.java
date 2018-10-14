package calculatordemo.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculators {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculators window = new Calculators();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 207, 54);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	//----------Row 1---------------------------------
		JButton btnbc = new JButton("<-");
		btnbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnbc.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnbc.setBackground(Color.YELLOW);
		btnbc.setBounds(16, 72, 40, 42);
		frame.getContentPane().add(btnbc);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnC.setBounds(57, 72, 40, 42);
		frame.getContentPane().add(btnC);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnMod.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnMod.setBounds(98, 72, 40, 42);
		frame.getContentPane().add(btnMod);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnPlus.setBounds(138, 72, 40, 42);
		frame.getContentPane().add(btnPlus);
		
		//----------Row 2---------------------------------
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn7.getText();
						textField.setText(EnterNumber);
					}
				});
				btn7.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn7.setBackground(Color.YELLOW);
				btn7.setBounds(16, 112, 40, 42);
				frame.getContentPane().add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn8.getText();
						textField.setText(EnterNumber);
					}
				});
				btn8.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn8.setBounds(57, 112, 40, 42);
				frame.getContentPane().add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn9.getText();
						textField.setText(EnterNumber);
					}
				});
				btn9.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn9.setBounds(98, 112, 40, 42);
				frame.getContentPane().add(btn9);
				
				JButton btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "-";
					}
				});
				btnSub.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btnSub.setBounds(138, 112, 40, 42);
				frame.getContentPane().add(btnSub);
				
				//----------Row 3---------------------------------
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn4.getText();
						textField.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn4.setBackground(Color.YELLOW);
				btn4.setBounds(16, 152, 40, 42);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn5.getText();
						textField.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn5.setBounds(57, 152, 40, 42);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn6.getText();
						textField.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn6.setBounds(98, 152, 40, 42);
				frame.getContentPane().add(btn6);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "*";
					}
				});
				btnMult.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btnMult.setBounds(138, 152, 40, 42);
				frame.getContentPane().add(btnMult);
				
				//----------Row 4---------------------------------
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn1.setBackground(Color.YELLOW);
				btn1.setBounds(16, 192, 40, 42);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn2.setBounds(57, 192, 40, 42);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn3.setBounds(98, 192, 40, 42);
				frame.getContentPane().add(btn3);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations = "/";
					}
				});
				btnDiv.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btnDiv.setBounds(138, 192, 40, 42);
				frame.getContentPane().add(btnDiv);
		

				//----------Row 5---------------------------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btn0.getText();
						textField.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btn0.setBackground(Color.YELLOW);
				btn0.setBounds(16, 232, 40, 42);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btnDot.getText();
						textField.setText(EnterNumber);
					}
				});
				btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btnDot.setBounds(57, 232, 40, 42);
				frame.getContentPane().add(btnDot);
				
				JButton btnat = new JButton("@");
				btnat.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText() + btnat.getText();
						textField.setText(EnterNumber);
					}
				});
				btnat.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btnat.setBounds(98, 232, 40, 42); 
				frame.getContentPane().add(btnat);
				
				JButton btne = new JButton("=");
				btne.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String answer;
						secondnum = Double.parseDouble(textField.getText());
						if(operations == "+") 
						{
							result = firstnum + secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if (operations == "-") 
						{
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if (operations == "*") 
						{
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if (operations == "/") 
						{
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
						else if (operations == "%") 
						{
							result = firstnum % secondnum;
							answer = String.format("%.2f", result);
							textField.setText(answer);
							
						}
					}
				});
				btne.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				btne.setBounds(138, 232, 40, 42);
				frame.getContentPane().add(btne);
		
	}
}
