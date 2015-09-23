import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

public class Target
{
    private int xCoord;
    private int yCoord;
    
    public Target(int x, int y)
    {
      xCoord = x;
      yCoord = y;
    }
    public void draw(Graphics2D paintbrush)
    {
        //ayy le mayo
        Ellipse2D.Double layer1 = new Ellipse2D.Double(xCoord-50 , yCoord-50 , 100 , 100);
        Ellipse2D.Double layer2 = new Ellipse2D.Double(xCoord-40 , yCoord-40 , 80 , 80);
        Ellipse2D.Double layer3 = new Ellipse2D.Double(xCoord-30 , yCoord-30 , 60 , 60);
        Ellipse2D.Double layer4 = new Ellipse2D.Double(xCoord-20 , yCoord-20 , 40 , 40);
        Ellipse2D.Double layer5 = new Ellipse2D.Double(xCoord-10 , yCoord-10 , 20 , 20);
        paintbrush.setColor(java.awt.Color.BLACK);
        paintbrush.draw(layer1);
        paintbrush.fill(layer1);
        paintbrush.setColor(java.awt.Color.WHITE);
        paintbrush.draw(layer2);
        paintbrush.fill(layer2);
        paintbrush.setColor(java.awt.Color.BLACK);
        paintbrush.draw(layer3);
        paintbrush.fill(layer3);
        paintbrush.setColor(java.awt.Color.WHITE);
        paintbrush.draw(layer4);
        paintbrush.fill(layer4);
        paintbrush.setColor(java.awt.Color.BLACK);
        paintbrush.draw(layer5);
        paintbrush.fill(layer5);
    }
}