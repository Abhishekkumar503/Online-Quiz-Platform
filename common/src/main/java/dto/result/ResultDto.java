package dto.result;

import lombok.Data;

@Data
public class ResultDto {

	private Long id;
    private Long userId;
    private Long quizId;
    private Integer score;
    private Integer total;
}
