/**
 * Created by Usuario on 31/05/2016.
 */
public class EvenOdd {

    public String checkEven(int numberToCheck) {
        if ((numberToCheck % 2) == 0)
            return "Even";
        return String.valueOf(numberToCheck);

    }

    public boolean checkPrime(int numberToCheck) {
        for (int x = 2; x < numberToCheck; x++) {
            if ((numberToCheck % x) == 0) {
                return false;
            }
        }
        return true;
    }
}
