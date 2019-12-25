package cyber.dojo.pratice;


import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class OneHundredDoorsTest {

	@Test
	void test() {
		Map<Integer,String> doors= new HashMap<Integer, String>();
		
		for(int i=1;i<=100;i++) {
			doors.put(i, "closed");
		}
		
		Map<Integer,String> result = OneHundredDoors.checkAndChangeDoorStatus(doors);
		
		for(int i=1;i<=100;i++) {
			if(i == 1 || i == 4 || i == 9 || i == 16 || i == 25 || 
					i == 36 || i == 49 || i == 64 || i == 81 || i == 100) {
				Assert.assertTrue("mismatch in door"+i, result.get(i).equals("open"));
			} else {
				Assert.assertTrue("mismatch in door"+i, result.get(i).equals("closed"));
			}
		}
	}
}
