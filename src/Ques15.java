import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ques15 extends JFrame implements ActionListener{
private static final long serialVersionUID=1L;
JLabel jlabel;
JButton jbutton1,jbutton2;
Ques15(){
setLayout(new FlowLayout());
setSize(400,200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jbutton1 = new JButton("RED");
jbutton2 = new JButton("BLUE");
jbutton1.addActionListener(this);
jbutton2.addActionListener(this);
add(jbutton1);
add(jbutton2);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==jbutton1){
getContentPane().setBackground(Color.RED);
}
if(e.getSource()==jbutton2){
getContentPane().setBackground(Color.BLUE);
}
}
public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new Ques15();
}
});
}
}