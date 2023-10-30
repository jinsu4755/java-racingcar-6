package racingcar.domain;

import java.util.List;
import java.util.function.Consumer;

public interface Race<T>{
    List<String> race(int repeat, Consumer<T> consumer);
}
