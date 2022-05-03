package smartcitymini;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Hotels extends JFrame{
	private JPanel contentPane;
		JButton goback;
		JLabel back1;
		String city;
		public Hotels(String h1txt, String h2txt, String h3txt, String h4txt, String h5txt, String h6txt, String h1img, String h2img, String h3img, String h4img, String h5img, String h6img, String cityname) {
			contentPane = new JPanel();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
//	        int width = (int)size.getWidth();
//	        int height = (int)size.getHeight();
			setBounds(100, 100, 1500, 800);
			setContentPane(contentPane);
			contentPane.setLayout(null);

		setLayout(null);
		setBackground(Color.BLACK);

		setVisible(true);
		back1= new JLabel("");
		back1.setBounds(0, 0, 1500, 750 );
//		back1.setVisible(true);
		contentPane.add(back1);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.BLACK);
		goback.setBounds(1150, 0, 200, 34);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cityname == "Bangalore") {
//					Bangalore b=new Bangalore("Tourist");
//					 b.Slideshow();
//					 b.show();
					setVisible(false);
				}
				if(cityname == "Hyderabad") {
					setVisible(false);
				}
				if(cityname == "Chennai") {
					setVisible(false);
				}
				if(cityname == "Mangalore") {
					setVisible(false);
				}
			}
		});
	    
		JTextArea textArea_1 = new JTextArea();
		JTextArea textArea_2 = new JTextArea();
		JTextArea textArea_3 = new JTextArea();
		JTextArea textArea_4 = new JTextArea();
		JTextArea textArea_5 = new JTextArea();
		JTextArea textArea_6 = new JTextArea();
		
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(h1txt);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(h2txt);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(h3txt);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(h4txt);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setText(h5txt);
		textArea_5.setLineWrap(true);
		textArea_5.setWrapStyleWord(true);
		textArea_5.setEditable(false);
		textArea_5.setCaretPosition(0);
		
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(h6txt);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		
		JLabel img1 = new JLabel();
		JLabel img2 = new JLabel();
		JLabel img3 = new JLabel();
		JLabel img4 = new JLabel();
		JLabel img5 = new JLabel();
		JLabel img6 = new JLabel();
		
		JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane scrollPane5 = new JScrollPane(textArea_5,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JScrollPane scrollPane6 = new JScrollPane(textArea_6,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		scrollPane1.setBounds(300, 100, 250,150);
		scrollPane2.setBounds(1000,100,250,150);
		scrollPane3.setBounds(300,300,250,150);
		scrollPane4.setBounds(1000,300,250,150);
		scrollPane5.setBounds(300,500,250,150);
		scrollPane6.setBounds(1000,500,250,150);
		
		back1.add(scrollPane1);
		back1.add(scrollPane2);
		back1.add(scrollPane3);
		back1.add(scrollPane4);
		back1.add(scrollPane5);
		back1.add(scrollPane6);
//		disp1=new JLabel();
//		disp1.setBounds(10,130,240,150);
//		disp1.setVisible(true);
//		pic.add(disp1);

		
//		SetImageSize(img1,new ImageIcon(h1img));
//		SetImageSize(img2,new ImageIcon(h2img));
//		SetImageSize(img3,new ImageIcon(h3img));
//		SetImageSize(img4,new ImageIcon(h4img));
//		SetImageSize(img5,new ImageIcon(h5img));
//		SetImageSize(img6,new ImageIcon(h6img));
		
		img1.setBounds(100, 100, 200, 150);
		img2.setBounds(800, 100, 200, 150);
		img3.setBounds(100, 300, 200, 150);
		img4.setBounds(800, 300, 200, 150);
		img5.setBounds(100, 500, 200, 150);
		img6.setBounds(800, 500, 200, 150);
		
		back1.add(img1);
		back1.add(img2);
		back1.add(img3);
		back1.add(img4);
		back1.add(img5);
		back1.add(img6);
		Imageshow is = new Imageshow() {};
		is.SetImageSizeForCity(img1, new ImageIcon(h1img));
		Imageshow is2 = new Imageshow() {};
		is2.SetImageSizeForCity(img2, new ImageIcon(h2img));
		Imageshow is3 = new Imageshow() {};
		is3.SetImageSizeForCity(img3, new ImageIcon(h3img));
		Imageshow is4 = new Imageshow() {};
		is4.SetImageSizeForCity(img4, new ImageIcon(h4img));
		Imageshow is5 = new Imageshow() {};
		is5.SetImageSizeForCity(img5, new ImageIcon(h5img));
		Imageshow is6 = new Imageshow() {};
		is6.SetImageSizeForCity(img6, new ImageIcon(h6img));
		Imageshow is7 = new Imageshow() {};
        
        is7.SetImageSizeCity(back1);

	}
	

}
