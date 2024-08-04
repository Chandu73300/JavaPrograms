package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import mtdreference.Employee;

public class Streams extends Employee {
	public static void main(String[] args) {
//		Employee[] arrayEmpObj = {new Employee(1, "Jeff Bezos", 100000.0), 
//			    new Employee(2, "Bill Gates", 200000.0), 
//			    new Employee(3, "Mark Zuckerberg", 300000.0)};
//		Stream.of(arrayEmpObj).map(Employee::getName).forEach(System.out::println);
		//=================================================================//
		
//		List<Integer> li = Arrays.asList(1,4,6,2,3,9,4);
//		li.stream().map(a -> a*3).forEach(System.out::println);
		//=================================================================//
		
//		Stream.of(1,4,6,2,3,9,4).map(a -> a*3).forEach(System.out::println);
		//=================================================================//
		
//		List<Integer> li = List.of(1,4,6,2,3,9,4);
//		li.stream().map(a -> a*3).forEach(System.out::println);
		//=================================================================//
		
//		HashSet<String> set = new HashSet<>();
//		set.addAll(Arrays.asList("geeks", "gfg", "g", "e", "e", "k", null));
//		set.stream().map(String::toUpperCase).forEach(System.out::println); //only at this line throws null pointer exception.
		
//		HashSet<String> set1 = new HashSet<>();
//		set1.addAll(Arrays.asList(null,null,"Ramu","DEV"));//only printed one null value.
//		Iterator<String> ir = set1.iterator();
//		while(ir.hasNext()) {
//			System.out.println(ir.next());//Printed null value
//		}
		//=================================================================//
		
//		String[] str = {"Ravi", "Chandu", "Banu"};
//		Stream<String> st = Arrays.stream(str);
//		st.forEach(System.out::println);
		//=================================================================//
		
//		int[] i = {1,2,3,4};
//		for(int n:i) {
//			System.out.println(n);
//		}
		
		
	}
}
