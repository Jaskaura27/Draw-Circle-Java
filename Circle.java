import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Represent the object Circle.
 */
public class Circle {
    /**
     * Declearing private variables int radius, Poin centre and Color color.
     */
    private int radius;
    private Point centre;
    private Color color =Color.BLUE;


    /** 
     * Constructs a object Circle and intialize Point centre and int radius.
     * @param p
     * @param radius
     */
    public Circle(Point p, int radius){
        //Constructs the object Circle
        this.radius=radius;
        centre=p;
    }

   /**
    * Draw a Circle with Point centre as its centre and Radius radius.
    * @param g2
    */
   public void draw(Graphics2D g2){
        //takes g2 and color as parameters and draws Oval shape and fills it with black color
       g2.setColor(color);
       g2.drawOval((int)(centre.getX()-radius), (int)(centre.getY()-radius), 2*radius, 2*radius);
   }
}