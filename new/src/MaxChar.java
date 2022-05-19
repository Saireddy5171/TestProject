

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str2= "i am naveen reddy ";
		String str1=str2.replaceAll("\\s+","");
		System.out.println(str1);
	    HashMap<Character, Integer> map1 = new HashMap<>();
	    for(int i=0;i<str1.length();i++ ) {
	    	if(!map1.containsKey(str1.charAt(i))) {
	    		map1.put(str1.charAt(i), 1);
	    	}else {
	    		Integer count = map1.get(str1.charAt(i));
	    		map1.put(str1.charAt(i),count+1);
	    	}
	    }
	    int maxValueInMap = (Collections.max(map1.values()));
	    
        // Iterate through HashMap
        for (Entry<Character, Integer> entry :
             map1.entrySet()) {
 
            if (entry.getValue() == maxValueInMap) {
 
                // Print the key with max value
                System.out.println(entry.getKey() + " is repeated for "+ entry.getValue() + " times."  );
            }
        }
	    System.out.println(map1);
	}

}
