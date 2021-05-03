package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import car.Car;
import car.Cars;

public class RacingGame {

	private Scanner scanner;
	private Cars cars;
	private GameCount gameCount;

	public RacingGame() {
		this.scanner = new Scanner(System.in);
	}

	public void runGame() {
		carInput();
		gameCountInput();
		play();
		printWinner();
	}

	private void carInput() {
		GameMessage.print(GameMessage.CAR_RACE_START);
		String carString = scanner.next();
		setCars(parseCar(carString));
	}

	private void gameCountInput() {
		GameMessage.print(GameMessage.TRY_RACING_COUNT);
		String gameCount = scanner.next();
		setGameCount(gameCount);
	}

	private List<Car> parseCar(String carString) {
		List<Car> cars = new ArrayList<>();
		String[] strCars = carString.split(",");

		for (String strCar : strCars) {
			Car car = new Car(strCar);
			cars.add(car);
		}

		return  cars;
	}

	private void play() {
		GameMessage.print(GameMessage.RACING_RESULT);
		for (int i =0; i < gameCount.getGameCount(); i ++) {
			cars.drive();
		}
	}

	private void printWinner() {
		System.out.println(cars.getWinner() + GameMessage.RACING_MSG);
	}

	private void setCars(List<Car> cars) {
		this.cars = new Cars(cars);
	}

	private void setGameCount(String input) {
		this.gameCount = new GameCount(input);
	}
}
