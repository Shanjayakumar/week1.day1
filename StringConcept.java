
package nov1.week1;

public class StringConcept {
	
	public static void main(String[] args) {
		String str= "Hello";
		String str1= "Hello";
		String str2=new String("Hello");
		/*if (str==str1) {
			System.out.println("adress is same");
			
		}
		else if(str==str2) {
			System.out.println("Comparing with new keyword");
		}*/
		if (str.equals(str2)) {
			System.out.println("values are equal");
			
		}
		else  {
			System.out.println("not equal");
			
		}
	}

}
