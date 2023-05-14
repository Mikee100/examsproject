package examproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

public class studentspage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentspage frame = new studentspage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public studentspage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mike\\Desktop\\exam3.jfif"));
		setTitle("STUDENTS PAGE\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student Log in");
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 27));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\account.png"));
		lblNewLabel_1.setBounds(188, 199, 265, 62);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		lblNewLabel.setBounds(188, 304, 69, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		lblNewLabel_2.setBounds(188, 380, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(287, 310, 182, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(287, 378, 182, 31);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("mike")&& passwordField.getText().equals("mike1"))
				{
					setVisible(false);
					new studentsnewpage().setVisible(true);
				}else {
					ImageIcon icon = new ImageIcon("Incorrect Password.PNG"); 
					JOptionPane.showMessageDialog(null,"<html><b style=\"color:red; font-size:10px\">Incorrrect <br>Username or Password</b><html>","Show", JOptionPane.INFORMATION_MESSAGE,icon );
				}
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setMnemonic(KeyEvent.VK_ENTER);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(236, 464, 217, 49);
		btnNewButton.setFocusable(false);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new mainpage().setVisible(true);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 14));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\exit.png"));
		btnNewButton_1.setBounds(30, 80, 107, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\exam3.jfif"));
		lblNewLabel_3.setBounds(0, 0, 784, 761);
		contentPane.add(lblNewLabel_3);
	}
}
