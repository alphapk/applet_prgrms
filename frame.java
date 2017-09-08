import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="frame.class"width=500 height=500>  </applet>

class frame extends Frame implements ActionListener
{
TextField f1;
Button b1,b2;
List l1;
frame()
{
Label l=new Label("Enter text");
setLayout(new FlowLayout());
f1=new TextField(10);
b1=new Button("Click to add item in an list");
b2=new Button("Click to remove item in an list");
l1=new List();
add(l);
add(l1);
add(f1);
add(b1);
add(b2);
f1.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
addWindowListener(new win());
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
l1.add(f1.getText());
f1.setText(" ");
}
else if(ae.getSource()==b2)
l1.remove(l1.getSelectedItem());
}
class win extends WindowAdapter
{
public void windowClosing(WindowEvent e)
{
System.exit(0);
}
}
public static void main(String args[])
{
frame f=new frame();
f.setSize(400,400);
f.setVisible(true);
f.setBackground(Color.pink);
}
}



 
