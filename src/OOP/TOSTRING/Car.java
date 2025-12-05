package OOP.TOSTRING;

public class Car {

    String name;
    String color;

    Car(String name , String color){
        this.name = name;
        this.color = color;
    }

    @Override

    public String toString(){
        return "name : "+this.name+ " color : " +this.color ;
    }

}
