import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA380800);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(525, plane.getCapacityFromEnum());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(277000, plane.getTotalWeightFromEnum());
    }

}
