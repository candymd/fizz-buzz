
public class FizzBuzzGame {

    public String respond(int result) {

         if (result % 3 == 0 && result % 5 == 0) {
            return "FizzBuzz";
        }

        else if (result % 3 == 0){
            return "Fizz";
        }

        else if (result % 5 == 0){
            return "Buzz";
        }

         else if (result > 100){
            return null;
         }

        else {
            return String.valueOf(result);
        }

    }

}
