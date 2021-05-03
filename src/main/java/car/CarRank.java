package car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class CarRank {
	private PriorityQueue<Car> rank;

	public CarRank() {
		this.rank = new PriorityQueue<>();
	}

	public void addCar(Car car) {
		rank.add(car);
	}

	public List<Car> getWinner() {
		Car winner = rank.poll();
		Car compare = rank.poll();

		if(winner == null) {
			return Collections.emptyList();
		}

		List<Car> result = new ArrayList<>();
		result.add(winner);

		while(winner.equals(compare)) {
			result.add(compare);
			compare = rank.poll();
		}

		return result;
	}

}
