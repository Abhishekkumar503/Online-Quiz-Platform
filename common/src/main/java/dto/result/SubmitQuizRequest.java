package dto.result;

import java.util.Map;

import lombok.Data;
@Data
public class SubmitQuizRequest {

	private Long quizId;
    private Long userId;
    private Map<Long, String> answers;  // questionId -> answer
}
