import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="GreetingApplet" width=600 height=300></applet> */
public class GreetingApplet extends Applet implements KeyListener {
 String msg = "";
 public void init() {
 addKeyListener(this);
 setFocusable(true);
 }
 public void paint(Graphics g) {
 g.setFont(new Font("Arial", Font.BOLD, 20));
 g.setColor(Color.blue);
 g.drawString("Press the following keys on the keyboard:", 40, 60);
g.drawString("M / m - Good Morning", 40, 90);
g.drawString("A / a - Good Afternoon", 40, 115);
g.drawString("E / e - Good Evening", 40, 140);
g.drawString("N / n - Good Night", 40, 165);
 g.setColor(Color.red);
 g.drawString(msg, 200, 235);
 }
 public void keyPressed(KeyEvent e) {
 char ch = e.getKeyChar();
 if (ch == 'M' || ch == 'm')
 msg = "Good Morning";
 else if (ch == 'A' || ch == 'a')
 msg = "Good Afternoon";
 else if (ch == 'E' || ch == 'e')
 msg = "Good Evening";
 else if (ch == 'N' || ch == 'n')
 msg = "Good Night";
 else
 msg = "Invalid key! Press M, A, E or N.";
 repaint();
SHREE MEDHA DEGREE COLLEGE, BALLARI
DEPT. OF COMPUTER APPLICATIONS Page No. _____
 }
 public void keyReleased(KeyEvent e) {}
 public void keyTyped(KeyEvent e) {}
 }
