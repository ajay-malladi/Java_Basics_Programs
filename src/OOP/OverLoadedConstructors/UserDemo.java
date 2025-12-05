package OOP.OverLoadedConstructors;

public class UserDemo {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User("Ajay");  // Constructor argumenst should be passed from here , its a object creation routine
        User user3 = new User("Mrunal", 28);



        /*  user1.User();     --> this wrong way of using the constructor , as it is not a method (No return type )
        , it is basically object creation routine(specific step) */


        System.out.println("User 1:");
        System.out.printf("User Name : %s\n", user1.userName);
        System.out.printf("age  %d\n",user1.age);
        System.out.printf("Email %s\n",user1.emailId);

        System.out.println("User 2:");
        System.out.printf("User Name : %s\n", user2.userName);
        System.out.printf("age  %d\n",user2.age);
        System.out.printf("Email %s\n",user2.emailId);

        System.out.println("User 3:");
        System.out.printf("User Name : %s\n", user3.userName);
        System.out.printf("age  %d\n",user3.age);
        System.out.printf("Email %s\n",user3.emailId);


    }
}
