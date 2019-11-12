package zadanie1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> ranking = new ArrayList<>();
        File file = new File("ranking.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            System.out.println("plik ok");
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                ranking.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("nie można otworzyć pliku");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Tenisista> ten = getList(ranking);
        ten.stream().map(s -> s.getMiejsce()).forEach(s -> System.out.println(s));

        System.out.println();
        Collections.sort(ten);//sortowanie po wieku
        ten.stream().map(s -> s.getWiek()).forEach(s -> System.out.println(s));

        System.out.println();
        Collections.sort(ten, new PunktyComparator());
        ten.stream().map(s -> s.getPunkty()).forEach(s -> System.out.println(s));

        System.out.println();
        Collections.sort(ten, new KrajComparator());
        ten.stream().map(s -> s.getKraj()).forEach(s -> System.out.println(s));

        System.out.println();
        Collections.sort(ten, new RankingComparator());
        ten.stream().map(s -> s.getMiejsce()).forEach(s -> System.out.println(s));

        System.out.println();
        Collections.sort(ten, new FirstNameComparator());
        ten.stream().map(s -> s.getImie()).forEach(s -> System.out.println(s));


    }

    public static List<Tenisista> getList(List<String> ranking) {
        String[] tenisistaString;
        Tenisista tenisista;
        String nazwisko = "";
        List<Tenisista> listaTenisistow = new ArrayList<>();
        for (String s : ranking) {
            nazwisko = "";
            tenisista = new Tenisista();
            tenisistaString = s.split("\\t");
            tenisista.setMiejsce(Integer.valueOf(tenisistaString[0]));
            tenisista.setKraj(tenisistaString[1]);
            String[] imieInazwisko = tenisistaString[2].split(" ");
            tenisista.setImie(imieInazwisko[0]);
            for (int i = 1; i < imieInazwisko.length; i++) {
                nazwisko += " " + imieInazwisko[i];
            }
            tenisista.setNazwisko(nazwisko);
            tenisista.setWiek(Integer.valueOf(tenisistaString[3]));
            tenisista.setPunkty(Integer.valueOf(tenisistaString[4]));
            tenisista.setLiczbaTurnieji(Integer.valueOf(tenisistaString[5]));
            listaTenisistow.add(tenisista);

        }
        return listaTenisistow;
    }

}
