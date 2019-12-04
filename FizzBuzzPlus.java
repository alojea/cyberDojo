package cyber.dojo.pratice;

public class FizzBuzzPlus {

	public static String evaluateFizzBuzz(int value) {
	    
        if(value%3 == 0 || isNumberInsideSring(value,3)){
            return "Fizz";
        }
        if(value%5 == 0 || isNumberInsideSring(value,5)){
            return "Buzz"; 
        }
        return String.valueOf(value);
    }
	
	public static boolean isNumberInsideSring(int value, int nbrToSearch) {
		
		String valueStr = String.valueOf(value);
		CharSequence nbrToSearchStr = String.valueOf(nbrToSearch);
		
		if(valueStr.contains(nbrToSearchStr)) {
			return true;
		} else {
			return false;
		}
		
	}

}
