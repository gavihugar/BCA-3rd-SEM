import java.applet.*;
import java.awt.*;
/* <applet code="PersonalInfo" width=300 height=200></applet> */
public class PersonalInfo extends Applet {
 public void paint(Graphics g) {
 g.drawString("Name: Rahul Kumar", 50, 60);
 g.drawString("Age: 20", 50, 80);
 g.drawString("Course: BCA", 50, 100);
 g.drawString("College: SMDC", 50, 120);
 }
}
