package dto.jwt;

import java.util.List;

import lombok.Data;

@Data
public class JwtResponse {

	private String token;
    private String type = "Bearer";
    private String username;
    private List<String> roles;
}
