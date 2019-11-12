package zadanie2;

import java.time.LocalDate;

public class Kulturysta implements Measurable{
    public Kulturysta(String imie, Plec plec, double masa, double wzrost, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.plec = plec;
        this.masa = masa;
        this.wzrost = wzrost;
        this.dataUrodzenia = dataUrodzenia;
    }

    private String imie;
    private Plec plec;
    private double masa;
    private double wzrost;
    private LocalDate dataUrodzenia;
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getWzrost() {
        return wzrost;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }


    public int getWiek() {
        return LocalDate.now().getYear() - dataUrodzenia.getYear();
    }

    @Override
    public String toString() {
        return "imie: "+imie+"płeć: "+plec+"masa: "+masa+" kg"+"wzrost: "+wzrost+" cm"+"data urodzenia: "+dataUrodzenia;
    }

    @Override
    public double getMeasure() {
        double ppm;
        if(plec.equals(Plec.K)){
            ppm=655.1+9.563*masa+1.85*wzrost-4.676*getWiek();
        }else{
            ppm=66.5 +13.75*masa +5.003*wzrost-6.775*getWiek();
        }
        return ppm;
    }
}
    enum Plec{
      K,M;
    }
