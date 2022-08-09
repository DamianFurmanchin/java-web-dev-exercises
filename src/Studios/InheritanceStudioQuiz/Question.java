package Studios.InheritanceStudioQuiz;
public abstract class Question {
    private String questionTitle;


    public Question(String title) {
        this.questionTitle = title;
    }
    public abstract String getAnswer();

    public abstract void displayQuestion();

    public String getTitle() {
        return this.questionTitle;
    }
}
