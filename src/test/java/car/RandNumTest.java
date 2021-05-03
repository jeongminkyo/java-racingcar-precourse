package car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandNumTest {

	@Test
	@DisplayName("랜덤 숫자는 0에서 9사이의 값을 갖는다.")
	void generateRandNum() {
		RandNum randNum = new RandNum();

		assertTrue(randNum.getNumber() >= 0);
		assertTrue(randNum.getNumber() < 10);
	}
}
