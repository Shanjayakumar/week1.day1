package week1.day2;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6,3,4,5,5,6,7,8};
		int count=0;
		int arrLength=arr.length;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			count=1;
			for (int j = i+1; j < arr.length-2; j++) {
				if (arr[i]==arr[j]) {
					count=count+1;
					temp=arr[i];
					
				}
			}
			if (count>1) {
				System.out.println("Duplicates" +arr[i] + "Occurance" +count);
				
			}
		}

	}

}
