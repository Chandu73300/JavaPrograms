package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student>{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  

	public int compareTo(Student st){  
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
			return 1;  
		else  
			return -1;  
	}  
}

public class ComparableExmp {
	public static void main(String args[]){  
//		ArrayList<Student> al=new ArrayList<Student>();
//		al.add(new Student(101,"Vijay",23));  
//		al.add(new Student(106,"Ajay",27));  
//		al.add(new Student(105,"Jai",21));  

//		ArrayList<String> al=new ArrayList<>(Arrays.asList("Chandu","Deva","Mahi","Prasad"));
		ArrayList<Integer> il=new ArrayList<>(Arrays.asList(4,7,2,4,8,1,0));
		
		Collections.sort(il);
//		for(Student st:al){  
//			System.out.println(st.rollno+" "+st.name+" "+st.age);  
//		}
		for(Integer st:il){  
			System.out.println(st);  
		}
	}
}
