package OOP.OverLoadedConstructors;

public class User {

    // this attributes are optional , no mandatory while initialization.

    String userName;
    int age;
    String emailId;

    //Constructor 1

    User() {
        this.userName = "Guest";
        this.age = 0;
        this.emailId = "Not Provided";

    }
    // constructor 2

    User(String name) {
        this.userName = name;
        this.age = 0;
        this.emailId = "Not Provided";

    }
    //Constructure 3

    User(String name, int age) {
        this.userName = name;
        this.age = age;
        this.emailId = "Not Provided";

    }


}
