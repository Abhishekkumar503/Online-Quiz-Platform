package dto.quiz;

import java.util.List;

import lombok.Data;

@Data
public class QuizDto {

	private Long id;
    private String title;
    private String description;
    private List<Long> questionIds;
}
