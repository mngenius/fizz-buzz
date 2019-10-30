import com.mngen.service.FizzBuzzExtService;
import com.mngen.service.FizzBuzzService;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzExtendedTest {

    private FizzBuzzService fizzBuzzExtService = new FizzBuzzExtService();

    @Test
    public void shouldReturnSameValueForNormalNumbers() {
        Assert.assertEquals("0", fizzBuzzExtService.processNumber(0));
        Assert.assertEquals("1", fizzBuzzExtService.processNumber(1));
        Assert.assertEquals("2", fizzBuzzExtService.processNumber(2));
    }

    @Test
    public void shouldReturnFizzForMultipleOfThree() {
        Assert.assertEquals("fizz", fizzBuzzExtService.processNumber(3));
        Assert.assertEquals("fizz", fizzBuzzExtService.processNumber(13));
    }

    @Test
    public void shouldReturnBuzzForMultipleOfFive() {
        Assert.assertEquals("buzz", fizzBuzzExtService.processNumber(5));
        Assert.assertEquals("buzz", fizzBuzzExtService.processNumber(55));
    }

    @Test
    public void shouldReturnFizzBuzzForMultipleOfBothThreeAndFive() {
        Assert.assertEquals("fizzBuzz", fizzBuzzExtService.processNumber(135));
        Assert.assertEquals("fizzBuzz", fizzBuzzExtService.processNumber(1351));
    }
}
