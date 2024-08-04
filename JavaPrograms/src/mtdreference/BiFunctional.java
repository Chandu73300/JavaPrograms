package mtdreference;

import java.util.function.BiFunction;

public class BiFunctional {
	public static void main(String[] args) {  
		BiFunction<Integer, Integer, Integer> product = Multiplication::toMultiply;  
		int pr = product.apply(12, 6);  
		System.out.println("The final product is: " + pr);  
	} 
}
