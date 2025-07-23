import lesson7.Functions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTest {

    @Test
    void testFactorial() {
        assertEquals(Functions.factorial(4), 24);
    }

    @Test
    void testCalculateTriangleArea() {
        assertEquals(Functions.calculateTriangleArea(3, 3, 3, 1), 3.9);
    }

    @Test
    void testArithmeticOperations() {
        assertEquals(Functions.arithmeticOperations(5.2, 10, '/'), 0.52);
    }

    @Test
    void testCompareTwoNumbers() {
        assertEquals(Functions.compareTwoNumbers(2, 2), true);
    }
}
