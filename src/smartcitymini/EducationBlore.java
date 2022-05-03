package smartcitymini;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.border.EmptyBorder;

public class EducationBlore {

	public EducationBlore() {
		
		String s1 = "BISHOP COTTON BOY'S SCHOOL";
		String s2 = "INDUS INTERNATIONAL SCHOOL";
		String s3 = "MOUNT CARMEL SCHOOL";
		String s4 = "SOPHIAS HIGH SCHOOL";
		String simg1 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-bishopscottonboysschool.jpg";
		String simg2 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-indusinternationalschool.jpg";
		String simg3 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-mountcarmelschool.png";
		String simg4 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-sophiashighschool.jpg";
		String c1 = "DEEKSHA COLLEGE";
		String c2 = "JAIN COLLEGE";
		String u1 = "INDIAN INSTITUTE OF SCIENCE";
		String u2 = "IIIT ";
		String u3 = "BANGALORE UNIVERSITY";
		String cimg1 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-deeksha.png";
		String cimg2 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-Jaincollege.png";
		String uimg1 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-iiscbanguniv.jpg";
		String uimg2 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-IIITbanguniv.jpg";
		String uimg3 = "D:\\SmartCity-Application\\SmartCity\\img\\Bangalore\\edu-banguniv.jpg";
		
		String cityname = "Bangalore";
		
		System.out.println("Test1");
		Education e = new Education(s1,s2,s3,s4,c1,c2,u1,u2,u3,simg1,simg2,simg3,simg4,cimg1,cimg2,uimg1, uimg2, uimg3, cityname);
		e.show();

	}
}