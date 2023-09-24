package test_pack.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test_pack.src.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void testAdd() {
        double expectedResult = 25.0;

        double result = calculator.add(12.1, 12.9);
        assertEquals(expectedResult, result, "Error");
    }

}