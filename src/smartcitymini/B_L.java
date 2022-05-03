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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class B_L extends JFrame{
	
    JLabel back1;
	JButton goback;
	private JPanel contentPane;
	
    public B_L(String b1, String b2, String b3, String b4, String b5, String b6, String i1, String i2, String i3, String i4, String i5, String i6, String cityname) {
    	
    	setLayout(null);
        setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		setVisible(true);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        
        back1= new JLabel("");
		back1.setBounds(0, 0, 1500, 750);
		back1.setVisible(true);
		contentPane.add(back1);
		
		JLabel title = new JLabel("BOARDING AND LOADING");
		title.setFont(new Font("Tahoma", Font.BOLD, 18));
		title.setForeground(Color.WHITE);
		title.setBounds(10, 10, 200, 40);
		back1.add(title);
		
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.BLACK);
		goback.setBounds(1150, 0, 200, 34);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(cityname == "Bangalore") {
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
		
		back1.add(goback);
		System.out.println(i1);
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(b1);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(b2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(b3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(b4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setText(b5);
		textArea_5.setLineWrap(true);
		textArea_5.setWrapStyleWord(true);
		textArea_5.setEditable(false);
		textArea_5.setCaretPosition(0);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(b6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		
		JLabel im1 = new JLabel();
//		im1.setBounds(100, 100, 200, 150);
//		SetImageSize(im1,new ImageIcon(i1));
		
		JLabel im2 = new JLabel();
//		im2.setBounds(100, 100, 200, 150);
//		SetImageSize(im2,new ImageIcon(i2));
		
		JLabel im3 = new JLabel();
//		im3.setBounds(100, 100, 200, 150);
//		SetImageSize(im3,new ImageIcon(i3));
		
		JLabel im4 = new JLabel();
//		im4.setBounds(100, 100, 200, 150);
//		SetImageSize(im4,new ImageIcon(i4));
		
		JLabel im5 = new JLabel();
//		im5.setBounds(100, 100, 200, 150);
//		SetImageSize(im5,new ImageIcon(i5));
		
		JLabel im6 = new JLabel();
//		im6.setBounds(800, 500, 200, 150);
//		SetImageSize(im6,new ImageIcon(i6));
		im1.setBounds(100, 100, 200, 150);
		im2.setBounds(800, 100, 200, 150);
		im3.setBounds(100, 300, 200, 150);
		im4.setBounds(800, 300, 200, 150);
		im5.setBounds(100, 500, 200, 150);
		im6.setBounds(800, 500, 200, 150);
		Imageshow is = new Imageshow() {};
		is.SetImageSizeForCity(im1, new ImageIcon(i1));
		Imageshow is2 = new Imageshow() {};
		is2.SetImageSizeForCity(im2, new ImageIcon(i2));
		Imageshow is3 = new Imageshow() {};
		is3.SetImageSizeForCity(im3, new ImageIcon(i3));
		Imageshow is4 = new Imageshow() {};
		is4.SetImageSizeForCity(im4, new ImageIcon(i4));
		Imageshow is5 = new Imageshow() {};
		is5.SetImageSizeForCity(im5, new ImageIcon(i5));
		Imageshow is6 = new Imageshow() {};
		is6.SetImageSizeForCity(im6, new ImageIcon(i6));

		back1.add(im1);
		back1.add(im2);
		back1.add(im3);
		back1.add(im4);
		back1.add(im5);
		back1.add(im6);
		 
		JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane1.setBounds(300, 100, 250,150);
		back1.add(scrollPane1);
		
		JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane2.setBounds(1000,100,250,150);
		back1.add(scrollPane2);
		
		JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane3.setBounds(300,300,250,150);
		back1.add(scrollPane3);
		
		JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane4.setBounds(1000,300,250,150);
		back1.add(scrollPane4);
		
		JScrollPane scrollPane5 = new JScrollPane(textArea_5,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane5.setBounds(300,500,250,150);
		back1.add(scrollPane5);
		
		JScrollPane scrollPane6 = new JScrollPane(textArea_6,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane6.setBounds(1000,500,250,150);
		back1.add(scrollPane6);
		
		Imageshow is1 = new Imageshow() {};
        
        is1.SetImageSizeCity(back1);
		
	}
    

}
