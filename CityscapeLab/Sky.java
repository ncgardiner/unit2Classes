import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Color;

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
    private String time;
    /**
     * 
     * 
     * 
     */
    public Sky(String timeInput)
    {
        time = timeInput;
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
        Rectangle2D.Double sky = new Rectangle2D.Double(0,0,1000,1000);
        if (time.equals( "d"))
        {
            g2.setPaint(Color.BLUE);
        }
        else
        {
            g2.setPaint(Color.BLACK);
        }
        g2.fill(sky);
    }

}
