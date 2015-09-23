import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D paintbrush = (Graphics2D) g;
        int x = getWidth()/2;
        int y = getHeight()/2;
        Target target = new Target(x,y);
        target.draw(paintbrush);
    }
}