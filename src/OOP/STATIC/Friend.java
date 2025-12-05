package OOP.STATIC;

public class Friend {
    static int numOfFriends;
    static String favSpot;
    String name;


    Friend(String name) {
        this.name = name;
        favSpot="America";  // no need for this.variable , as the static variable is owned by class and shared by all objects.
        numOfFriends++;
    }

    static void ShowFriend() {     // it needs to be a static class , otherwise it need to be called through object
        System.out.printf("Number of Friends are %d \n", Friend.numOfFriends); //   class.variable
    }

}
