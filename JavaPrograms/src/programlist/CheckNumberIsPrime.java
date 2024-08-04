package programlist;

import java.util.Scanner;

public class CheckNumberIsPrime{    
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
        	System.out.print("Please Enter a Number:");
        	int input = sc.nextInt();
        	if(isPrime(input)) {
        		System.out.println("Given Number is a prime number");
        	}else {
        		System.out.println("Given Number is not a prime number");
        	}
        }
    }

	public static boolean isPrime(int input) {
		// TODO Auto-generated method stub
		if(input <= 1) {
			return false;
		} else {
			for(int i=2; i<Math.sqrt(input); i++) {
				if(input % i == 0) {
					return false;
				}
			}
		}
		return true;
	}    
}
