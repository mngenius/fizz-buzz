import com.mngen.service.DefaultFizzBuzzService;
import com.mngen.service.FizzBuzzService;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzzService fizzBuzzService = new DefaultFizzBuzzService();

    @Test
    public void shouldReturnSameValueForNormalNumbers() {

        Assert.assertEquals("0", fizzBuzzService.processNumber(0));
        Assert.assertEquals("1", fizzBuzzService.processNumber(1));
        Assert.assertEquals("2", fizzBuzzService.processNumber(2));
    }

    @Test
    public void shouldReturnFizzForMultipleOfThree() {
        Assert.assertEquals("fizz", fizzBuzzService.processNumber(3));
    }

    @Test
    public void shouldReturnBuzzForMultipleOfFive() {
        Assert.assertEquals("buzz", fizzBuzzService.processNumber(5));
    }

    @Test
    public void shouldReturnFizzBuzzForMultipleOfBothThreeAndFive() {
        Assert.assertEquals("fizzBuzz", fizzBuzzService.processNumber(15));
    }

}
