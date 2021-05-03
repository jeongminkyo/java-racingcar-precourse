package car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private List<Car> cars;
	private CarRank carRank;

	public Cars(List<Car> cars) {
		this.cars = cars;
		this.carRank = new CarRank();
	}

	public void drive() {
		for (Car car : cars) {
			car.drive();
			car.printCar();
		}
	}

	public String getWinner() {
		List<String> result = new ArrayList<>();
		addCarToRank();
		for (Car car : carRank.getWinner()) {
			result.add(car.getName());
		}
		return String.join(", ", result);
	}

	private void addCarToRank() {
		for (Car car : cars) {
			carRank.addCar(car);
		}
	}

}
