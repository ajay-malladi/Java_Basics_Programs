package OOP.STATIC;



public class FriendDemo {
    public static void main(String[] args) {

        Friend f1 =new Friend("Ajay");
        Friend f2 =new Friend("Ram");



        //f1.ShowFriend(); it also runs , but the better way is to run through class
        Friend.ShowFriend();
        System.out.println(Friend.favSpot);
    }
}


//     Syn : class.staticVariable /class.staticMethod();