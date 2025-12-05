package EXCEPTIONS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReaderE {
    public static void main(String[] args) {

        String path="C:\\Users\\a1jay\\Desktop\\text1.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){  // bufferedReader object need a fileReader oject
            System.out.println("File found");
            String line;
            while( (line = reader.readLine() )!= null){
                System.out.println(line);

            }
        }
        catch(Exception e){
            System.out.println("Something went wrong !!");

        }

    }

}
//summary:
// this program is used to read the file from a location ,
// bufferedReader it needs a FileReader object
// bReader --> is the middle man between the program and file
// exeception must be imported
