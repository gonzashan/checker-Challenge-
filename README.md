# Repte #2 - Welcome to Lambdas ƛ
<img align="left" alt="Java" width="70px" src="https://forkpoint.com/wp-content/uploads/java-logo-transparent.png" />

This exercise will be based on developing 3 lambda functions that exist within a class called MyLambda and that allows us to find the following:

    isOdd: the lambda expression must return true if the number is even and false if the number is odd. 
    'Be aware, because is Upside Down.

    isPrime: the lambda expression must return true if the number is prime and false if it is not.

    isPalindrome: the lambda expression must return true if the number is palindrome and false if the number is not.

    checker: method of the class that allows us to use (isOdd, isPalindrome, isPrime) when passing an array of numbers 
    to review and must return a list of numbers and whether it is Even or Odd, Primo and / or Palindrome.
    
    
  # Data entry

     Each function has as input the number to be checked and returns only true or false.

     In case the past input is <= 0 it must always return false.

     checker input | output:

## Explanation of methods and functionalities

### public void checker(int[] numbers) {...

    This method receives an array of integer values on which to evaluate them for the different functions described above.
    
    To fit the requested output format, we need to create a list with the selected value and its results. 
    LinkedHashMap is a Java collections that let us keep the same order as we receive the data and build the output format.
    A forEach will iterate through the array. This will create another collection as LinkedHashMap<String, Object> to keep
    name of method and its results. Taking care if number is 0, keeping into the map the message "NOT A POSSIBLE OPTION".
    
### interface InterfaceForBooleans {...

For walk through the methods, first of all we are going to use a functional interface to get the boolean returns of any 
action to do over the number selected. It's recommended that all functional interfaces have an informative 
@FunctionalInterface annotation. This clearly communicates the purpose of the interface, and also allows a compiler 
to generate an error if the annotated interface does not satisfy the conditions.
