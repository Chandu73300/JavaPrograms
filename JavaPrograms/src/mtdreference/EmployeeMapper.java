package mtdreference;

public class EmployeeMapper {
	public EmployeeDAO convert(Employee emp) {
		EmployeeDAO empDao = new EmployeeDAO();
		empDao.setId(emp.getId());
		empDao.setName(emp.getName());
		empDao.setSalary(emp.getSalary());
		
		return empDao;
	}
}
