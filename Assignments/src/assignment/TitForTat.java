package assignment;

import java.util.*;

public class TitForTat {
	 public static String ress = "";
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res="";
		res = removeDupl(str);
//		TitForTat tit = new TitForTat();
		System.out.print(res);
		/*
		 * int prev = 0, next = 1; if (str.length() >= 2) { while (next < str.length())
		 * {
		 * 
		 * if (str.charAt(prev) != str.charAt(next)) { res += str.charAt(prev); } else {
		 * next++; } prev = next; next++; } System.out.print(res); } else {
		 * System.out.print(str); }
		 */
	}
	
	public static String removeDupl(String str) {
		String res = "";
		int prev = 0, next = 1;
		boolean flag = false;
		if (str.length() >= 2) {
			while (next < str.length()) {

				if (str.charAt(prev) != str.charAt(next)) {
					res += str.charAt(prev);
				} else {
					flag = true;
					next++;
				}
				if(next == str.length() -1) {
					res+= str.charAt(next);
				}
				prev = next;
				next++;
			}		
		} 
		if(flag) {
			String ress = "";
		    ress = removeDupl(res);
		    res = "";
		    res =ress;
		}else {
//			return res;
//			TitForTat tit = new TitForTat();
//			tit.ress = res;
		}
		return res;
		
		
		
	}

}
