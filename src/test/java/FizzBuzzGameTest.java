import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzGameTest {

    FizzBuzzGame game = new FizzBuzzGame();

    @Test
    public void returnsOneWhenGameStarts() {
    String result = game.respond(1);
    assertThat(result, equalTo("1"));

    }

    @Test
    public void returnsFizzInsteadOfThree(){
        String result= game.respond(3);
        assertThat(result, equalTo("Fizz"));
    }

    @Test
    public void returnsBuzzInsteadOfFive(){
        String result= game.respond(5);
        assertThat(result, equalTo("Buzz"));
    }

    @Test
    public void returnsFizzBuzzInsteadOf15(){
        String result= game.respond(15);
        assertThat(result, equalTo("FizzBuzz"));
    }

    @Test
    public void returnsFizzInsteadOf21(){
        String result= game.respond(21);
        assertThat(result, equalTo("Fizz"));
    }

    @Test
    public void returnsFizzInsteadOf50(){
        String result= game.respond(50);
        assertThat(result, equalTo("Buzz"));
    }

    @Test
    public void returnsAnyNumberThatIsNotFizzOrBuzz(){
        String result= game.respond(82);
        assertThat(result, equalTo("82"));
    }

    @Test
    public void returnsNullIfResultIsBiggerThan100(){
        String result= game.respond(101);
        assertThat(result, equalTo(null));
    }


}
