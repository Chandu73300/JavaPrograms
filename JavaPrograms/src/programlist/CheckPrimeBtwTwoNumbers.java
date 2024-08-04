package programlist;

import java.util.Scanner;

public class CheckPrimeBtwTwoNumbers {
	
	public static void main(String args[]) {
		try(Scanner sc= new Scanner(System.in)) {
			System.out.println("Please Enter a Start Number:");
			int start = sc.nextInt();
			System.out.println("Please Enter a Start Number:");
			int end = sc.nextInt();
			
			for(int i=start; i<=end; i++) {
				if(CheckNumberIsPrime.isPrime(i)) {
					System.out.println(i+"is a Prime Number");
				} else {
//					System.out.println(i+"is not a Prime Number");
					continue;
				}
			}
		}
	}

}
