package assignment;

import java.util.HashMap;

public class charFrequency{
    public static void main(String[] args) {
		String str = "aaabbbcccddeeeffffksacd";
    	HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
		for(int i=0;i<str.length(); i++) {
			char ch = str.charAt(i);
    		if(dict.containsKey(ch)) {
    			int count = dict.get(ch);
    			count++;
    			dict.put(ch, count);
    		}else {
    			dict.put(ch, 1);
    		}
    	}
		
		for (Character ch : dict.keySet()) {
			System.out.println(ch+" = "+dict.get(ch));
		}
	}
}