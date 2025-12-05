package OOP.COMPOSITION;

public class main {

    public static void main(String[] args) {

        // Composition : it possess a "part-of " of relation between objects
        // Allows us to create small parts of a complex object

        System.out.println("Hello there !! How is it going!! ");
        Heart h = new Heart( true);

        HumanBody h1 = new HumanBody("ajay",2,true);
        System.out.printf(" humanName : %s, no.of bones : %d, Is beating : %s \n",h1.name,h1.bonesCount, h1.heart.isBeats);
        // obj.obj.property --> when we use a composition
        System.out.println(h1.heart.Beating());  // body object --> body property of hearRt --> heart property

        h1.BodyCon();  // check method





    }
}

//summary:
// Composition , it is like the objects having a connection (part-of) if the connection is lost they are not initiated.
//here we created the body and engine class , we use engine class in the body , we have created a engine object in the
// body