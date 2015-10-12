import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.Color;
/**
 *   Creates a building of random height, width, and color
 * 
 * @author ngardiner
 * @version 8 October 2015
 */
public class BasicBuilding
{
    /** 
     * xLeft- the x coordinate for the top left starting position of the building
     * yTop-  the y coordinate for the top left starting position of the building
     * r1- a random variable used to randomize the color and width of the building
     * colorRand- the randomly generated value for the color of the building
     * widthRand- the randomly generated value for the width of the building
     * colorArray- an Array containing all possible building colors
    */
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
     *    Draws the building of random height, width, and color
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double body = new Rectangle2D.Double(xLeft,yTop,widthRand+40,750);
        g2.setPaint(colorArray[colorRand]);
        g2.fill(body);
    }

}
