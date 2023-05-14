package examproject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyEvent;

public class loginpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					loginpage frame = new loginpage();
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
	public loginpage() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1384,840);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(530, 298, 114, 23);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setToolTipText("mike_1");
		textField.setBounds(666, 297, 162, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1.setBounds(530, 367, 103, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("mike")&& passwordField.getText().equals("mike1"))
				{
					setVisible(false);
					new adminspage().setVisible(true);
				}else {
					ImageIcon icon = new ImageIcon("Incorrect Password.PNG"); 
					JOptionPane.showMessageDialog(null,"<html><b style=\"color:red; font-size:10px\">Incorrrect <br>Username or Password</b><html>","Show", JOptionPane.INFORMATION_MESSAGE,icon );
				}
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\key.png"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(605, 497, 103, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new mainpage().setVisible(true);
				
			
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\back.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_1.setBounds(739, 497, 103, 32);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected())  {
					passwordField.setEchoChar((char)0);	
				}else {
					passwordField.setEchoChar('*');
					
				}
				
				
			}
		});
		chckbxNewCheckBox.setFocusable(false);
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setContentAreaFilled(false);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(666, 423, 139, 23);
		contentPane.add(chckbxNewCheckBox);
		
		passwordField = new JPasswordField();
		passwordField.setName("waweru");
		passwordField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		passwordField.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		passwordField.setAlignmentX(Component.RIGHT_ALIGNMENT);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(666, 366, 162, 32);
		
		contentPane.add(passwordField);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setRolloverEnabled(false);
		btnNewButton_2.setRequestFocusEnabled(false);
		btnNewButton_2.setMnemonic(KeyEvent.VK_CUT);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null,"Do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(a);
				}
				
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\reject.png"));
		btnNewButton_2.setBounds(1135, 84, 38, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\exam3.jfif"));
		lblNewLabel_2.setBounds(0, 0, 1405, 840);
		contentPane.add(lblNewLabel_2);
	}
}
