package reponse;

import java.time.LocalDateTime;

public class ApiResponse<T> {

	private boolean success;
	private String message;
	private T data;
	private LocalDateTime timestamp;

	public ApiResponse() {
		this.timestamp = LocalDateTime.now();
	}

	public ApiResponse(boolean success, String message, T data) {
		this();
		this.success = success;
		this.message = message;
		this.data = data;
	}

	// Static helper methods
	public static <T> ApiResponse<T> success(String message, T data) {
		return new ApiResponse<>(true, message, data);
	}

	public static <T> ApiResponse<T> failure(String message, T data) {
		return new ApiResponse<>(false, message, data);
	}

	// Getters and Setters
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
