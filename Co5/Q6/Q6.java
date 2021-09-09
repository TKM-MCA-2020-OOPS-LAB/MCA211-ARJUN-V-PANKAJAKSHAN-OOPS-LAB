import java.awt.*;
import java.applet.*;
public class choice extends Applet
{
		TextField t1;
		public void init()
        {
                t1 = new TextField(10);

                add(t1);
                
                t1.setText("0");
                
        }
        public void paint(Graphics g)
        {
                int a=0;
                String str1;

                g.drawString("1 : Cricle \n2 : Line \n3 : Rectanlge \nEnter the choice ",10,20);

                try
                {
                        str1=t1.getText();
                        a=Integer.parseInt(str1);
                }
                catch(Exception e)
                {
                }
                
			

                g.drawString("Shape is",150,150);
		g.setColor(Color.red);
		if (a==1){
			g.drawOval(20,20,200,120);
			}
		else if (a==2) {
			g.drawRect(100, 100, 200, 200);
			}
		else {
			g.drawRect(300, 100, 400, 200);
			}
		showStatus("Shape is");
                
        }
}



