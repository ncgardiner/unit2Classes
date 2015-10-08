import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Write a description of class CelestialBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CelestialBody
{
    private String time;
    private int x; 
    private int y;
    /**
     * 
     */
    public CelestialBody(String timeOfDay,int xPos,int yPos)
    {
        time = timeOfDay;
        x= xPos;
        y= yPos;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        if (time.equals("d"))
        {
            Ellipse2D.Double sun = new Ellipse2D.Double(x+10,y+90,100,100);
            g2.setPaint(Color.YELLOW);
            g2.fill(sun);
        }
        else
        {
            Ellipse2D.Double moon = new Ellipse2D.Double(x+10,y+90,100,100);
            g2.setPaint(Color.GRAY);
            g2.fill(moon);
            Ellipse2D.Double moonCover = new Ellipse2D.Double(x+30,y+90,100,100);
            g2.setPaint(Color.BLACK);
            g2.fill(moonCover);
        }
    }
}
