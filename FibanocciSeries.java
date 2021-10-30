package week1.day1;


public class FibanocciSeries {
	

	public static void main(String[] args) {
			int n1=0,n2=1,range=8,sum=0;
			System.out.println(n1);
			for (int i=1;i<range;i++) {
				sum=n1+n2;
				System.out.println(sum);
				n1=n2;
				n2=sum;
			}

	}

}
