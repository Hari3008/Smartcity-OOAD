package smartcitymini;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

abstract class Imageshow{  
	public void SetImageSizeCity(JLabel back)
	{
		ImageIcon icon=new ImageIcon("D:\\SmartCity-Application\\SmartCity\\img\\bg13.jpg");
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		back.setIcon(newImc);
		
	}
	public void SetImageSizeForCity(JLabel back,ImageIcon im)
	{
		ImageIcon icon=im;
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		//Image newImg=img.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		back.setIcon(newImc);
		
	}
	
}