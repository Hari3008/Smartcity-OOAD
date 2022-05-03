package smartcitymini;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class Welcome extends JFrame {

	private JPanel contentPane;
	int x=0;
	Timer tm;JLabel pic;
	String[] list=
		{
				"D:\\SmartCity-Application\\SmartCity\\img\\hyd1.jpeg",
				"D:\\SmartCity-Application\\SmartCity\\img\\chennai.jpg",
				"D:\\SmartCity-Application\\SmartCity\\img\\bang.jpg",
				"D:\\SmartCity-Application\\SmartCity\\img\\manglore.jpg",
				"D:\\SmartCity-Application\\SmartCity\\img\\mumbai.jpg"
			
			
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setTitle("Smart City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
	    pic=new JLabel();
		pic.setBounds(0, 0, 1500, 750);
		pic.setVisible(true);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Serif", Font.BOLD, 18));
		label.setForeground(Color.WHITE);
		label.add(pic);
		 tm = new Timer(2000,new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                SetImageSize(x);
	                x += 1;
	                if(x >= list.length )
	                    x = 0; 
	            }
	        });
		 //add(pic);
	        tm.start();
		//label.setBackground(Color.BLACK);
	
		//label.setIcon(new ImageIcon("C:\\Users\\Prajwala\\Desktop\\java\\xyz.jpg"));
		label.setBounds(0, 50, 1500, 750);
		contentPane.add(label);
        JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.WHITE);
		contentPane.add(btnLogin);
		btnLogin.setBounds(1120, 11, 89, 23);
		

		
		JButton btnSignup = new JButton("Signup");
		btnSignup.setForeground(Color.BLACK);
		btnSignup.setBackground(Color.WHITE);
		contentPane.add(btnSignup);
		btnSignup.setBounds(1219, 11, 89, 23);
		
		JLabel lblNewLabel = new JLabel("SMART CITY");
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 7, 300, 25);
		btnSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Signup s = new Signup();
				s.show();
				setVisible(false);
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login l = new login();
				l.show();
				setVisible(false);
			}
		});
	}
	public void SetImageSize(int i)
	{
		ImageIcon icon=new ImageIcon(list[i]);
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		pic.setIcon(newImc);
		
	}

}
