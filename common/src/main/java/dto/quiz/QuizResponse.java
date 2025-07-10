package dto.quiz;

import java.util.List;

import dto.question.QuestionWrapper;
import lombok.Data;

@Data
public class QuizResponse {

	private Long id;
    private String title;
    private List<QuestionWrapper> questions;
}
