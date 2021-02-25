package home_work;

import home_work.daos.QuestionsDAO;
import home_work.services.CreatingExam;
import home_work.services.CreatingExamImpl;
import home_work.services.CsvReader;
import home_work.services.CsvReaderImpl;
import lombok.Cleanup;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        @Cleanup
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("home_work-context.xml");

        CsvReader reader = context.getBean(CsvReaderImpl.class);
        QuestionsDAO questionsDAO = context.getBean(QuestionsDAO.class);
        CreatingExam exam = context.getBean(CreatingExamImpl.class);

        exam.createExamQuestions(questionsDAO, reader).startStudentExamination(questionsDAO);
    }
}
