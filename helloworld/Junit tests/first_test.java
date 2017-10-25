import org.junit.Assert;
import org.junit.Test;

public class first_test {
    @Test
    public void firstTest() {
        HelloWorld Will = new HelloWorld();
        Assert.assertNotNull("exists", Will);
        Assert.assertTrue(true);
    }
}
