package MouseMotion;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class Panel extends JPanel{
	int x1,y1,x2,y2,x,y;
	Graphics g2;
	String str1,str2;
	public Panel()
	{
		MouseMotionListener mouseMotion = new KlikMyszy();
		addMouseMotionListener(mouseMotion);
	}
	public class KlikMyszy implements MouseMotionListener
	{
		public void mouseDragged(MouseEvent e)
		{
			x1 = e.getX();
			y1 = e.getY();
			str1 = " dragged x ="+x1+"   y="+y1;
			repaint();
		}
		public void mouseMoved(MouseEvent e)
		{
			x2 = e.getX();
			y2 = e.getY();
			str2 = "            move x="+x2+"   y="+y2;
			repaint();
		}
		public void mouseClicked(MouseEvent e)
		{
			x = e.getX();
			y = e.getY();
			repaint();
		}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mousePressed(MouseEvent e){}
	}//end class
	public void paintComponent(Graphics g)
	{
		g2 = (Graphics2D)g;
		g2.fillRect(x, y, 4, 4);
		
		g2.clearRect(200, 450, 500, 100);
		g2.drawString(str1+str2, 200, 500);
	}
}
