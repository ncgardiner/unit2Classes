import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    private BasicBuilding building1;
    private BasicBuilding building2;
    private BasicBuilding building3;
    private BasicBuilding building4;
    private BasicBuilding building5;
    private BasicBuilding building6;
    private Ground groundObject;
    private Sky skyObject;
    private Random r2;
    private int y;
    /**
     * Describe instance variables
     */
    public CityscapeComponent(String timeOfDay)
    {
        r2 = new Random();
        y = r2.nextInt(200)+150;
        building1 = new BasicBuilding(20,y);
        y = r2.nextInt(200)+150;
        building2 = new BasicBuilding(140,y);
        y = r2.nextInt(200)+150;
        building3 = new BasicBuilding(260,y);
        y = r2.nextInt(200)+150;
        building4 = new BasicBuilding(390,y);
        y = r2.nextInt(200)+150;
        building5 = new BasicBuilding(520,y);
        y = r2.nextInt(200)+150;
        building6 = new BasicBuilding(640,y);
        groundObject = new Ground();
        skyObject = new Sky(timeOfDay);
    }
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        
        Graphics2D g2 = (Graphics2D) g;
        skyObject.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        groundObject.draw(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
