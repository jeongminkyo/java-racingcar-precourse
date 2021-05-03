package game;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import car.Car;

class GameCountTest {

	@Test
	@DisplayName("gameCount는 숫자가 아닌 경우, exception이 발생한다.")
	void pareGameCount() {
		assertThatThrownBy(()->{
			GameCount gameCount = new GameCount("asdf");
		}).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("회수는 숫자만 입력 가능합니다.");
	}
}