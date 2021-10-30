package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int num=5;
		long fac=1;
		for (int i = 1; i < num; i++) {
			fac=fac*i;
			
		}
		System.out.println("factorial" + fac);
	}

}
