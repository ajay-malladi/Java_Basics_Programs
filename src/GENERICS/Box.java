package GENERICS;

public class Box <T, U>{  // type parameters
    T item;   // initialize the names of the types
    U prize;

    Box(T item , U prize){ // constructor
        this.item = item;
        this.prize = prize;
    }
    public T getItem(){
        return this.item;

    }
    public U getPrize(){
        return this.prize;
    }
}
