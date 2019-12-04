package cyber.dojo.pratice;

public class FizzBuzz {

    public static String answer(int value) {
    
        if(value%3 == 0){
            return "Fizz";
        }
        if(value%5 == 0){
            return "Buzz"; 
        }
        return String.valueOf(value);
    }
}
