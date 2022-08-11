package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter3ExercisesPart2 {
    public static void main(String[] args){
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.add(2);
        numArray.add(6);
        numArray.add(4);
        numArray.add(1);
        numArray.add(7);
        numArray.add(5);
        numArray.add(12);
        numArray.add(15);
        numArray.add(9);
        numArray.add(10);

        ArrayList<String> breakfastArray = new ArrayList<>();
        breakfastArray.add("waffles");
        breakfastArray.add("bacon");
        breakfastArray.add("juice");
        breakfastArray.add("cereal");
        breakfastArray.add("toast");
        breakfastArray.add("eggs");
        breakfastArray.add("coffee");
    }

    public static int sumEven(ArrayList<Integer> numArray) {
        int total = 0;
        for (int integer : numArray) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
//
//    public static String Letters5(ArrayList<String> breakfastArray) {
//        for (int i = 0; i < breakfastArray.size(); i++) {
//            for (String item : breakfastArray.get(i)) {
//                if (item.length == 5) {
//                    System.out.println(item);
//                }
//            }
//        }
//    }
}
