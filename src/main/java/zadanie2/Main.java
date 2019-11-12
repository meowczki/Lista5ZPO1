package zadanie2;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Measurable [] measurables=new Measurable[5];
    measurables[0]=new Kulturysta("k1",Plec.K,80,170, LocalDate.of(1990,03,20));
    measurables[1]=new Kulturysta("k2",Plec.M,100,190, LocalDate.of(1999,03,20));
    measurables[2]=new Kulturysta("k3",Plec.K,90,180, LocalDate.of(1980,03,20));
    measurables[3]=new Kulturysta("k4",Plec.M,70,175, LocalDate.of(1996,03,20));
    measurables[4]=new Kulturysta("k5",Plec.M,90,180, LocalDate.of(2000,03,20));
    Kulturysta kulturysta= (Kulturysta) largest(measurables);
        System.out.println(kulturysta.getImie());
    }
    public static Measurable largest(Measurable[]tabMes){
        PpmComparator pc=new PpmComparator();
        Arrays.sort(tabMes,pc);
        return tabMes[tabMes.length-1];
    }
}
