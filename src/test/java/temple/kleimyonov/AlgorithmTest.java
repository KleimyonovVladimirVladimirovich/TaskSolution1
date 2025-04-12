package temple.kleimyonov;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    public static Access access;

    @Timeout(1000)
    @BeforeAll //
    static void setUp() {System.out.println("Testing start...");}
    @AfterAll
    @Timeout(2000)
    static void setDown() {System.out.println("Testing end...");}


    @ParameterizedTest
    @Timeout(1000)
    @CsvSource({
            "0.0,0.0, 0.0",
            "1.0,1.0, 2.7182818011463845",
            "1.0,2.0, 3.7182818011463845",
            "-1.0,1.0, -0.7182818011463844"
    })
    void series(double temp, double sum, double expected) {
        setUp();
        System.out.println(Access.INITIAL);
        Algorithm algorithm = new Algorithm();
        double result = algorithm.series(temp, sum);
        Assertions.assertEquals(expected, result);
        System.out.println(Access.PASSED);
        setDown();
    }

}
