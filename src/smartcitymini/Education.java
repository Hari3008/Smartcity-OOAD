package smartcitymini;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Education extends JFrame {
	private JPanel contentPane;
	JLabel back ;
	JButton goback;
	public Education(String s1, String s2, String s3, String s4, String c1, String c2, String u1, String u2, String u3, String si1, String si2, String si3, String si4, String ci1, String ci2, String ui1, String ui2, String ui3, String cityname) {
		

		System.out.println("test2");
		contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		setVisible(true);
		setContentPane(contentPane);
		JLabel title = new JLabel("EDUCATION");
		contentPane.setLayout(null);
		back= new JLabel("");
		back.setBounds(0, 0, 1500, 750 );
		contentPane.add(back);
		back.add(title);
		
		title.setFont(new Font("Tahoma", Font.BOLD, 18));
		title.setForeground(Color.WHITE);
		title.setBounds(10, 10, 200, 40);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.BLACK);
		goback.setBounds(1150, 0, 200, 34);
		
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cityname == "Bangalore") {
					Bangalore b=new Bangalore("Student"); //Hardcoded
					 b.Slideshow();
					 b.show();
					 setVisible(false);
				}
				if(cityname == "Hyderabad") {
					Hyderabad h = new Hyderabad();
					h.Slideshow();
					h.show();
					setVisible(false);
				}
				if(cityname == "Chennai") {
					Chennai c = new Chennai();
					c.Slideshow();
					c.show();
					setVisible(false);
				}
				if(cityname == "Mangalore") {
					Mangalore m = new Mangalore();
					m.Slideshow();
					m.show();
					setVisible(false);
				}
			}
		});
		
		back.add(goback);
	
		JLabel lblschools = new JLabel("SCHOOLS");
		lblschools.setFont(new Font("Tahoma", Font.ITALIC, 14));
		back.add(lblschools);
		lblschools.setForeground(Color.WHITE);
		lblschools.setBounds(10, 61, 200, 40);
		back.add(lblschools);
		
		JLabel lblcolleges = new JLabel("COLLEGES");
		lblcolleges.setFont(new Font("Tahoma", Font.ITALIC, 14));
		back.add(lblcolleges);
		lblcolleges.setForeground(Color.WHITE);
		lblcolleges.setBounds(10, 326, 200, 40);
		back.add(lblcolleges);
		
		JLabel lblUniversities = new JLabel("UNIVERSITIES");
		lblUniversities.setForeground(Color.WHITE);
		lblUniversities.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblUniversities.setBounds(588, 326, 200, 40);
		back.add(lblUniversities);
		
		JLabel school1 = new JLabel(s1);
		school1.setForeground(Color.WHITE);
		school1.setBounds(10, 112, 200, 37);
		back.add(school1);
		
		JLabel school2 = new JLabel(s2);
		school2.setForeground(Color.WHITE);
		school2.setBounds(277, 112, 200, 37);
		back.add(school2);
		
		JLabel school3 = new JLabel(s3);
		school3.setForeground(Color.WHITE);
		school3.setBounds(539, 112, 200, 37);
		back.add(school3);
		
		JLabel school4 = new JLabel(s4);
		school4.setForeground(Color.WHITE);
		school4.setBounds(789, 112, 200, 37);
		back.add(school4);
		
		JLabel college1 = new JLabel(c1);
		college1.setForeground(Color.WHITE);
		college1.setBounds(10, 388, 200, 37);
		back.add(college1);
		
		JLabel college2 = new JLabel(c2);
		college2.setForeground(Color.WHITE);
		college2.setBounds(294, 388, 200, 37);
		back.add(college2);
		
		JLabel uni1 = new JLabel(u1);
		uni1.setForeground(Color.WHITE);
		uni1.setBounds(588, 388, 200, 37);
		back.add(uni1);
		
		JLabel uni2 = new JLabel(u2);
		uni2.setForeground(Color.WHITE);
		uni2.setBounds(836, 388, 95, 37);
		back.add(uni2);
		
		JLabel uni3 = new JLabel(u3);
		uni3.setForeground(Color.WHITE);
		uni3.setBounds(1096, 388, 149, 37);
		back.add(uni3);
		
		JLabel sImg1 = new JLabel();
		sImg1.setBounds(10, 151, 200, 150);
		SetImageSize(sImg1, new ImageIcon(si1));
		back.add(sImg1);
		
		JLabel sImg2 = new JLabel();
		sImg2.setBounds(277, 151, 200, 150);
		SetImageSize(sImg2, new ImageIcon(si2));
		back.add(sImg2);
		
		JLabel sImg3 = new JLabel();
		sImg3.setBounds(539, 151, 200, 150);
		SetImageSize(sImg3, new ImageIcon(si3));
		back.add(sImg3);
		
		JLabel sImg4 = new JLabel();
		sImg4.setBounds(777, 151, 200, 150);
		SetImageSize(sImg4, new ImageIcon(si4));
		back.add(sImg4);
		
		JLabel cImg1 = new JLabel();
		cImg1.setBounds(10, 426, 200, 150);
		SetImageSize(cImg1, new ImageIcon(ci1));
		back.add(cImg1);
		
		JLabel cImg2 = new JLabel();
		cImg2.setBounds(294, 426, 200, 150);
		SetImageSize(cImg2, new ImageIcon(ci2));
		back.add(cImg2);
		
		JLabel uImg1 = new JLabel();
		uImg1.setBounds(588, 426, 200, 150);
		SetImageSize(uImg1, new ImageIcon(ui1));
		back.add(uImg1);
		
		JLabel uImg2 = new JLabel();
		uImg2.setBounds(846, 426, 200, 150);
		SetImageSize(uImg2, new ImageIcon(ui2));
		back.add(uImg2);
		
		JLabel uImg3 = new JLabel();
		uImg3.setBounds(1096, 426, 200, 150);
		SetImageSize(uImg3, new ImageIcon(ui3));
		back.add(uImg3);
		Imageshow is = new Imageshow() {};
        
        is.SetImageSizeCity(back);
				
	}
	public void SetImageSize(JLabel label,ImageIcon im)
	{
		ImageIcon icon=im;
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		label.setIcon(newImc);
		
	}
}
