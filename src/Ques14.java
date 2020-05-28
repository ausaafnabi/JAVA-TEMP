import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ques14 extends JFrame implements ActionListener{
    JLabel jlabel;
    JButton jbutton;
    Ques14(){
        jlabel=new JLabel("Click the button to change background to pink");
        setLayout(new FlowLayout());
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jbutton =new JButton("PINK");
jbutton.addActionListener(this);
add(jlabel);
add(jbutton);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==jbutton){
jlabel.setText("Color changed");
getContentPane().setBackground(Color.PINK);
}
}
public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new Ques14();
}
});
}
}