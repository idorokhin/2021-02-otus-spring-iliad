package home_work.daos;

import home_work.Entities.Question;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
public class QuestionsDAO {
    private List<Question> questions = new ArrayList<>();

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(String question, String answer) {
        questions.add(new Question(question, answer));
    }
}
