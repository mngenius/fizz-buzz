import com.mngen.service.FizzBuzzService;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnSameValueForNormalNumbers() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        Assert.assertEquals("0", fizzBuzzService.processNumber(0));
        Assert.assertEquals("1", fizzBuzzService.processNumber(1));
        Assert.assertEquals("2", fizzBuzzService.processNumber(2));
    }

    @Test
    public void shouldReturnFizzForMultipleOfThree() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        Assert.assertEquals("fizz", fizzBuzzService.processNumber(3));
    }

    @Test
    public void shouldReturnBuzzForMultipleOfFive() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        Assert.assertEquals("buzz", fizzBuzzService.processNumber(5));
    }

    @Test
    public void shouldReturnFizzBuzzForMultipleOfBothThreeAndFive() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        Assert.assertEquals("fizzBuzz", fizzBuzzService.processNumber(15));
    }

}
