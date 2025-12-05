package OOP.AGGREGATION;

public class Items {

    String itemName;
    int prize;

    Items(String name, int prize){
        this.itemName=name;
        this.prize = prize;
    }

    String showItems(){
        return this.itemName+" : "+ this.prize;

    }
}
