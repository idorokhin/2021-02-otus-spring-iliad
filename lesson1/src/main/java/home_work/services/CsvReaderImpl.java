package home_work.services;

import lombok.Getter;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@Getter
public class CsvReaderImpl implements CsvReader{

    private final File fileWithQuestions;
    private final Scanner scanner;

    public CsvReaderImpl(String fileName) throws FileNotFoundException {
        this.fileWithQuestions = ResourceUtils.getFile("classpath:" + fileName);
        this.scanner = new Scanner(fileWithQuestions).useDelimiter("\n");
    }

}
