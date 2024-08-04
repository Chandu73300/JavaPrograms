package streams.comparablevscomparator;

import java.util.Comparator;

class GetDataByDesignationAndSalary implements Comparator<Recruitment> {
	 
    @Override
    public int compare(Recruitment recruitment1, Recruitment recruitment2) {
        int designationComparision = recruitment1.designation.compareTo(recruitment2.designation);
        int salaryComparision = (int) (recruitment1.salary - recruitment2.salary);
        return (salaryComparision == 0) ? designationComparision
                : salaryComparision;
    }
     
}
