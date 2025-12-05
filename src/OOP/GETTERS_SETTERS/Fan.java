package OOP.GETTERS_SETTERS;

public class Fan {

    private final int wings;
    private String name ;
    private int prize;
    private String mode;

    Fan(int wg, String nm, int pz){
        this.wings=wg;
        this.name =nm;
        this.prize = pz;
        this.mode = "medium";

    }

    int getWings(){
        return wings;
    }
    String getName(){
        return name;
    }
    String getMode(){
        return mode;
    }
    String getPrize(){     // basically it is a int method , but we can change    ,
                              // but the object has the int variable only ?
        return "$" + prize;
    }

    void setPrize(int prze){
         prize = prze;    // this. ---> also works why??
        System.out.printf("Prize : %d \n",prize);

    }
    void setMode(String mde){
        this.mode=mde;
        System.out.println("Mode : "+ mode);

    }




}
