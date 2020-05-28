
import java.awt.*;
import java.awt.event.*;
public class Ques12 extends Frame implements ActionListener{
	private static final long serialVersionUID=1L;
	Button button1,button2;
	Label label1,label2,label3,label4,label5;
	Ques12(){
		button1=new Button("A");
		button2=new Button("B");
		button1.setBounds(100,100,100,30);
		button2.setBounds(500,100,100,30);
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button1){
			
			label1=new Label("Name - Ausaaf Nabi");
			label1.setBounds(100,200,420,50);
			
			label2=new Label("Course - B.Sc. (H.) Computer Science");
			label2.setBounds(100,250,420,50);
			
			label3=new Label("Roll Number - CSC/19/41");
			label3.setBounds(100,300,420,50);
			
			label4=new Label("College - Aryabhatta College, University of Delhi");
			label4.setBounds(100,350,420,50);
			add(label1);
			add(label2);
			add(label3);
			add(label4);
			
		}
		if(e.getSource()==button2){
			label1.setText("");
			label2.setText("");
			label3.setText("");
			label4.setText("");
			label5=new Label("CGPA in last semester was 9.18");
			label5.setBounds(550, 200, 420, 50);
			add(label5);
		}
		}
	public static void main(String[] args){
		Ques12 obj=new Ques12();
     	obj.setTitle("New Frame");
     	obj.setSize(900,500);
     	obj.setLayout(null);
     	obj.setVisible(true);
     	obj.addWindowListener(new WindowAdapter()
      	{
           public void windowClosing(WindowEvent e)
           {
               System.exit(0);
           }
       });
	}
}