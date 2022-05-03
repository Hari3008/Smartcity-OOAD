package smartcitymini;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;



import AppPackage.AnimationClass;

public class Mangalore extends JFrame {

	private JPanel contentPane;
	public String role_Mangalore;	
	AnimationClass AC=new AnimationClass();
	static JScrollPane scroll ;
	JLabel bslide1,bslide2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mangalore frame = new Mangalore("Student");
					frame.setVisible(true);
					frame.Slideshow();
					//frame.getContentPane().add(scroll);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	JLabel back ; 
	public Mangalore(String role) {
		role_Mangalore = role;
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
		
		Slideshow();
		setBounds(100, 100, 1500, 800);
		
		
		back= new JLabel("");
		back.setBounds(0, 0, 1500, 750 );
		contentPane.add(back);
		
		JLabel title = new JLabel("MANGALORE");
		back.add(title);
		title.setFont(new Font("Tahoma", Font.BOLD, 18));
		title.setForeground(Color.WHITE);
		title.setBounds(10, 10, 200, 40);
		
         bslide1 = new JLabel("");
         back.add(bslide1);
         bslide1.setBounds(0, 140,840, 500);
         
         bslide2 = new JLabel("");
         bslide2.setBounds(840, 140, 840, 500);
         back.add(bslide2);
       

        JButton Tourism = new JButton("Places to Visit");
        back.add(Tourism);
        Tourism.setBackground(Color.WHITE);
        Tourism.setBounds(934, 20, 150, 23);
        
        JButton Education = new JButton("Education");
        back.add(Education);
        Education.setBackground(Color.WHITE);
        Education.setBounds(1070, 20, 100, 23);
        
        JButton Lodging = new JButton("Lodging");
        back.add(Lodging);
        Lodging.setBackground(Color.WHITE);	
        Lodging.setBounds(750, 20, 100, 23);
        
        
        JButton Business = new JButton("Jobs");
        back.add(Business);
        Business.setBackground(Color.WHITE);
        Business.setBounds(840, 20, 100, 23);
        
       JButton Hotel = new JButton("Restaurants");
        back.add(Hotel);
        Hotel.setBackground(Color.WHITE);
        Hotel.setBounds(1163, 20, 120, 23);
      
        JButton Map = new JButton("Map");
        back.add(Map);
        Map.setBackground(Color.WHITE);
        Map.setBounds(1283, 20, 100, 23);
      
        Map.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        			MapMlore m = new MapMlore();
        	}
        });
        
        
        Lodging.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(role_Mangalore=="Tourist" || role_Mangalore=="JobSeeker") {
        		BLHyd bl = new BLHyd();
        		}
        		else {
        			JOptionPane.showMessageDialog(null,"No access for Students");
        		}
        		
        	}
        });
        Business.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(role_Mangalore=="JobSeeker") {
        		JobsMlore j = new JobsMlore();
        		}
        		else {
        			JOptionPane.showMessageDialog(null,"No access for Non-JobSeekers");
        		}
        	}
        });
        Hotel.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(role_Mangalore=="Tourist"){
        		HotelsMang h = new HotelsMang();
        		}
        		else {
        			JOptionPane.showMessageDialog(null,"No access for Non-Tourists");
        		}
        	}
        });
      
        Education.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(role_Mangalore=="Student"){
        		EducationMlore t=new EducationMlore(); 
        		}
        		else {
        			JOptionPane.showMessageDialog(null,"No access for Non-Students");
        		}
        	}
        	
        });
        Education.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        Tourism.addMouseListener(new MouseAdapter() {
        	@SuppressWarnings("deprecation")
        	@Override
        	public void mouseClicked(MouseEvent e) {
                if(role_Mangalore=="Tourist") {
  
                	PlacesMangalore t=new PlacesMangalore(); 
                }
                else {
					JOptionPane.showMessageDialog(null,"No access for Non-Tourists");
                }
        		
        	}
        });
        Tourism.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
         bslide1.setVisible(true);
         bslide2.setVisible(true);
         Imageshow is = new Imageshow() {};
         
         is.SetImageSizeCity(back);

	}

	public void Slideshow(){
		new Thread(){
			int count=0;
			@Override
			public void run()
			{
				try{
					while(true)
					{
						switch(count)
						{
						case 0 : 
							
							    ImageIcon i1=new ImageIcon(".//img//slide//mang2.jpg");
						        bslide1.setIcon(i1);
						        bslide1.setVisible(true);
						        Thread.sleep(2000);
							    AC.jLabelXLeft(0,-840,20,7, bslide1);
						        AC.jLabelXLeft(840, 0,20,7, bslide2);
						        count=1;
								break;
						case 1: 
							
					    ImageIcon i2=new ImageIcon(".//img//slide//mang3.jpg");
				        bslide2.setIcon(i2);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXRight(-840,0,20,7, bslide1);
				        AC.jLabelXRight(0, 840,20,7, bslide2);
				        count=2;
						break;
						case 2: 
					    ImageIcon i3=new ImageIcon(".//img//slide//mang2.jpg");
				        bslide1.setIcon(i3);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXLeft(0,-840,20,7, bslide1);
				        AC.jLabelXLeft(840, 0,20,7, bslide2);
				        count=3;
						break;
						case 3: 
					    ImageIcon i4=new ImageIcon(".//img//slide//mang3.jpg");
				        bslide2.setIcon(i4);
				        bslide2.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXRight(-840,0,20,7, bslide1);
				        AC.jLabelXRight(0, 840,20,7, bslide2);
				        count=4;
						break;
						case 4: 
					    ImageIcon i5=new ImageIcon(".//img//slide//mang2.jpg");
				        bslide1.setIcon(i5);
				        bslide1.setVisible(true);
				        Thread.sleep(2000);
				        AC.jLabelXLeft(0, -840,20,7, bslide1);
				        AC.jLabelXLeft(840, 0,20,7, bslide2);
				        count=0;
						break;
						}
					}
					
				}
				catch(Exception e)
				{
					
				}
			}
		}.start();
	}
}