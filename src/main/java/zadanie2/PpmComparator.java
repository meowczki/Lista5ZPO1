package zadanie2;

import java.util.Comparator;

public class PpmComparator implements Comparator<Measurable> {


    @Override
    public int compare(Measurable o1, Measurable o2) {
        return Double.compare(o1.getMeasure(),o2.getMeasure());
    }
}
