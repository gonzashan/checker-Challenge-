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

     input: [0,5,898,34]
     checker output:[
          {
            input:0,
            "NOT A POSSIBLE OPTION",
           },
           {
            input:5,
            isOdd:false,
            isPrime:true,
            isPalindrome:true,
           },
           {
            input:898,
            isOdd:true,
            isPrime:false,
            isPalindrome:true,
           },
           {
            input:34,
            isOdd:true,
            isPrime:false,
            isPalindrome:false,
           }]

## Explanation of methods and functionalities

### class Results  (optimizing memory resources)

    Using this simple class, with the same variables as challenge request and its constructor, will 
    get the results from methods. 
  

### public void checker(int[] numbers) {...

   This method receives an array of integer values on which to evaluate them for the different functions described above.
    
   To storing the requested output, we need to create an ArrayList. A 'forEach' will iterate through the array. 
   It will creates a new objects from the class Results, declared on top, to keep the results from methods 
   isOdd, isPrime and isPalindrome. 
   
   Taking care if number is 0, we initialize a new object for class Results, keeping the number zero and passing 'false' the 
   rest of elements in the constructor. Overriding toString from class Results we'll get formatting requested and with 
   an 'if' condition the message "NOT A POSSIBLE OPTION" will be possible.
    
### interface InterfaceForBooleans {...

For walk through the methods, first of all we are going to use a functional interface to get an int value and returns a boolean,
depending on what action has been called. It's recommended that all functional interfaces have an informative 
@FunctionalInterface annotation. This clearly communicates the purpose of the interface, and also allows a compiler 
to generate an error if the annotated interface does not satisfy the conditions.


### How is it works? 

Simple. From the Main class create a new object of class MyLambda, and passing the integers array numbers invoking the method 
checker() as below:
    
        int[] numbers = new int[]{4,0,898,34};
        MyLambda ob = new MyLambda();
        ob.checker(numbers);
        
        
 * I do apologize for the inconvenience the previous incorrect grammar may have caused and my delay.
 
 Cheers, Gonzalo SM
