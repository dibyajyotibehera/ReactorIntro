package reactorIntro.reactorIntro.utils;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by dibyab on 22/11/18.
 */
public class Factorization {
    public Collection<Integer> findfactor(int number) {
        ArrayList<Integer> factors= new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            } }
        return factors;
    }
}
