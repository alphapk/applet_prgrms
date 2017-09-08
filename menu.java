import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="menu.class"width=500 height=500>   </applet>
class menucreation extends Frame
{
menucreation()
{
MenuBar mb=new MenuBar();
setMenuBar(mb);
Menu file1=new Menu("file1");
Menu edit1=new Menu("edit1");
Menu exit1=new Menu("exit1");
mb.add(file1);
mb.add(edit1);
mb.add(exit1);
MenuItem new1,open1,print1,copy1,paste1,cut1;
new1=new MenuItem("New");
print1=new MenuItem("Print");
open1=new MenuItem("Open");
copy1=new MenuItem("Copy");
paste1=new MenuItem("Paste");
cut1=new MenuItem("Cut");
file1.add(new1);
file1.add(open1);
file1.add(print1);
Menu font1=new Menu("font1");
file1.add(font1);
font1.add("Arial");
font1.add("TimesNewRoman");
edit1.add(cut1);
edit1.add(copy1);
edit1.add(paste1);
}
}

 
public class menu extends Applet implements ActionListener
{
menucreation m=new menucreation();
Button b1,b2;
public void init()
{
setBackground(Color.magenta);
b1=new Button("Show Window");
b2=new Button("Hide Window");
add(b1);
add(b2);
m.setSize(400,400);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
m.show();
}
if(e.getSource()==b2)
{
m.hide();
}
}
}
 
