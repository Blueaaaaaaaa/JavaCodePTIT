package Java;
import java.awt.*;
public class JavaApplication73 
{

    public static void main(String[] args) 
    {
       Frame myFrame = new Frame("Login");
       myFrame.setSize(300,300);
//       myFrame.setLayout(new FlowLayout());
       myFrame.setLayout(new GridLayout(3,2));
       for(int i=0;i<10;i++)
       {
           myFrame.add(new Button("Click" + i));
       }
       myFrame.setVisible(true);
    }
    
}