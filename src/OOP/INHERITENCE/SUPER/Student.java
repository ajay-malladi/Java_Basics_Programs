package OOP.INHERITENCE.SUPER;

public class Student extends Person{

    double gpa;

    Student(String first , String last, double cgpa){
        super(first, last);
        this.gpa = cgpa;


    }
}
