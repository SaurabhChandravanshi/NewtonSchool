package ds;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

 class Student {
    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getFname() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }
}
public class JavaSort {


    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student("Deepmani",77,9.40);
        students[0] = new Student("Saurabh",66,6.50);
        students[0] = new Student("John",55,8.40);
        students[0] = new Student("John",88,8.40);

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getCgpa() == s2.getCgpa()) {
                    if(s1.getFname().equals(s2.getFname())) {
                        return s2.getId() - s1.getId();
                    }
                    return s1.getFname().compareTo(s2.getFname());
                }
                return (int) (s2.getCgpa() - s1.getCgpa());
            }
        };

        List<Student> ui = new ArrayList<Student>();
        Arrays.sort(students,comparator);
    }
}
