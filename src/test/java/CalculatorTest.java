import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple addition should work")
    void testAddition() {
        assertEquals(8, calculator.addition(3, 5), "Regular addition should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(3, calculator.addition(0, 3), "Addition with zero should be number itself");
        assertEquals(3, calculator.addition(3, 0), "Addition with zero should be number itself");
    }
}