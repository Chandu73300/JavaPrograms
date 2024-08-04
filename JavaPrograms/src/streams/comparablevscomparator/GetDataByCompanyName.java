package streams.comparablevscomparator;

import java.util.Comparator;

class GetDataByCompanyName implements Comparator<Recruitment>{
	 
    @Override
    public int compare(Recruitment recruitment1, Recruitment recruitment2) {
        return recruitment1.companyName.compareTo(recruitment2.companyName);
    }
 
}
