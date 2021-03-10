public class Point {
    /**
     * Represents Coordinate X.
     */
    private int x;

    /**
     * Represents Coordinate Y.
     */
    private int y;

    /**
     * Constructs and initializes a point at the specified (x,y) location in the coordinate space.
     * @param x
     * @param y
     */
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    /**
     * 
     * @return X coordinate.
     */
    public int getX(){
        return x;
    }

    /**
     * 
     * @return Y coordinate.
     */
    public int getY(){
        return y;
    }

}