package ENUMERATIONS;

public class Main {
    public static void main(String[] args) {
        //Enumerations : (ENUMS) short form ,  these are like special kind of class ,
        //                 where we have fixed set of constants
        //               improves the code readability and maintainance

        //     syn:Class.object
        Day day1 = Day.SUNDAY; // no new operator is required , new Day();
        System.out.println(day1);
        day1.getDayNumber();
        Day day2 = Day.MONDAY;
        Day day3 = Day.TUESDAY;
        Day day4 = Day.WEDNESDAY;
        Day day5 = Day.THURSDAY;
        Day day6 = Day.FRIDAY;
        Day day7 = Day.SATURDAY;

        switch(day1){   // change the switch cases
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("Its a Week day");
            case SATURDAY,
                 SUNDAY-> System.out.println("It is Weekend");
        }



    }
}
// it can  be used in the switch cases for code readability