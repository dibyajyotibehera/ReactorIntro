package reactorIntro;

import org.testng.annotations.Test;
import reactorIntro.reactorIntro.utils.*;

/**
 * Created by dibyab on 22/11/18.
 */

public class FibonacciSeriesTest {
    @Test
    // generate a stream of even factorials
    public void printEvenFibonacci() throws Exception {
        //filter
//        Flux<Long> evenFibStream = new FibonacciSeries()
//                .getFibonacciGenerator()

    }

    @Test
    public void printFibonacciLessThan20() throws Exception {
        // when , filterWhen


    }

    // take operator ,takelast

    @Test
    public void printFirst10Fibonacci() throws Exception {
        //take


    }

    @Test
    public void printLats10Fibonacci() throws Exception {
        //takelast


    }

    //Skip(count),SkipUntil(Boolean Predicate)

    @Test
    public void skipFist10fibonacci() throws Exception {

    }

    @Test
    public void skipFibonacciUnTill21() throws Exception {

    }

    // map test
    // skip one , take 10 , map to roman Number

    @Test
    public void printRomanforFibonnacciSeries() throws Exception {
       // RomanNumber romanNumber = new RomanNumber();

    }

    @Test
    public void printFactorsForEachFibonacciAsStreamOfNumbers() throws Exception {
        Factorization factorization = new Factorization();

    }
}