package OOP;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Ajay", 22, 9.3);
        Student s2 = new Student ("Sydneey Sweeny", 26, 0);
        System.out.println(s1.Name);

        //s1.Studing(s1);  // passing instance variable is not required her because the object is already having it
                              // try checking by passing the s2. studying methods works for s2 .
        s1.Studing(); //this works , when the class has  the no parameter because in the main class we are not passing them.
        s2.Studing();
    }





}
