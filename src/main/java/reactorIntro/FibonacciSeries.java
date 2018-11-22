package reactorIntro;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuples;

/**
 * Created by dibyab on 22/11/18.
 */
public class FibonacciSeries {
    public Flux<Long> getFibonacciGenerator() {
        Flux<Long> fibonacciGenerator = Flux.generate(() -> Tuples.<Long,
                Long>of(0L, 1L),(state, sink) -> {
            if (state.getT1() < 0)
                sink.complete();
            else
                sink.next(state.getT1());
            return Tuples.of(state.getT2(), state.getT1() + state.getT2());
        });

        return fibonacciGenerator;
    }


}

