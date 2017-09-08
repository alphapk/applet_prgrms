import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="pan.class"width=400 height=400>  </applet>
public class pan extends Applet
{
public void init()
{
setLayout(new GridLayout(2,2));
setFont(new Font("Comic sans",Font.BOLD,12));
Panel flow=new Panel();
flow.setBackground(Color.green);
flow.setLayout(new FlowLayout());
flow.add(new Button("flow1"));
flow.add(new Button("flow2"));
flow.add(new Button("flow3"));
flow.add(new Button("flow4"));
flow.add(new Label("FlowLayout"));
add(flow);
Panel border=new Panel();
border.setForeground(Color.red);
border.setLayout(new BorderLayout());
border.add(new Button("North"),BorderLayout.NORTH);
border.add(new Button("South"),BorderLayout.SOUTH);
border.add(new Button("East"),BorderLayout.EAST);
border.add(new Button("West"),BorderLayout.WEST);
border.add(new Button("BorderLayout"),BorderLayout.CENTER);
add(border);
Panel grid=new Panel();
grid.setForeground(Color.blue);
grid.setBackground(Color.yellow);
grid.add(new Button("grid1"));
grid.add(new Button("grid2"));
grid.add(new Button("grid3"));
grid.add(new Button("grid4"));
add(grid);
}
public void paint(Graphics g)
{
g.drawString("GridLayout",200,250);
}
}

 
