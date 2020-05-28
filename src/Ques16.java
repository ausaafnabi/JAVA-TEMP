import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ques16 extends JFrame implements KeyListener{

JLabel jlabel;
public Ques16(){
addKeyListener(this);
setSize(200,200);
jlabel=new JLabel("");
add(jlabel);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void keyReleased(KeyEvent e)
{
}
public void keyPressed(KeyEvent e)
{
}
public void keyTyped(KeyEvent e){
jlabel.setText("Key Typed is : "+e.getKeyChar());
repaint();
}
public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new Ques16();
}
});
}
}