import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="MouseEventsExample" width=400 height=200></applet> */
public class MouseEventsExample extends Applet implements MouseListener {
 String msg = "";
 public void init() {
 addMouseListener(this);
 }
 public void mouseClicked(MouseEvent e) {
 msg = "Mouse Clicked";
 repaint();
 }
 public void mousePressed(MouseEvent e) {
 msg = "Mouse Pressed";
 repaint();
 }
 public void mouseReleased(MouseEvent e) {
 msg = "Mouse Released";
 repaint();
 }
 public void mouseEntered(MouseEvent e) {
 msg = "Mouse Entered";
 repaint();
 }
 public void mouseExited(MouseEvent e) {
 msg = "Mouse Exited";
 repaint();
 }
 
SHREE MEDHA DEGREE COLLEGE, BALLARI
DEPT. OF COMPUTER APPLICATIONS Page No. _____
public void paint(Graphics g) {
 g.setFont(new Font("Arial", Font.BOLD, 18));
 g.drawString(msg, 100, 100);
 }
}
