package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Generics {
	public static <T> void main(String[] args) {
//		Printer<Integer> pri = new Printer<Integer>(1);
//		pri.print();
//		Printer<String> pr = new Printer<String>("Hey how are you.");
//		pr.print();
		
		Integer arr[] = {1,2,4,5};
		List<String> listStr = new ArrayList<String>(Arrays.asList("Chandra","Ravi","Pavan","Sudha"));
		printNames(listStr);
		List<Integer> listInt = new ArrayList<Integer>(Arrays.asList(arr));
		printNames(listInt);
	}
	
	private static <T> void printNames(List<T> ls) {
		Iterator<T> ir = ls.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
