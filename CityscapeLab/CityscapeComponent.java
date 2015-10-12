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
    /**
     * building1,2,3,4,5,6- creates a row of buildings evenly spaced apart
     * groundObject- creates a road and grass
     * skyObject- creates the background sky 
     * sun_or_moon- creates a sun or moon, depending on the timOfDay
     * r2- a Random variable used to randomize the heights of the buildings
     * xPos and yPos- the x and y coordinates for the sun_or_moon to be created at
     * loopCount- counts the amount of frames that have passed in the animation
     * time- whether the user has entered day or night
     */
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
    private int xPos;
    private int yPos;
    private int loopCount;
    private String time;
    /**
     *  default constructor for class Cityscape
     */
    public CityscapeComponent(String timeOfDay)
    {
        time = timeOfDay;
        r2 = new Random();
        building1 = new BasicBuilding(20,r2.nextInt(200)+150);
        building2 = new BasicBuilding(140,r2.nextInt(200)+150);
        building3 = new BasicBuilding(260,r2.nextInt(200)+150);
        building4 = new BasicBuilding(390,r2.nextInt(200)+150);
        building5 = new BasicBuilding(520,r2.nextInt(200)+150);
        building6 = new BasicBuilding(640,r2.nextInt(200)+150);
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
     * Also re paints the clouds each frame to show them being blown by the wind
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
