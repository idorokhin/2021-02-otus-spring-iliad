package home_work.services;

import lombok.Getter;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.Scanner;

@Getter
public class CsvReaderImpl implements CsvReader{

    private final ClassPathResource fileWithQuestions;
    private final Scanner scanner;

    public CsvReaderImpl(String fileName) throws IOException {
        this.fileWithQuestions = new ClassPathResource(fileName);
//        this.scanner = new Scanner(fileWithQuestions.getFile()).useDelimiter("\n");
        this.scanner = new Scanner(fileWithQuestions.getInputStream()).useDelimiter("\n");
    }

}
