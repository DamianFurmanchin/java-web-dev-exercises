package exercises;
import java.util.Scanner;

//        Integer index = aliceText.indexOf(searchTerm);
//        Integer length = searchTerm.length();
//        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
//        String modifiedSentence = aliceText.replace(searchTerm, "");
//        System.out.println(modifiedSentence);

public class Alice {
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
            String aliceText = "Alice was beginning to get very tired of " +
            "sitting by her sister on the bank, and of having nothing to do: " +
            "once or twice she had peeped into the book her sister was reading, but" +
            " it had no pictures or conversations in it, 'and what is the use of a book,' " +
            "thought Alice 'without pictures or conversation?";
    System.out.println("Enter a search term for a word in the text.");
    String searchTerm = input.next();
    input.close();

    System.out.println(aliceText.toUpperCase().contains(searchTerm.toUpperCase()));
    Integer index = aliceText.indexOf(searchTerm);
    Integer length = searchTerm.length();
    System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
    String modifiedSentence = aliceText.replace(searchTerm, "");
    System.out.println(modifiedSentence);
}
}
