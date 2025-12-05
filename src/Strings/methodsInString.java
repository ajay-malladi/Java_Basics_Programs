package Strings;

public class methodsInString {
    public static void main(String[] args) {
        String name = "Ajay Malladi";

        int length = name.length(); // use to calculate the length
        System.out.printf("String : %s is of length : %d \n", name, length);

        // to get the character at  a index
        char letter = name.charAt(0);

        // indexOf() => it gives the first occurence of the character.
        int index = name.indexOf("a");

        // this gives the last occurence of the input character
        int lastIndex = name.lastIndexOf("a");
        System.out.printf("a letter has first occurence : %d and last occurence %d\n", index, lastIndex);

        //trim method
        String you = "   Raju  Bro   ";
        you = you.trim();
        System.out.println("trimmed name : " + you);

        // replace a character with other character
        you = you.replace("a", "j");
        System.out.println("replace name with a ->j : " + you);

        // checking string is empty or not
        if (name.isEmpty()) { //  all string methods are in form : String.method();
            System.out.println("name is Empty");
        } else {
            System.out.println("name is not empty");
        }

        // checking for a character in a String
        // syn : String.contains(" character");
        if (name.contains("A")) {
            System.out.println("contains the Character");
        } else {
            System.out.println("Doesn't contians character");
        }

        // checking for if strings are equal
        //syn: String1.equals("string2"); it is case Senstive
        // syn: String1.equalsIgnoreCase("String2");  // not case sensitive

        if(name.equalsIgnoreCase("ajay Malladi")){
            System.out.println("strings Equal");
        }
        else{
            System.out.println("Strings not equal");
        }
        // to covert into upper case
        name = name.toUpperCase();
        System.out.println(name);

        /*
            ==> Substring
            syn : String.substring(Start, end); // end is exclusive (upto it)
            syn: String.substring(start); all the characters note: substring all together a keyword, not capital S
         */
         String email ="ajaymalladi@gmail.com";
         String userName=email.substring(0,email.indexOf("@"));
         System.out.println("userName: "+ userName);
         String domain= email.substring(email.indexOf("@")+1);
        System.out.println("domain : " +domain);




    }


}
