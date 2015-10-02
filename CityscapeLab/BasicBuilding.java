import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
/**
 * Write a description of class BasicBuilding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicBuilding
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    /**
     * Default constructor for objects of class BasicBuilding
     */
    public BasicBuilding(int x,int y)
    {
        xLeft = x;
        yTop = y;
    }
    
    /**
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     */
    public void draw(Graphics2D g2)
    {
        
        Rectangle2D.Double body = new Rectangle2D.Double(xLeft,yTop,50,200);
        
        
        g2.draw(body);
    }

}
