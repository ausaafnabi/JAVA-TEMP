import java.awt.*;
import java.awt.event.*;

public class Ques11 extends Frame implements KeyListener {
  String message=" ";
  public Ques11()
  {
    addKeyListener(this);
  }
  public void keyTyped(KeyEvent key)
  {
    message="Typed_Character_is : "+ key.getKeyChar();
    repaint();
  }
  public void keyPressed(KeyEvent key){}
  public void keyReleased(KeyEvent key){}
  public void paint(Graphics g)
  {
    g.drawString(message, 50, 150);
  }
  public static void main(String[] args) {
    Ques11 obj= new Ques11();
    obj.setSize(new Dimension(300,300));
    obj.setTitle("Question 11");
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