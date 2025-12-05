public class prntfMethodJava {
    public static void main(String[] args) {

        //printf() => is a method used tpo format (edit ) the output with variables.
        // %[flags] [width] [.precision]{specifier Character]

        // flag:
         //  + = output a plus
         // , => a comma after  grouping
        // ( => negative number is enclosed in ()
        //  space => display minus sign for negative ,  space for positve.

        /*
           [width]
           pn = zero padding {p = number, space , - : means reverse space }

         */



        String name ="SpongeBob";
        char firstLetter ='S';
        int age = 220000;
        double ht = 1780000000000000000000.77;
        boolean isEmployed = false;

        System.out.printf(" Name :%s \n",name); // String -%s
        System.out.printf(" first letter :%c \n",firstLetter); // char - %c
        System.out.printf(" age :%d \n ", age); // integer - %d
        System.out.printf("heigth: %.2f \n", ht); // double -%f  for precision :%.nf  n -no. of digits
        System.out.printf(" Empployed :%b ", isEmployed); // %b
        System.out.printf("%, .2f" , ht);





    }
}
