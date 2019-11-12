package zadanie1;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return o1.getImie().compareTo(o2.getImie());
    }
}
