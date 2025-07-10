package dto.question;

import java.util.List;

import lombok.Data;

@Data
public class QuestionWrapper {

	private Long id;
    private String questionText;
    private List<String> options;
}
