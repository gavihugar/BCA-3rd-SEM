import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="MoveShapes" width=300 height=300></applet> */
public class MoveShapes extends Applet implements KeyListener {
 int x = 100, y = 100;
 public void init() {
 addKeyListener(this);
 setFocusable(true);
 }
 public void paint(Graphics g) {
 g.setColor(Color.red);
 g.fillOval(x, y, 50, 50); // moving circle
 g.setColor(Color.blue);
 g.fillRect(x + 80, y, 60, 40); // moving rectangle
 }
 public void keyPressed(KeyEvent e) {
 int k = e.getKeyCode();
 if (k == KeyEvent.VK_LEFT) x -= 10;
 if (k == KeyEvent.VK_RIGHT) x += 10;
 if (k == KeyEvent.VK_UP) y -= 10;
 if (k == KeyEvent.VK_DOWN) y += 10;
 repaint();
 }
 public void keyReleased(KeyEvent e) {}
 public void keyTyped(KeyEvent e) {}
}
