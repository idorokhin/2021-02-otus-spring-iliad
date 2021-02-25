package home_work.Entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

// описывает структуру источника
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Question {

    private final String lineQuestion;
    private final String lineAnswer;

}
