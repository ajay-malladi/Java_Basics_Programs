package FILE_CLASS;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\a1jay\\Desktop\\test1.txt");
        File folder = new File("C:\\Users\\a1jay\\Desktop\\NewFolder");


        try {   //only autocloseable
//            file.createNewFile();
//            System.out.println("file Created");
//            System.out.println(file.getName());   // to get the file name
//            System.out.println(file.getParent()); // at which location does it present
//            if (folder.mkdir()) {
//                System.out.println("Folder created!");
//            } else {
//                System.out.println("Failed to create folder.");
//            }
            folder.mkdir();

        }
//        catch (IOException e) {
//            System.out.println("Wrong Data");
//        }

        catch(Exception e){
            System.out.println("SomeThing went wrong");
        }



    }
}
