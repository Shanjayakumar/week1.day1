package week1.day1;

public class PrimeNumber {

    public static void main(String[] args) {
	int a=13;
	for (int i = 2; i < a; i++) {
		if (a%i==0) {
			
			System.out.println("Not prime");
			break;
		}
		else {
			System.out.println("prime");
			break;
		}
			
	}
		
	}
			
}