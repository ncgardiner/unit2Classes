import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.Color;

/**
 * Defines and draws a ground for the cityscape, consisting of a road with yellow lines
 * and grass
 * 
 * @ngardiner
 * @version 8 October 2015
 */
public class Ground
{
    /**
     * Defines the parameters for all objects in the Ground, then draws them
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
