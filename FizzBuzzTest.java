public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz TestCase = new FizzBuzz();
        String answer0 = TestCase.fizzBuzzMethod(3);
        String answer1 = TestCase.fizzBuzzMethod(5);
        String answer2 = TestCase.fizzBuzzMethod(15);
        String answer3 = TestCase.fizzBuzzMethod(2); 
        System.out.println(answer0);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}