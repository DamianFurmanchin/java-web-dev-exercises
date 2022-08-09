//package Studios.InheritanceStudioQuiz;
//import java.util.ArrayList;
//
//public class MultipleChoice extends Question{
//    final String questionType = "MultipleChoice";
//    ArrayList<String> choices = new ArrayList<>();
//    final String correctAnswer;
//
//    public MultipleChoice(String title, ArrayList<String> choices, int answer,) {
//        super(title);
//        this.correctAnswer = choices.get(answer);
//        this.choices = choices;
//    }
//
//    @Override
//    public String getAnswer() {
//        return correctAnswer;
//    }
//
//    @Override
//    public void displayQuestion() {
//        System.out.println(this.getTitle());
//        for(String choice : choices) {
//            System.out.println(choice);
//        }
//    }
//}
