package car;

import java.util.Objects;

import game.ExceptionMessage;

public class Car implements Comparable<Car> {

	public static final int MAX_CAR_NAME_LENGTH = 5;
	public static final int MAX_GO_NUMBER = 4;
	public static final String DISTANCE_CHAR = "-";

	private final String name;
	private int driveDistance;

	public Car(String name) {
		checkCarNameLength(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void drive() {
		RandNum randNum = new RandNum();

		if(getStatus(randNum.getNumber()).isGo()) {
			incrDriveDistance();
		}
	}

	public void printCar() {
		System.out.println(name + " : " + getDistanceChar());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Car car = (Car)o;
		return driveDistance == car.driveDistance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, driveDistance);
	}

	private String getDistanceChar() {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i< driveDistance; i++) {
			result.append(DISTANCE_CHAR);
		}

		return result.toString();
	}

	private void checkCarNameLength(String name) {
		if(name.length() > MAX_CAR_NAME_LENGTH) {
			throw new IllegalArgumentException(ExceptionMessage.CAR_NAME_LIMIT);
		}
	}

	public DriveStatus getStatus(int randNum) {
		if(randNum >= MAX_GO_NUMBER) {
			return DriveStatus.GO;
		}

		return DriveStatus.STOP;
	}

	private void incrDriveDistance() {
		this.driveDistance += 1;
	}

	@Override
	public int compareTo(Car target) {
		return this.driveDistance <= target.driveDistance ? 1 : - 1;
	}
}

