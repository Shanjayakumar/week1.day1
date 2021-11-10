package week1.day2;

public class StringClass {

	public static void main(String[] args) {
		 String str= "welcome" ;
		 char[] charArray = str.toCharArray();
		 for (int i = 0; i < charArray.length; i++) {
			 System.out.println("char["+i+"]" +charArray[i]);
			 if (i%2!=0) {
				 char uppercase = Character.toUpperCase(charArray[i]);
				 System.out.println(uppercase);
				 
				
			}
			 
		}
		 
	}

}
