import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.Color;
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
    private Random r1;
    private int colorRand;
    private int widthRand;
    private Color[] colorArray = {Color.GRAY, Color.RED, Color.YELLOW}; /*Jay made this*/
    /** 
     * Default constructor for objects of class BasicBuilding
     */
    public BasicBuilding(int x,int y)
    {
        xLeft = x;
        yTop = y;
        r1 = new Random();
        colorRand = r1.nextInt(3);
        widthRand = r1.nextInt(60);
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
        Rectangle2D.Double body = new Rectangle2D.Double(xLeft,yTop,widthRand+40,750);
        g2.setPaint(colorArray[colorRand]);
        g2.fill(body);
    }

}
