package car;

public class Car {

	public static final int MAX_CAR_NAME_LENGTH = 5;

	private final String name;

	public Car(String name) {
		checkCarNameLength(name);
		this.name = name;
	}

	private void checkCarNameLength(String name) {
		if(name.length() > MAX_CAR_NAME_LENGTH) {
			throw new IllegalArgumentException("차의 이름은 5자가 넘어갈 수 없습니다.");
		}
	}

}

