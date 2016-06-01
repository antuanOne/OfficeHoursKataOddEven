/**
 * Created by Usuario on 31/05/2016.
 */
public class EvenOdd {

    public String checkEven(int numberToCheck) {
        if ((numberToCheck % 2) == 0)
            return "Even";
        return String.valueOf(numberToCheck);

    }
}
