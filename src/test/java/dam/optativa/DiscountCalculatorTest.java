package dam.optativa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculatorTest {
    @Test
    void testCalculo() {
        DiscountCalculator desc = new DiscountCalculator();
        
        assertEquals(80.0, desc.calculate(100.0, true));
        assertEquals(95.0, desc.calculate(100.0, false));
    }
}