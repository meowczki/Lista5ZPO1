package zajecia;

public class Student implements Comparable<Student> {
    private String lastName;
    private double gpa;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String lastName, double gpa) {
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", gpa='" + gpa + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(gpa, s.gpa);//ujemna jezeli 1 jest przed, wieksza od zera kiedy 1 za, 0 kiedy równe
    }
}
