package OOP.AGGREGATION;

public class Dmart {

    String Area;
    Items[] items;

    Dmart(String area, Items[] items){
        this.Area = area;
        this.items = items;
    }

    void showDmart(Items[] items){
        for(Items item :items){
            System.out.printf("itemname : %s  , itemprize :%d \n", item.itemName,item.prize);
            //  dont confuse , check for what is the object
        }

    }
}
