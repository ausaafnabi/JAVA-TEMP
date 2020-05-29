import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

class Mouse extends JFrame implements MouseListener, MouseMotionListener { 
	//Initializing JFrame
	public static JFrame frame= new JFrame();
	
	// Jlabels to display the actions of events of MouseMotionListener 
	static JLabel label1, label2, label3;
 
	static int a;
	static int b;
	int mouseX=0, mouseY=0;
	// default constructor 
	Mouse() 
	{ 
	} 
 
	public static void main(String[] args) 
	{ 
		a = 400;
		b = 100;
		// set the size of the frame 
		frame.setSize(new Dimension(a,b)); 

		// close the frame when close button is pressed 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// create anew panel 
		JPanel p = new JPanel(); 

		// set the layout of the panel 
		p.setLayout(new FlowLayout()); 

		// initialize the labels 
		label1 = new JLabel(""); 

		label2 = new JLabel(""); 
		
		label3 = new JLabel("");
		// create an object of mouse class 
		Mouse m = new Mouse(); 

		// add mouseListener to the frame 
		//frame.addMouseMotionListener(m); 
		frame.addMouseListener(m);
		// add labels to the panel 
		p.add(label1); 
		p.add(label2); 
		p.add(label3);
		// add panel to the frame 
		frame.add(p); 

		frame.show(); 
	} 

	public void mouseClicked(MouseEvent e) 
	{ 
	    mouseX = e.getX();
	    mouseY = e.getY();
		frame.setSize(a,b);
		label1.setText("mouse Clicked! Screen Restored to Original Size");
		label2.setText("");
		label3.setText("");
	} 

	// invoked when the cursor Enter the Frame 
	// one point to another within the component 
	public void mouseEntered(MouseEvent e) 
	{ 	mouseX = e.getX();
		mouseY = e.getY();
		frame.setSize(3*a,3*b);
		// update the label 
		label1.setText("");
		label2.setText("mouse Entered! Enlarging the screen by Factor of 3x ");
		label3.setText("");
	} 
	public void mouseExited(MouseEvent e){
		label3.setText("Mouse Exited! Closing the Frame");
		frame.dispose();
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseDragged(MouseEvent e){}
	public void mouseMoved(MouseEvent e){}
} 
