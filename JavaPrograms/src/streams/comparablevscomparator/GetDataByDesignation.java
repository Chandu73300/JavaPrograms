package streams.comparablevscomparator;

import java.util.Comparator;

class GetDataByDesignation implements Comparator<Recruitment> {
    @Override
    public int compare(Recruitment recruitment1, Recruitment recruitment2) {
        return recruitment1.designation.compareTo(recruitment2.designation);
    }
 
}
