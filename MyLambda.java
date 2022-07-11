package my_lambda;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyLambda {

    @FunctionalInterface
    interface PerformOperation {
        boolean check(int a);
    }
    // Function to check if number is odd but 'Upside Down' ->
    // for further information, watch Strangers Things, the tv show.
    public static PerformOperation isOdd() {
        return (a) -> {
            // == 0 is 'Upside Down'
            return (a % 2 == 0);
        };
    }
    // Function to check if number is prime
    public static PerformOperation isPrime() {
        return (a) -> {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    // Function to check if number is palindrome comparing the number and its reversed.
    public static PerformOperation isPalindrome() {

        return (a) -> {
            int reverse = 0;
            int elementTaken = 0;
            int number = a;

            while (number != 0) {
                elementTaken = number % 10;
                reverse = reverse * 10 + elementTaken;
                number /= 10;
            }
            return (reverse == a);
        };
    }


    public void checker(int[] numbers) {

        // LinkedHashMap has been chosen to guarantee the right order of insert.
        List<LinkedHashMap<String, Object>> output = new ArrayList<>();

        for (int number : numbers) {
            LinkedHashMap<String, Object> insert = new LinkedHashMap<String, Object>();
            insert.put("input:", number);
            insert.put("isOdd:", isOdd().check(number));
            insert.put("isPrime:",isPrime().check(number));
            insert.put("isPalindrome:",isPalindrome().check(number));
            output.add(insert);
        }
        String formattedString = output.toString()
                .replace("=", "")  //remove the equals symbol
                .trim();

        System.out.println(formattedString);
    }

}

