package zadanie1;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getNazwisko().compareTo(o2.getNazwisko());
    }
}
