package zadanie1;

import java.util.Comparator;

public class PunktyComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Integer.compare(o1.getPunkty(),o2.getPunkty());
    }
}
