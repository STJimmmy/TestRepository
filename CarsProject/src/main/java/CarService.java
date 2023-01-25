import java.util.List;

public class CarService {

    private final List<Car> cars;

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public void addCars(Car car) {
        cars.add(car);
    }

    public int getCheapestCar(List<Car> cars) {
        int cheapestCar = 0;
        for (Car car : cars) {
            if (car.getPrice() < cheapestCar) {
                cheapestCar = car.getPrice();
            }
        }
        return cheapestCar;
    }
}
