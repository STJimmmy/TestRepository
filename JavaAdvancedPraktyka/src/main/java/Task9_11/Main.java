package Task9_11;

public class Main {
    public static void main(String[] args) {

        Circle circle_9 = new Circle(new Point2D(2,5), new Point2D(7,10));
        System.out.println(circle_9.getRadius());
        System.out.println(circle_9.getPerimeter());
        System.out.println(circle_9.getArea());

        circle_9.move(new MoveDirection(-2,3.5));
        System.out.println(circle_9.getRadius());
        System.out.println(circle_9.getPerimeter());
        System.out.println(circle_9.getArea());

        circle_9.resize(2);
        System.out.println(circle_9.getRadius());

    }
}
