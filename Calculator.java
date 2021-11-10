package week1.day2;

public class Calculator {
	public int add(int num1,int num2) {
		int sum;
		sum=num1+num2;
		return sum;
	}
	public int sub (int num1,int num2) {
		int diff;
		diff=num1-num2;
		return diff;
		
	}
	public int mul(int num1,int num2) {
		int mul;
		mul=num1*num2;
		return mul;
		
	}
	public float div(float num1,float num2) {
		float div;
		div=num1/num2;
		return div;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		System.out.println("Addition"+calc.add(9, 5));
		System.out.println("Subraction"+calc.sub(8, 4));
		System.out.println("Multiply"+calc.mul(4, 5));
		System.out.println("Division"+calc.div(10, 5));
	}

}
