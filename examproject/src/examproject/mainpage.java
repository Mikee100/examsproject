package examproject;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class mainpage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainpage frame = new mainpage();
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
	public mainpage() {
		setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\mike\\Desktop\\exam3.jfif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1445,835);
		
	
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					setVisible(false);
					new loginpage().setVisible(true);;
				
			
			}
		});
		btnNewButton.setBounds(859, 30, 155, 53);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\admin.png"));
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\admin.jfif"));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setFocusable(false);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = JOptionPane.showConfirmDialog(null,"Do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					System.exit(a);
				}
				
			}
		});
		btnNewButton_1.setBounds(1047, 31, 136, 50);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\exit.png"));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.setLayout(null);
		btnNewButton_1.setFocusable(false);
		
		JButton btnNewButton_2 = new JButton("Student");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				new studentspage().setVisible(true);;
				
			}
		});
		btnNewButton_2.setBounds(490, 30, 130, 53);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\student.png"));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_2.setFocusable(false);
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Teacher");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new chooseclass().setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\teacher.png"));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_3.setBounds(672, 30, 145, 53);
		btnNewButton_3.setFocusable(false);
		
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mike\\Desktop\\java images\\exam3.jfif"));
		lblNewLabel.setBounds(0, 0, 1473, 835);
		contentPane.add(lblNewLabel);
	
	}
}
		


