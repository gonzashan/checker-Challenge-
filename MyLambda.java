package my_lambda;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Stream;

public class MyLambda {

    @FunctionalInterface
    interface InterfaceForBooleans {
        boolean check(int a);
    }
    // Function to check if number is odd but 'Upside Down' ->
    // for further information, watch Strangers Things, the tv show.
    public static InterfaceForBooleans isOdd() {
        return (a) -> {
            // == 0 is 'Upside Down'
            return (a % 2 == 0);
        };
    }
    // Function to check if number is prime
    public static InterfaceForBooleans isPrime() {
        return (a) -> {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    // Function to check if number is palindrome comparing the number and its reversed.
    public static InterfaceForBooleans isPalindrome() {

        return (a) -> {
            int reverse = 0;
            int elementTaken;
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

        // LinkedHashMap has been chosen to guarantee the right order of insert
        // from the array numbers.
        List<LinkedHashMap<String, Object>> output = new ArrayList<>();

        for (int number : numbers) {
            LinkedHashMap<String, Object> insert = new LinkedHashMap<String, Object>();

            if(number == 0){
                insert.put("input:", number);
                insert.put("NOT A POSSIBLE OPTION", "");

            } else {
                insert.put("input:", number);
                insert.put("isOdd:", isOdd().check(number));
                insert.put("isPrime:", isPrime().check(number));
                insert.put("isPalindrome:", isPalindrome().check(number));
            }
            output.add(insert);
        }

        // Formatting to be dead ringer as reference
        String formattedString = output.toString()
                .replace("=", "")
                .replace(", ", ", \n")
                .replace("{", "{\n")
                .replace("}", "}\n")
                .trim();
        Stream<Object> newOutput = output.stream().map(a -> a.entrySet() + "\n");
        System.out.println(formattedString);
    }

}

