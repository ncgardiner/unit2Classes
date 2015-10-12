import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.Random;
/**
 * Write a description of class Sky here.
 * 
 * @author ngardiner
 * @version 8 October 2015
 */
public class Sky
{
    /**
     * time- a copy of the timeInput recieved from the user
     * r3- a Random vairable used to randomize the clouds' positions
     */
    private String time;
    private Random r3;
    /**
     * Default constructor for objects of class Sky
     */
    public Sky(String timeInput)
    {
        time = timeInput;
        r3 = new Random();
    }
    /**
     * Creates a sky that is either Blue or Black, depending on the time of day,
     * also creates randomly placed clouds throughout the sky
     *
     * @param    timeInput    a String of value "d" or "n" to specify day or night in the sky
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
        int[] numbers = {1,2,3,4,5};
        g2.setPaint(Color.WHITE);
        for (int cloud_num : numbers)
        {
            int xPos = r3.nextInt(700);
            int yPos = r3.nextInt(300);
            Ellipse2D.Double cloudBubble1 = new Ellipse2D.Double(xPos,yPos,30,30);
            Ellipse2D.Double cloudBubble2 = new Ellipse2D.Double(xPos-7,yPos+7,30,30);
            Ellipse2D.Double cloudBubble3 = new Ellipse2D.Double(xPos+8,yPos+11,30,30);
            Ellipse2D.Double cloudBubble4 = new Ellipse2D.Double(xPos+15,yPos-4,30,30);
            Ellipse2D.Double cloudBubble5 = new Ellipse2D.Double(xPos+13,yPos+3,30,30);
            Ellipse2D.Double cloudBubble6 = new Ellipse2D.Double(xPos+17,yPos+8,30,30);
            g2.fill(cloudBubble1);
            g2.fill(cloudBubble2);
            g2.fill(cloudBubble3);
            g2.fill(cloudBubble4);
            g2.fill(cloudBubble5);
            g2.fill(cloudBubble6);
        }
    }

}
