package Task9_11;



public class Circle implements Movable, Resizeable {


    private Point2D center;
    private Point2D point;
    @Override
    public void resize(double resizeFactor) {
        this.point.setX(this.center.getX()+(this.point.getX()-this.center.getX())*resizeFactor);
        this.point.setY(this.center.getY()+(this.point.getY()-this.center.getY())*resizeFactor);
    }
    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    @Override
    public void move(MoveDirection moveDirection) {

        center.move(moveDirection);
        point.move(moveDirection);}
    //radius
    public double getRadius(){
        //odleglosc miedzy dwoma punktami na plaszczyznie jest to pierwiastek z sumy kwadratow roznic wspolrzednych
        return Math.sqrt(Math.pow(point.getX()-center.getX(), 2.0)+Math.pow(point.getY()-center.getY(), 2.0));
    }

    public double getPerimeter(){
        return 2*Math.PI*this.getRadius(); //O=2*PI*R
    }

    public double getArea(){
        return Math.PI*Math.pow(this.getRadius(), 2.0); //A=PI*R^2
    }
}
