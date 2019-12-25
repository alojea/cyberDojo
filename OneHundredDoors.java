package cyber.dojo.pratice;

import java.util.Map;

public class OneHundredDoors {
	
	final static Integer MAX_DOORS = 100;
	
	public static Map<Integer, String> checkAndChangeDoorStatus(Map<Integer, String> doors) {
		
		for(int i=1; i<=MAX_DOORS; i++) {
	
				
				//if (j <= MAX_DOORS) {
					for(int j=i; j<=MAX_DOORS;j++) {
						
						if(j%i == 0) {
							String doorStatus = doors.get(j);
							
							if(doorStatus.equals("closed")) {
								doors.replace(j, "open");
							} else {
								doors.replace(j, "closed");
							}
							
						}
						
						System.out.println("position "+i + "Iteration " +j);
						System.out.println(doors.entrySet());
					}
					
				//}
				
			
			}
		
		
		return doors;
		
	}

}
