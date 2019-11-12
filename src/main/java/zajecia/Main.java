package zajecia;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double []data={4.,1.,9.};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        Student s1=new Student("o",3.0);
        Student s2=new Student("w",4.0);
        Student s3=new Student("a",2.0);
        Student s4=new Student("b",5.0);
        Student[]students={s1,s2,s3,s4};
        //Arrays.sort(students);
        //LastNameComparator lastNameComparator=new LastNameComparator();
       // Arrays.sort(students,lastNameComparator);

        GpaComparator gpaC=new GpaComparator();
        Arrays.sort(students,gpaC);


    }
}
