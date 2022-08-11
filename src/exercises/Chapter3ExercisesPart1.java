package exercises;
import java.util.Arrays;

public class Chapter3ExercisesPart1 {
    public static void main(String[] args) {
        int numberArray[] = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < numberArray.length; i++){
            if (numberArray[i]%2 != 0){
            System.out.println(numberArray[i]);
            }
        }
        String seuss = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] words = seuss.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = seuss.split( "\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
