package SplitTemporaryVariable;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class SplitTemporaryVariableTest {

    @Test
    public void calculateDistanceWithoutSecondaryTime() {

        SplitTemporaryVariable s = new SplitTemporaryVariable(10, 2, 10, 12);

        assertEquals(BigDecimal.valueOf(250.0), BigDecimal.valueOf(s.getDistanceTravelled(10)));
    }

    @Test
    public void calculateDistanceWithSecondaryTime() {
        SplitTemporaryVariable s = new SplitTemporaryVariable(10, 2, 5, 12);

        assertEquals(BigDecimal.valueOf(325.0), BigDecimal.valueOf(s.getDistanceTravelled(10)));
    }

    @Test
    public void calculateDistanceWithSecondaryTimeDifferentFromPrimaryTime() {
        SplitTemporaryVariable s = new SplitTemporaryVariable(7, 2, 3, 4);

        assertEquals(BigDecimal.valueOf(137.0), BigDecimal.valueOf(s.getDistanceTravelled(8)));
    }

}