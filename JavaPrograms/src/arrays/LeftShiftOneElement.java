package arrays;

public class LeftShiftOneElement {
	public static void main(String[] args) {
		int arr[] = {2,9,4,1,0};
		int first = arr[0];
		int j;
		for(j=0; j < arr.length-1; j++) {
			arr[j] = arr[j+1];
			System.out.println(arr[j]);
		}
		arr[j] = first;
		System.out.println(arr[j]);
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}
}
