
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class Q13_Frame implements MouseListener, MouseMotionListener {
	         
	 private JFrame frame;
	 String msg=" ";
	 static int a;
	 static int b;
	 int mouseX=0, mouseY=0;
	 public  Q13_Frame() {
		 prepareGUI();
		 addMouseListener(this);
		 addMouseMotionListener(this);
		 addWindowListener(new MyWindowAdapter());
	 }
	 private void prepareGUI(){
	 	frame = new JFrame("Swing Mouse Event");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label1 = new JLabel()

	 }
		         
	 public void mouseClicked(MouseEvent me) {
	        mouseX=me.getX();
		mouseY=me.getY();
		setSize(a,b);
		msg="mouse clicked";
		repaint();
	}
		
	public void mouseEntered(MouseEvent me) {
		mouseX=me.getX();
		mouseY=me.getY();
		setSize(3*a,3*b);
		msg="mouse entered";
		repaint();
	}
	
	public void mouseExited(MouseEvent me) {
	       setVisible(false);
	       msg="frame closed";
	       repaint();
	}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseDragged(MouseEvent me){}
	public void mouseMoved(MouseEvent me){}
		
	public void paint(Graphics g) {
		g.drawString(msg, mouseX,mouseY);
	}
		
	public static void main(String[] args) {
	        
	}

}


