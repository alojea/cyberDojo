package cyber.dojo.pratice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzPlusTest {

	 @Test
	 void test_FizzBuzz() {
	        for(int i=0;i<100; i++){
	            String actual = FizzBuzzPlus.evaluateFizzBuzz(i);
	            if(i%3==0 || FizzBuzzPlus.isNumberInsideSring(i,3)){
	                assertEquals("Fizz", actual);
	            } else if(i%5 == 0 || FizzBuzzPlus.isNumberInsideSring(i,5)){
	                assertEquals("Buzz", actual);
	            } else {
	                assertEquals(String.valueOf(i), actual);
	            }
	            
	        }

	    }

}
