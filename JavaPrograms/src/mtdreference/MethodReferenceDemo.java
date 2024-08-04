package mtdreference;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		EmployeeManager empManager = Employee::getEmployeeInfo;
		empManager.getEmployee();
		
		/* Anonymous implementation */
//		service.loadEmployeedFromDB()
//		.forEach(new Consumer<Employee>() {
//			public void accept(Employee employee) {
//				System.out.println(employee);
//			}
//		});
		
		/* Using lambda expressions */
//		service.loadEmployeedFromDB()
//		.forEach(employee -> System.out.println(employee));
		
		/* Using method reference */
//		service.loadEmployeedFromDB()
//		.forEach(System.out::println);
		
//		List<EmployeeDAO> empDAO = service.loadEmployeedFromDB()
//		.stream()
//		.map(new Function<Employee, EmployeeDAO>() {
//
//			@Override
//			public EmployeeDAO apply(Employee emp) {
//				EmployeeDAO empDao = new EmployeeDAO();
//				empDao.setId(emp.getId());
//				empDao.setName(emp.getName());
//				empDao.setSalary(emp.getSalary());
//				return empDao;
//			}
//		})
//		.collect(Collectors.toList());
//		System.out.println(empDAO);
		
//		EmployeeMapper empMapper = new EmployeeMapper();
//		List<EmployeeDAO> empDAO = service.loadEmployeedFromDB()
//				.stream()
//				.map(empMapper::convert)
//				.collect(Collectors.toList());
//				System.out.println(empDAO);
	}
}
