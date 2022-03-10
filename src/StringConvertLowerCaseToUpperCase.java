
public class StringConvertLowerCaseToUpperCase {

	public static String convertCase(String string) {
		//ASCII small 97-121, caps 65-91 a-z
		String temp="";
		for(int i = 0; i<string.length();i++) {
			
			int x =string.charAt(i);
			
			if(x>=91) { //if x is greater than 91 it means its a small case letter
				x-=32;
			}
			
			temp=temp + (char)x;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println(convertCase("Hi"));
	}

	
	
}
