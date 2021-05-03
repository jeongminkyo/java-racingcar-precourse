package car;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarRankTest {

	private CarRank carRank;
	private Car winner;

	@BeforeEach
	void setUp() throws NoSuchFieldException, IllegalAccessException {
		carRank = new CarRank();
		winner = new Car("test1");
		Field field = winner.getClass().getDeclaredField("driveDistance");
		field.setAccessible(true);
		field.set(winner, 5);

		Car car2 = new Car("test2");
		field = car2.getClass().getDeclaredField("driveDistance");
		field.setAccessible(true);
		field.set(car2, 3);

		carRank.addCar(winner);
		carRank.addCar(car2);
	}
	@Test
	@DisplayName("운전거리가 가장 먼 car가 반환된다.")
	void getWinner() {
		assertThat(carRank.getWinner().get(0).getName()).isEqualTo(winner.getName());
	}

	@Test
	@DisplayName("운전거리가 가장 먼 car 중복인 경우, 두 값 모두 반환된다.")
	void getWinnerDuplicate() throws NoSuchFieldException, IllegalAccessException {
		Car car = new Car("test3");
		Field field = car.getClass().getDeclaredField("driveDistance");
		field.setAccessible(true);
		field.set(car, 5);
		carRank.addCar(car);

		assertThat(carRank.getWinner()).extracting("name").contains(
			car.getName(),
			winner.getName()
		);
	}

}