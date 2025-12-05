package OOP;

public class Student {
    // Constructor : it is a special method , that initialize the objects, and we can pass the arguments to them to get different (state and Behaviour) objects.

    String Name;
    int age ;
    double gpa;
    boolean isEnrolled = true;

    Student(String name , int age ,double gpa){
        this.Name = name;
        this.age = age;
        this.gpa = gpa;
                                // we cant write the void study here because then when we call the method , it doesnt find where it is .

    }
    void Studing(){
        System.out.println(this .Name + " is studing");

    }



}
