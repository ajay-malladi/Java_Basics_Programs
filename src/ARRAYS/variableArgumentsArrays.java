package ARRAYS;
import java.util.*;

public class variableArgumentsArrays {

    public static void main(String[] args) {

        // Variable Arguments : it allows the method to accept a varying # of arguments through method call.
        //                     makes method more flexible , and there will be no need for overloaded methods
        //                     java packs the arguments int to a array
        //                     ... (ellipsis)
        double add;
        add = addit(1,2,3);
        System.out.println(add);


    }
    static double addit(double...numbers){   // setting up parameters of method , syn : datatype ... name of array
        double sum =0;
        for (double num : numbers){
            sum +=num;
        }
        return sum;

    }

}

// by using this variablearguments method , creating more methods as in the overloaded methods is reduced.
