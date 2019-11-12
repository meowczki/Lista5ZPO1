package zadanie1;

import java.util.Comparator;

public class LiczbaTurniejiComparator implements Comparator<Tenisista> {
    @Override
    public int compare(Tenisista o1, Tenisista o2) {
        return Integer.compare(o1.getLiczbaTurnieji(),o2.getLiczbaTurnieji());
    }
}
