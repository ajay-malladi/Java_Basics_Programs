package OOP.INHERITENCE.SUPER;

public class Persondemo {

          /* SUPER METHOD : basically it is used when there are more variable in subclass constructor ,
             we pass the parameters through super methods, remaining through this.

                   refers to  the parent clas , used in constructor and method overriding
                   calls the parent constructor to initialize attributes */





    public static void main(String[] args) {


        Person p = new Person("Ajay ", "Malladi");
        System.out.println("first name : " + p.first + " Second name : " + p.last);

        Student stu = new Student("Ajay", "Malladi", 8.4);
        System.out.printf("First name %s Last name  %s \n", stu.first, stu.last);


        Employee emp = new Employee("Ram", "Sai", 500000);

        System.out.printf("name : %s  last : %s  sal: %.2f ",emp.first,emp.last,emp.sal);

    }
}
