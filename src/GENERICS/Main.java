package GENERICS;

public class Main {
    public static void main(String[] args) {
        // GENERICS :  it is a concept , where you write class, interface , methods
        //              that is compatible with different data types
        //              <T,U, ...> type parameters , it is like a placeholder that can be replaced
        //              by  different data types
        //              <String , Int...> type arguments , it specifies a certain object

        Box<String,Integer> box = new Box<>("Apple ", 50); // at new we need to initialse the data

        System.out.println("Item : "+ box.getItem());
        System.out.println("Prize : "+box.getPrize());

    }
}
