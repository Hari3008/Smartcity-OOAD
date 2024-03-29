package smartcitymini;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField confirmpwd;
	private JTextField home;
	private JComboBox comboBox;
	Connection connect=null;
	String[] roles={
			"JobSeeker","Student","Tourist"
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		connect=DbConnect.dataConnector();
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 1500, 800);
		background.setIcon(new ImageIcon("D:\\SmartCity-Application\\SmartCity\\img\\login.jpg"));
		contentPane.add(background);
		
		JLabel lblPassword = new JLabel("Password");
		background.add(lblPassword);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(334, 610, 63, 14);
		
		JLabel Role = new JLabel("Role");
		background.add(Role);
		Role.setForeground(Color.WHITE);
		Role.setBounds(334, 700, 63, 14);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		background.add(lblConfirmPassword);
		lblConfirmPassword.setForeground(Color.WHITE);
		lblConfirmPassword.setBounds(334, 640, 200, 14);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		background.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(465, 515, 100, 20);
		
		name = new JTextField();
		background.add(name);
		name.setBounds(465, 550, 86, 20);
		name.setColumns(10);
		
		home = new JTextField();
		background.add(home);
		home.setBounds(465,670, 86, 20);
		home.setColumns(10);
		
		confirmpwd = new JTextField();
		background.add(confirmpwd);
		confirmpwd.setBounds(465, 640, 86, 20);
		confirmpwd.setColumns(10);
		
		password = new JTextField();
		background.add(password);
		password.setBounds(465, 610, 86, 20);
		password.setColumns(10);
		
		JLabel lblHometown = new JLabel("Hometown");
		background.add(lblHometown);
		lblHometown.setForeground(Color.WHITE);
		lblHometown.setBounds(334, 670, 100, 14);
		
		JLabel lblUsername = new JLabel("Username");
		background.add(lblUsername);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(334, 580, 63, 14);
		
		JLabel lblName = new JLabel("Name");
		background.add(lblName);
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(334, 550, 46, 14);
	
		username = new JTextField();
		background.add(username);
		username.setBounds(465, 580, 86, 20);
		username.setColumns(10);
		comboBox = new JComboBox();
	    //comboBox.setPreferredSize(new Dimension(200,130));
	    comboBox.setBounds(465, 700, 86, 20);
	    //comboBox.setBounds(getBounds());
//		view.setBounds(575, 450, 200, 40);
//	    view.setVisible(true);
	    int count=0;
	    for(int i = 0; i < roles.length; i++) 
	    	comboBox.addItem(roles[count++]); 
		JButton btnSignUp = new JButton("Sign Up!");
		background.add(comboBox);
		comboBox.setVisible(true);
		btnSignUp.setBackground(Color.WHITE);
		background.add(btnSignUp);
		
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					String role=(String)comboBox.getSelectedItem();
                    Roles r = new Roles(name.getText(), username.getText(), password.getText(), home.getText(), role);
                    login l = new login();
                    l.show();
                    setVisible(false);
//					String query="insert into Details (Name,Username,Password,HomeTown) values (?,?,?,?)";
//					PreparedStatement pst=connect.prepareStatement(query);
//					String confirm=confirmpwd.getText() ;
//					String pass=password.getText() ;
//					if(confirm.equals(pass)){
//						
//					
//					pst.setString(1,name.getText() );
//					pst.setString(2,username.getText() );
//					pst.setString(3,password.getText() );
//					pst.setString(4,home.getText() );
//					//pst.setString(5,username.getText() );
//					pst.execute();
//					/*login_back l=new login_back();
//					l.login();*/
//					pst.close();
//					connect=null;
//					JOptionPane.showMessageDialog(null, "Registered Succesfully!");
//					
////					Welcome w=new Welcome();
////					w.show();
//					dispose();
//					/*login_back l=new login_back();
//					l.login();*/
//					}
//					else
//					{
//						JOptionPane.showMessageDialog(null, "Enter the same password");
//					}
//					pst.close();
					/*login_back l=new login_back();
					l.login();*/
					
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
					
				}
			}
		});
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setBounds(713, 601, 114, 22);
		setLocationRelativeTo(null);
		
		
	}

	}
