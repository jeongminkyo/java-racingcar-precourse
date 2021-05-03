package car;

import java.util.List;

public class Cars {

	private List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public void drive() {
		for (Car car : cars) {
			car.drive();
			car.printCar();
		}
	}
}
