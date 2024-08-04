package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employ {
    private String name;
    private int sal;

    public Employ(String name, int sal) {
        this.name = name;
        this.setSal(sal);
    }

    public String getName() {
        return name;
    }

    public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
    public String toString() {
        return "Employee{name='" + name + "', name='" + sal + "'}";
    }
}

public class FindScndHstSalOfEmp {
	public static void main(String[] args) {
		List<Employ> empList = Arrays.asList(new Employ("chandu", 100), 
				new Employ("ravi", 10), 
				new Employ("mena", 90),
				new Employ("manu", 55),
				new Employ("rekha", 78),
				new Employ("swapna", 28),
				new Employ("surya", 45));
		/* For second highest salary */
//		Optional<Employ> empList1 = empList.stream().sorted(Comparator.comparing(Employ::getSal).reversed()).skip(1).findFirst();
//		System.out.println(empList1.toString());
		/* For highest salary */
		Optional<Employ> empList1 = empList.stream().max(Comparator.comparingInt(Employ::getSal));
		empList1.ifPresent(System.out::println);
	}
}
