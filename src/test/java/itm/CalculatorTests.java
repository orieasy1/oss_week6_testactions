package itm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import itm.oss.Calculator;

@DisplayName("Calculator Tests for OSS Class")
public class CalculatorTests {
	//first make instance of calculator class to use its methods in test cases
	private final Calculator calculator = new Calculator();

	//test case for add method
	@Test
	@DisplayName("Test for add method")
	void add() {
		assertEquals(10, calculator.add(5, 5), "Expected value is 10 in add function");
	}

    @Test
    @DisplayName("Testing function isPrime")
    void isFivePrime() {
        assertTrue(calculator.isPrime(5),"5 is Prime");
    }

    @Test
    @DisplayName("Testing function isPrime")
    void isFourPrime() {
        assertFalse(calculator.isPrime(4),"4 is not Prime");
    }



}