import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HikerTest {

    @Test
    void test_FizzBuzz() {
        for(int i=0;i<100; i++){
            String actual = Hiker.answer(i);
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

