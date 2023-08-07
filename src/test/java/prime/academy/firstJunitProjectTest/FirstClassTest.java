package prime.academy.firstJunitProjectTest;

 

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import prime.academy.firstJunitProject.FirstClass;

public class FirstClassTest {
	private FirstClass fc1;
	@BeforeEach
    public void setUp() {
        System.out.println("Setting up Calculator instance for each test");
        fc1 = new FirstClass();
         
    }
	@AfterEach
    public void tearDown() {
        System.out.println("Clear Calculator instance for each test");
        fc1 = new FirstClass();
         
    }
	@AfterAll
    public static void tearDownAll() {
        System.out.println("Cleaning up CalculatorTest class");
    }
	@Test
	public void calaculationEquationTest() {
		System.out.println("test method ");
		int result= fc1.calculateEquation(10,5);
		Assertions.assertEquals(55, result );
	}
}
