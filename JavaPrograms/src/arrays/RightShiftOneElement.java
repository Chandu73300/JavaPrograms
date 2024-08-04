package arrays;

public class RightShiftOneElement {
	public static void main(String[] args) {
		int arr[] = {2,9,4,1,0};
		int last = arr[arr.length-1];
		for(int j=arr.length-1; j > 0; j--) {
			arr[j] = arr[j-1];
		}
		arr[0] = last;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
