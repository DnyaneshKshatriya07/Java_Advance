package Comparable_N_Comparator.Comparator;

import java.util.Comparator;

public class phoneCompare implements Comparator<Stud> {
    @Override
    public int compare(Stud o1, Stud o2) {
        return o1.getPhone()-o2.getPhone();
    }
}
