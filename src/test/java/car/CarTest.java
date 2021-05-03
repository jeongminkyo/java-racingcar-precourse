package car;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	@DisplayName("차의 이름은 5자 이하만 가능하다.")
	void carName() {
		assertThatThrownBy(()->{
			Car car = new Car("여섯글자이름");
		}).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("차의 이름은 5자가 넘어갈 수 없습니다.");
	}

	@Test
	@DisplayName("값이 4이상일경우 전진한다.")
	void getStatusGo() {
		Car car = new Car("test");
		assertThat(car.getStatus(4)).isEqualTo(DriveStatus.GO);
	}

	@Test
	@DisplayName("값이 3이하의 값이면 멈춘다.")
	void getStatusStop() {
		Car car = new Car("test");
		assertThat(car.getStatus(3)).isEqualTo(DriveStatus.STOP);
	}

}
