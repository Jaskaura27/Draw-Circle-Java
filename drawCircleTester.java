import javax.swing.JFrame;
public class drawCircleTester {
    /**
     * Creates a Jframe frame and test the class drawCircles.
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final int FRAME_WIDTH = 1000;
        final int FRAME_HEIGHT = 1000;
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawCircles c= new drawCircles();
        frame.add(c);
        frame.setVisible(true);
        


    }
}
