package assignment;

import java.util.HashMap;

public class StudentHash {
	public static void main(String[] args) {
    	HashMap<Integer, String> student = new HashMap<>();
    	
    	student.put(1, "Mohit");
    	student.put(2, "Aashis");
    	student.put(3, "Dhawal");
    	student.put(4, "Mehak");
    	student.put(5, "Ravi");
    	
    	for (Integer i : student.keySet()) {
			System.out.println("Key -"+i+" Value - "+student.get(i));
		}
    }
}
