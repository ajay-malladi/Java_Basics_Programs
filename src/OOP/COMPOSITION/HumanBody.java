package OOP.COMPOSITION;

public class HumanBody {
    String name;
    int bonesCount;
    Heart heart;

    HumanBody(String name, int bones, boolean heart) {
        this.name = name;
        this.bonesCount = bones;
        this.heart = new Heart(heart);  // here the object is created , if you want to access a object first you need to create it

    }
    void BodyCon(){
       // without confusion , track back methods one by one from back , body ->heart
        this.heart.Beating();
        System.out.println(this.name+ " " + this.heart.Beating());
    }

}
