import java.util.LinkedList;
import java.util.List;

public class Car {
    public String name;
    public int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {

Car dodge = new Car("Dodge", 200);
Car ferrari = new Car("Ferrari", 220);
Car fiat = new Car("Fiat", 150);

        List<Car> weirdListType= new LinkedList<>();
weirdListType.add(dodge);
weirdListType.add(ferrari);
weirdListType.add(fiat);

        System.out.println(weirdListType.get(0).name);

    }
}
