package programlist;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {
	public static void main(String args[]) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Ravi");
		lst.add("manav");
		lst.add("spray");
		lst.add("jadav");
		
		lst.forEach(n->System.out.println(n));
		
//		for(String str: lst) {
//			System.out.println(str);
//		}
	}

}
