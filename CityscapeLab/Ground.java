import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.Color;

/**
 * Write a description of class Ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ground
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    /**
     * Default constructor for objects of class Ground
     */
    public Ground()
    {
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double grass = new Rectangle2D.Double(0,480,800,30);
        g2.setPaint(Color.GREEN);
        g2.fill(grass);
        Rectangle2D.Double road = new Rectangle2D.Double(0,500,800,80);
        g2.setPaint(Color.BLACK);
        g2.fill(road);
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        g2.setPaint(Color.YELLOW);
        for (int item : numbers) 
        {
             Rectangle2D.Double newRoadBlock = new Rectangle2D.Double((item-1)*80,540,40,10);
             g2.fill(newRoadBlock);
        }
    }

}
