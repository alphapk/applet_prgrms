
import java.awt.*;
import java.applet.*;
// <applet code="font.class"width=500 height=500>     </applet>
public class font extends Applet
{
Font f;
String s;
public void paint(Graphics g)
{
setBackground(Color.pink);
g.setColor(Color.magenta);
f=new Font("Arial",Font.PLAIN,25);
g.setFont(f);
g.drawString("VELSUNIVERSITY-VISTAS",10,50);
g.setColor(Color.green);
f=new Font("Arial",Font.PLAIN,25);
g.setFont(f);
g.drawString("PV VAITHIYALINGAM ROAD",10,100);
g.setColor(Color.yellow);
f=new Font("Courier",Font.ITALIC,25);
g.setFont(f);
g.drawString("Pallavaram-Chennai",10,150);
g.setColor(Color.cyan);
f=new Font("Helvectica",Font.BOLD,25);
g.setFont(f);
g.drawString("VELSUNIVERSITY",10,200);
g.setColor(Color.black);
f=new Font("TimesNewRoman",Font.BOLD+Font.ITALIC,25);
g.setFont(f);
g.drawString("Get the properties of last text",10,250);
s="Name is : "+f.getName();
g.drawString(s,10,300);
g.setColor(Color.red);
s="Size is : "+f.getSize();
g.drawString(s,10,350);
g.setColor(Color.blue);
s="Style is : "+f.getStyle();
g.drawString(s,10,400);
}
}
 
