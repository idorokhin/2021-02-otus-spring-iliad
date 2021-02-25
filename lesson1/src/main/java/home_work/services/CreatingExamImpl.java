package home_work.services;


import home_work.daos.QuestionsDAO;
import lombok.Cleanup;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class CreatingExamImpl implements CreatingExam {


    @Override
    public CreatingExamImpl createExamQuestions(QuestionsDAO questionsDAO, CsvReader csvReader) {
        @Cleanup
        Scanner scanner = csvReader.getScanner();

        while (scanner.hasNext()) {
            String[] values = scanner.next().split(";");
            questionsDAO.setQuestions(values[0], values[1]);
        }

        return this;
    }


    @Override
    public void startStudentExamination(QuestionsDAO questionsDAO) {

        @Cleanup
        Scanner console = new Scanner(System.in);

        questionsDAO.getQuestions().forEach(question -> {
            String questionIt = question.getLineQuestion();
            String answerIt = question.getLineAnswer();

            System.out.println(questionIt);
            String userAnswer = console.nextLine();

            if (userAnswer.equalsIgnoreCase(answerIt)) {
                System.out.println("что то хорошее!");
            } else {
                System.out.println("не верно!");
            }
        });

    }
}
