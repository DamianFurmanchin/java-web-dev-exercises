package Studios.chapter3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a phrase.");
        String phrase = input.nextLine();
        input.close();

        CountingCharacters.CountChars(phrase);
    }
}
