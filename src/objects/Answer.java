package objects;

public class Answer {

    private int id;
    private String answer;
    private boolean correct;
    private int question_id;

    public Answer(int id, String answer, boolean correct, int question_id) {
        this.id = id;
        this.answer = answer;
        this.correct = correct;
        this.question_id = question_id;
    }

    public int getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public int getQuestion_id() {
        return question_id;
    }

}
