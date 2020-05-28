import java.awt.*;
import java.awt.event.*;
public class Ques10 extends Frame implements ActionListener{
	Button button1,button2;
	Ques10(){
		button1=new Button("BLUE");
		button2=new Button("RED");
		button1.setBounds(120,100,100,30);
		button2.setBounds(250,100,100,30);
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button1){
			setBackground(Color.blue);
		}
		if(e.getSource()==button2){
			setBackground(Color.red);
		}
	}
	public static void main(String[] args){
		Ques10 my=new Ques10();
		my.setTitle("Question 10");
		my.setSize(500,300);
		my.setLayout(null);
		my.setVisible(true);
		 my.addWindowListener(new WindowAdapter()
         {
              public void windowClosing(WindowEvent e)
              {
                  System.exit(0);
              }
          });
	}
}