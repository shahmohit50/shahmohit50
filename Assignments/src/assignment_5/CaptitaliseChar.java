package assignment_5;

public class CaptitaliseChar {
public static void main(String[] args) {
	String str = "abc1@3#xyz" ;
	String add = "";
	for(int i=0; i<str.length(); i++) {
		add += captialize(str.charAt(i));
	}
	System.out.println(add);
	
}
public static String captialize(char ch) {
	String str = "";
	if((ch >= 'a'
			&& ch <= 'z')){
		str+= Character.toString(ch-32);	
	}else {
		str += Character.toString(ch);
	}
	
	return str;	
}
}
