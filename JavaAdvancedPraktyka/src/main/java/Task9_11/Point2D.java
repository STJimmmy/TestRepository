package Task9_11;

public class Point2D implements Movable{
    private double x;
    private double y;


    @Override
    public void move(MoveDirection moveDirection) {
        setX(getX()+moveDirection.getX());
        setY(getY()+moveDirection.getY());
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
