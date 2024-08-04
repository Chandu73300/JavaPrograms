package streams.comparablevscomparator;

import java.util.Comparator;

class GetDataBySalary implements Comparator<Recruitment> {
    @Override
    public int compare(Recruitment recruitment1, Recruitment recruitment2) {
        return (int) (recruitment1.salary - recruitment2.salary);
    }
 
}
