package home_work.services;

import home_work.daos.QuestionsDAO;

public interface CreatingExam {

    CreatingExamImpl createExamQuestions(QuestionsDAO questionsDAO, CsvReader csvReader);
    void startStudentExamination(QuestionsDAO questionsDAO);

}
