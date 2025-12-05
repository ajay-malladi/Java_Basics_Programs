package OOP.INHERITENCE.SUPER;

public class Employee extends Person{
     double sal;

    Employee(String first , String last, double sal){
        super(first,last);
        this.sal =sal;


    }
}
