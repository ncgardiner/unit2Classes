import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Write a description of class CelestialBody here.
 * 
 * @author ngardiner
 * @version 8 October 2015
 */
public class CelestialBody
{
    /** 
     * time- a copy of the timeOfDay recieved from the user
     * x- the starting x position of the sun/moon
     * y- the starting y position of the sun/moon
     */
    private String time;
    private int x; 
    private int y;
    /**
     *  Default constructor for class CelestialBody
     */
    public CelestialBody(String timeOfDay,int xPos,int yPos)
    {
        time = timeOfDay;
        x= xPos;
        y= yPos;
    }
    /**
     *  Draws the sun/moon and fills them with the correct color
     *  If its nighttime, a second black ellipse will cover part of the moon
     *  to make a crescent
     * 
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
