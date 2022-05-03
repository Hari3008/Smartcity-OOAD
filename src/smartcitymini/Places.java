package smartcitymini;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Places extends JFrame{
	
	private JPanel contentPane;
    JButton goback; 
    JLabel back1;
    
	public Places(String p1, String p2, String p3, String p4, String p5, String p6, String img1, String img2, String img3, String img4, String img5, String img6, String cityname) {
		contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		setVisible(true);
		setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		
		
        back1= new JLabel("");
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);
		contentPane.add(back1);
		
		JLabel title = new JLabel("PLACES TO VISIT");
		title.setFont(new Font("Tahoma", Font.BOLD, 18));
		title.setForeground(Color.WHITE);
		title.setBounds(10, 10, 200, 40);
		back1.add(title);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(p1);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(p2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(p3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(p4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBackground(Color.WHITE);
		textArea_5.setText(p5);
		textArea_5.setLineWrap(true);
		textArea_5.setWrapStyleWord(true);
		textArea_5.setEditable(false);
		textArea_5.setCaretPosition(0);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(p6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		
		add(back1);
		
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
		
		
		JLabel i1 = new JLabel();
		i1.setBounds(100, 100, 200, 150);
		SetImageSize(i1,new ImageIcon(img1));
		back1.add(i1);
		
		JLabel i2 = new JLabel();
		i2.setBounds(800, 100, 200, 150);
		SetImageSize(i2, new ImageIcon(img2));
		back1.add(i2);
		
		JLabel i3 = new JLabel();
		i3.setBounds(100, 300, 200, 150);
		SetImageSize(i3,new ImageIcon(img3));
		back1.add(i3);

		JLabel i4 = new JLabel();
		i4.setBounds(800, 300, 200, 150);
		SetImageSize(i4,new ImageIcon(img4));
		back1.add(i4);
		
		JLabel i5 = new JLabel();
		i5.setBounds(100, 500, 200, 150);
		SetImageSize(i5,new ImageIcon(img5));
		back1.add(i5);
		
		JLabel i6 = new JLabel();
		i6.setBounds(800, 500, 200, 150);
		SetImageSize(i6,new ImageIcon(img6));
		back1.add(i6);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.BLACK);
		goback.setBounds(1150, 0, 200, 34);

		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		Imageshow is = new Imageshow() {};
        is.SetImageSizeCity(back1);
	    
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
