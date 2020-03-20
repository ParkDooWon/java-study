package techcourse.fp.mission;

import java.util.List;
import java.util.function.Predicate;

public class Calculator {
    public static int sumAll(List<Integer> numbers, Predicate<Integer> predicate) {
        //TODO: List에 담긴 값 중 3보다 큰 수만을 더해야 한다.
        return numbers.stream()
            .filter(predicate)
            .reduce(0, Integer::sum);
    }
}
