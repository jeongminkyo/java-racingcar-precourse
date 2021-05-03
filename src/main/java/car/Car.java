package car;

public class Car {

	public static final int MAX_CAR_NAME_LENGTH = 5;
	public static final int MAX_GO_NUMBER = 4;
	public static final String DISTANCE_CHAR = "-";

	private final String name;
	private int driveDistance;

	public Car(String name) {
		checkCarNameLength(name);
		this.name = name;
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

	private String getDistanceChar() {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i< driveDistance; i++) {
			result.append(DISTANCE_CHAR);
		}

		return result.toString();
	}

	private void checkCarNameLength(String name) {
		if(name.length() > MAX_CAR_NAME_LENGTH) {
			throw new IllegalArgumentException("차의 이름은 5자가 넘어갈 수 없습니다.");
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
}

