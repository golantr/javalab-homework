package lab.tdd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 6", "4, 24", "5, 120"})
    void compute(int i, long result) {
        assertThat(Factorial.compute(i), is(result));
    }

    @Test
    void computeFail() {
        assertThrows(ArithmeticException.class,
                () -> Factorial.compute(-1));
    }

    @Disabled
    void ignored() {

    }
}