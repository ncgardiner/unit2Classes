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
    private CelestialBody sun_or_moon;
    private Random r2;
    private int y;
    private int xPos;
    private int yPos;
    private int loopCount;
    private String time;
    /**
     * Describe instance variables
     */
    public CityscapeComponent(String timeOfDay)
    {
        time = timeOfDay;
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
        skyObject = new Sky(time);
        xPos = 0;
        yPos = 0;
        sun_or_moon = new CelestialBody(time,xPos,yPos);
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
        sun_or_moon.draw(g2);
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        groundObject.draw(g2);
    }
    
    /**
     * Updates the Sun / Moon to move in an arc across the sky
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        loopCount+=1;
        if (loopCount<=10)
        {
            yPos -= 5;
        }
        else
        {
            if (loopCount <= 20)
            {
                yPos -= 2;
            }
            else
            {
                if (loopCount <= 30)
                {
                    yPos += 0;
                }
                else
                {
                    if (loopCount <= 40)
                    {
                        yPos += 2;
                    }
                    else
                    {
                        yPos += 5;
                    }
                }
            }
        }
        xPos = loopCount*11;
        sun_or_moon = new CelestialBody(time,xPos,yPos);
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
