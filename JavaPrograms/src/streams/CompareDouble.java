package streams;

import java.util.*;

class Office implements Comparable<Office> {
  Long empId;
  String name;
  Double sal;
  public Office(Long empId, String name, Double sal) {
        this.empId = empId;
        this.name = name;
        this.sal = sal;
    }
  
  public int compareTo(Office office) {
	  if(sal == office.sal) {
		  return 0;
	  } else if(sal > office.sal) {
		  return 1;
	  } else {
		  return -1;
	  }
//    return Double.compare(this.sal, office.sal);
  }
  
      // Getters (optional, but useful for debugging)
//    public Long getEmpId() {
//        return empId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Double getSal() {
//        return sal;
//    }
//
//    @Override
//    public String toString() {
//        return "Office{" +
//                "empId=" + empId +
//                ", name='" + name + '\'' +
//                ", sal=" + sal +
//                '}';
//    }
}

public class CompareDouble {
    public static void main(String[] args) {
      List<Office> of = Arrays.asList(
            new Office(16016L, "Chandu", 20000.0),
            new Office(16010L, "Chandu", 50000.0),
            new Office(16013L, "Chandu", 10000.0),
            new Office(16015L, "Chandu", 80000.0),
            new Office(16011L, "Chandu", 30000.0),
            new Office(16045L, "Chandu", 20000.0));
      
      Collections.sort(of);
//      for(Office st:of){  
//			System.out.println(st.empId + "" + st.name + "" + st.sal);  
//		}
//      System.out.println(of);
  }
}