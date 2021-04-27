// Write a program that will take an integer and print Fizz if the number is divisible by 3, Buzz if the number is divisible by 5, FizzBuzz if the number is divisible by 3 and 5, and the number itself for all other cases.

// Objectives:
// ● Practice conditionals.
// ● Implement a classic interview algorithm.
// Tasks:
// ● Create a FizzBuzz class that implements the following logic:

public class FizzBuzz {
    public String fizzBuzzMethod(int number) {
        String response = ""; // need to declare AND instantiate
        if(number % 3 == 0) {
            response = "Fizz";
        }
        if(number % 5 == 0) {
            response = "Buzz";
        }
        if((number % 3 ==0) && (number % 5 == 0)) {
            response = "FizzBuzz";
        }
        else{
            // System.out.println(number);
        }
    return response;
    }
}
// 3 Test cases: 
// Output for 3
// Output for 5
// Output for 15
// Output for 2


// How does this translate into something useful for Java developers? Well, consider this:

// Someone visits your website, and you want to ask for their name, but only if it's their first time coming to your site. With an if statement, this is easy! Simply have a conditional statement to check, "Is this your first time visiting our website?". If the condition is true, then take them to the "Please input your name" page. If it's not their first time then let them view the website as normal because you have already asked for their name in the past.

// Two things you need to remember when dealing with conditions in programming:

// A condition always returns true or false
// As long as something has a value (Which almost everything in Java does) it can be used in a condition
// IF
// Let's say we are a basketball player. If a defender is guarding us closely, then we should pass. Our thought process can be represented this way in code.

// boolean defenderGuarding = true;
// if(defenderGuarding == true) {
//     System.out.println("Pass The Ball");
// }
// IF-ELSE
// We want to pass the ball if the defender is guarding us but what do we do if the defender isn't guarding us? If the condition is not true, we should write a block of code that will execute so that we will always have something to do whether the defender is guarding us or not.

// boolean defenderGuarding = true;
// if(defenderGuarding == true) {
//     System.out.println("Pass The Ball");
// } else {
//     System.out.println("Shoot The Ball");
// }
// IF-ELSE IF-ELSE
// We shouldn't always shoot the ball if the defender isn't guarding us. What if we are far away from the basket? In that case, instead of shooting the ball we should dribble the ball. In this case, we have three different blocks of code that we can take given a certain set of conditions. We can chain if-else if-else statements to cover all of the different scenarios. 

// boolean defenderGuarding = true;
// boolean closeToBasket = true;
// if(defenderGuarding == true) {
//     System.out.println("Pass The Ball");
// } else if(closeToBasket == true) {
//     System.out.println("Shoot The Ball");
// } else {
//     System.out.println("Dribble The Ball");
// }
// Note: Conditionals are not limited to just comparing booleans. You can compare other data types as well, including Strings and integers. But you have to make sure you are not comparing two completely different data types.