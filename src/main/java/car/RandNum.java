package car;

import java.util.concurrent.ThreadLocalRandom;

public class RandNum {

	private static final int MIN_NUMBER = 0;
	private static final int MAX_NUMBER = 9;
	private final int number;

	public RandNum() {
		this.number = generateRandNum();
	}

	public int getNumber() {
		return number;
	}

	private int generateRandNum() {
		return ThreadLocalRandom.current().nextInt(MIN_NUMBER, MAX_NUMBER);
	}
}
