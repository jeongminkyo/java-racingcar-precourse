package game;

public class GameMessage {
	public static final String CAR_RACE_START = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
	public static final String TRY_RACING_COUNT = "시도할 회수는 몇 회인가요?";
	public static final String RACING_RESULT = "실행 결과";
	public static final String RACING_MSG = "가 최종 우승했습니다.";

	public static void print(String msg) {
		System.out.println(msg);
	}
}
