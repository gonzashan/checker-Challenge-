package my_lambda;

import java.util.ArrayList;

public class MyLambda {

    // Create a class inside with variables to get values from the method checker results.
    // The new instance has a constructor with all variables.
    class Result {

        private int number;
        private boolean odd, prime, palindrome;

        public Result(int number, boolean odd, boolean prime, boolean palindrome) {
            this.number = number;
            this.odd = odd;
            this.prime = prime;
            this.palindrome = palindrome;
        }

        @Override
        public String toString() {
            if (number == 0) {
                return "\n{\n" +
                        "\tnumber:" + number + ",\n" +
                        "\tNOT A POSSIBLE OPTION\n}";
            } else {
                return  "\n{\n\tnumber:" + number  +
                        ",\n\tisOdd:" + odd +
                        ",\n\tisPrime:" + prime +
                        ",\n\tisPalindrome:" + palindrome +
                        "\n}";
            }
        }
    }

    //
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


    public ArrayList<Result> checker(int[] numbers) {

        // Get results inside an ArrayList
        ArrayList<Result> output = new ArrayList<>();

        for (int number : numbers) {

            if (number == 0) {
                output.add(new Result (number, false,false,false));

            } else {

                output.add(new Result (number, isOdd().check(number)
                        ,isPrime().check(number),isPalindrome().check(number)));
            }
        }

        // Formatting to be dead ringer as reference
        return output;
    }

}

