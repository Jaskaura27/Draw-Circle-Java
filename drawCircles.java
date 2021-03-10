import java.util.ArrayList;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.event.MouseMotionListener;
import java.awt.BasicStroke;


public class drawCircles extends JComponent implements MouseListener ,MouseMotionListener{
    private int clickCount=1;
    private ArrayList<Circle> list = new ArrayList<Circle>();
    private Point point;
    private Point CurrentPoint;

    /**
     * Create the object drawCircles and add MouseListner and MouseMotionListner to it.
     */
    public drawCircles(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    /**
     * Paint the frame with Circle in ArrayList list and if the number of clicks is Odd draw a dashed line 
     * between the position of last click and the current position of mouse and draw a circle.
     */
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        for(Circle e:list){
            e.draw(g2);
        }

        if(clickCount%2==0 && clickCount!=0){
            int r = getRadius(CurrentPoint.getX(), CurrentPoint.getY());
            g2.setColor(Color.RED);
            g2.drawOval(point.getX()-r, point.getY()-r, 2*r, 2*r);
            BasicStroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{6}, 0);
            g2.setStroke(dashed);
            g2.drawLine(point.getX(), point.getY(), CurrentPoint.getX(), CurrentPoint.getY());
        }
    }

    /**
     * Invoked when the mouse button has been clicked (pressed and released) on a component.
     */
    public void mouseClicked(MouseEvent event) {
        if (clickCount%2==1){
            point =new Point(event.getX(), event.getY());
            clickCount++;
        }
        else if(clickCount%2==0 ){
            int radius=getRadius(event.getX(),event.getY());
            list.add(new Circle(point, radius));
            clickCount++;
            repaint();
        }
            
    }

    /**
     * Invoked when Mouse is moved.
     */   
    public void mouseMoved(MouseEvent event){
        if(clickCount%2==0){
            CurrentPoint=new Point(event.getX(), event.getY());
        }
        repaint();
    }  
            

    /**
     * Do-nothing methods
     */
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event) {}
    public void mouseEntered(MouseEvent event) {}
    public void mouseExited(MouseEvent event) {}
    public void mouseDragged(MouseEvent event){}

    /**
     * 
     * @param x
     * @param y
     * @return the Distance between the Coordinates x, y and Point point.
     */
    public int getRadius(int x,int y){
        return (int) Math.sqrt( Math.pow(point.getX()-x, 2)+Math.pow(point.getY()-y, 2) );
    }



}
