package week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		int n = -40,s;
		if (n<0) {
			System.out.println("negative");
			
		}
		else if (n>0) {
			System.out.println("Positive");
			
		}
		else {
			System.out.println("Zero");
		}
		s = n*(-1);
		System.out.println("positive" + s);
		
		

	}

}
