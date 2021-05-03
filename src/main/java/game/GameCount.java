package game;

public class GameCount {

	private int gameCount;

	public static void checkGameCount(String input) {
		String regex = "[0-9]+";
		if (!input.matches(regex)) {
			throw new IllegalArgumentException(ExceptionMessage.COUNT_INVALID);
		}
	}

	public GameCount(String input) {
		checkGameCount(input);
		this.gameCount = Integer.parseInt(input);
	}

	public int getGameCount() {
		return gameCount;
	}
}
