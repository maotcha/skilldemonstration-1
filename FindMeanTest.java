import static org.junit.Assert.*;
import org.junit.*;

public class FindMeanTest {

    @Test
    public void testFindMean() {
        double[] nums = new double[]{1.0, 4.0, 6.0, 8.0};
        assertEquals(4.75, FindMean.findMean(nums), 0);
    }   
}
