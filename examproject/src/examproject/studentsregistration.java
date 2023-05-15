package examproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class studentsregistration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private ComboBoxModel gender;
	private String [] genders;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					studentsregistration frame = new studentsregistration();
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
	
	public studentsregistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Students Admission");
		lblNewLabel.setBounds(32, 10, 398, 41);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\id-card.png"));
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 33));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(435, 29, 0, 2);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(29, 84, 72, 18);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setBounds(32, 144, 69, 18);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		textField = new JTextField();
		textField.setBounds(130, 84, 171, 41);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 144, 171, 34);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(32, 213, 47, 18);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_4 = new JLabel("Parents/Guardians Name");
		lblNewLabel_4.setBounds(32, 280, 161, 18);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		textField_3 = new JTextField();
		textField_3.setBounds(203, 280, 171, 34);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Parents/Gurdians Phone No.");
		lblNewLabel_5.setBounds(13, 363, 180, 18);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		textField_4 = new JTextField();
		textField_4.setBounds(203, 363, 171, 41);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Admission");
		lblNewLabel_6.setBounds(421, 84, 65, 18);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		textField_5 = new JTextField();
		textField_5.setBounds(517, 84, 180, 41);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Class Allocated");
		lblNewLabel_7.setBounds(412, 167, 97, 18);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(86, 66, 0, 2);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(separator);
		contentPane.add(lblNewLabel_1);
		contentPane.add(textField);
		contentPane.add(lblNewLabel_6);
		contentPane.add(textField_5);
		contentPane.add(lblNewLabel_1_1);
		contentPane.add(separator_1);
		contentPane.add(textField_1);
		contentPane.add(lblNewLabel_7);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textField_3);
		contentPane.add(lblNewLabel_5);
		contentPane.add(textField_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton.setBounds(123, 212, 72, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		rdbtnNewRadioButton_1.setBounds(203, 211, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(509, 156, 77, 41);
		contentPane.add(panel);
		
		JMenuBar menuBar = new JMenuBar();
		
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Form");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Form 1");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("1 South");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("1 North");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("1 West");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1_1 = new JMenu("Form 2");
		mnNewMenu.add(mnNewMenu_1_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("2 South");
		mnNewMenu_1_1.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("2 North");
		mnNewMenu_1_1.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("2 West");
		mnNewMenu_1_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1_1_1 = new JMenu("Form 3");
		mnNewMenu.add(mnNewMenu_1_1_1);
		
		JMenuItem mntmNewMenuItem_1_1_1 = new JMenuItem("3 South");
		mnNewMenu_1_1_1.add(mntmNewMenuItem_1_1_1);
		
		JMenuItem mntmNewMenuItem_2_1_1 = new JMenuItem("3 North");
		mnNewMenu_1_1_1.add(mntmNewMenuItem_2_1_1);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("3 West");
		mnNewMenu_1_1_1.add(mntmNewMenuItem_3_1);
		
		JMenu mnNewMenu_1_1_1_1 = new JMenu("Form 4");
		mnNewMenu.add(mnNewMenu_1_1_1_1);
		
		JMenuItem mntmNewMenuItem_1_1_1_1 = new JMenuItem("4 South");
		mnNewMenu_1_1_1_1.add(mntmNewMenuItem_1_1_1_1);
		
		JMenuItem mntmNewMenuItem_2_1_1_1 = new JMenuItem("4 North");
		mnNewMenu_1_1_1_1.add(mntmNewMenuItem_2_1_1_1);
		
		JMenuItem mntmNewMenuItem_3_1_1 = new JMenuItem("4 West");
		mnNewMenu_1_1_1_1.add(mntmNewMenuItem_3_1_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		btnNewButton.setBounds(341, 454, 218, 34);
		btnNewButton.setFocusable(false);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\exam3.jfif"));
		lblNewLabel_3.setBounds(0, 0, 796, 532);
		contentPane.add(lblNewLabel_3);
		
	}
	}

		
		
		
	
