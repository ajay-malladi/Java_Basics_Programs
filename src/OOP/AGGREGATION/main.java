package OOP.AGGREGATION;

public class main {
    public static void main(String[] args) {

        System.out.println(" Hi there ");
        Items i1 = new Items("Biscuits", 5);
        Items i2  = new Items("Showergel",10);
        Items i3 = new Items("book",5);

        Items [] items = {i1,i2,i3};   // items  are grouped into array  of Objects
        Dmart d = new Dmart("yanam",items);   // here we passed the items array to the Dmart

        System.out.println(i1.showItems());
        System.out.println(i2.showItems());
        System.out.println(i3.showItems());
        System.out.println();

        d.showDmart(items);




    }
}
// Summary:

// in the aggregation concpet :
// here we created a group of items which are of same kind( Items) and then  we aggregated that data into and object array
// and then we passed it to the DMART class , we defined this list of items as one of the property of the dmart class
// it has the access to all this itmes which are aggregated.
// The main point : if you delete the dmart class, still the items class exist.
