import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="graph.class" width=500 height=500>  </applet>*/
public class graph extends Applet 
{
public void init()
{setBackground(Color.cyan);
}
public void paint(Graphics g)
{
g.setColor(Color.blue);
g.drawRect(100,20,50,50);
g.setColor(Color.green);
g.fillRoundRect(200,20,80,50,50,60);
g.setColor(Color.red);
g.drawOval(20,100,50,80);
g.setColor(Color.pink);
g.fillOval(100,130,50,50);
int x[ ]={20,100,150};
int y[ ]={230,220,280};
int n=3;
g.setColor(Color.yellow);
g.drawPolygon(x,y,n);
int a[ ]={200,180,170,180,130,250};
int b[ ]={250,320,110,210,190,150};
g.setColor(Color.orange);
g.fillPolygon(a,b,n);
} }
