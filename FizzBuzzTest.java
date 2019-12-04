package cyber.dojo.pratice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
    void test_FizzBuzz() {
        for(int i=0;i<100; i++){
            String actual = FizzBuzzPlus.answer(i);
            if(i%3==0){
                assertEquals("Fizz", actual);
            } else if(i%5 == 0){
                assertEquals("Buzz", actual);
            } else {
                assertEquals(String.valueOf(i), actual);
            }
            
        }

    }
}

