package lamdaexpressions;

/** 
 * What are lambda expressions?
Lambdas in java give the ability to make method implementations for functional interfaces 
in to the objects like save into variable or passed in to method as parameter. 
*/

public class GiveMeAnExampleForNeedOfLambda {
	public static void main(String[] args) {
//		Cat sound = new Cat();
//		sound.print();
		
		Printable pr = () -> System.out.println("Cat sounds like meow.");
		pr.print();
	}
}
