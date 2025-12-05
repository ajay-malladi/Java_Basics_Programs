package WRITING_FILE;

import java.io.FileWriter;
import java.io.IOException;


public class WritingFileDemo {
    public static void main(String[] args) {


        String filePath="C:\\Users\\a1jay\\Desktop\\text1.txt";  // should give file name , and path ends with always a file name
        String FileText =
                """
                I am Iron \n I Love you 3000 
                
                """;

        try(FileWriter writer= new FileWriter(filePath);){
            writer.write(FileText);
            System.out.println("File Written");
        }
        catch(Exception e){
            System.out.println("Couldn't write the file ");

        }


    }
}
