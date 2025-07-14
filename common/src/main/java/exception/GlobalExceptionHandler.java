package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import reponse.ApiResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	// Handle custom exception
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse<Object>> handleResourceNotFound(ResourceNotFoundException ex) {
		ApiResponse<Object> response = ApiResponse.failure(ex.getMessage(), null);
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

	// Handle common bad request errors
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ApiResponse<Object>> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
		String message = "Invalid input: " + ex.getName();
		ApiResponse<Object> response = ApiResponse.failure(message, null);
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

	// Handle general exceptions
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse<Object>> handleGeneralException(Exception ex) {
		ex.printStackTrace(); // Optional: Log stack trace
		ApiResponse<Object> response = ApiResponse.failure("An error occurred", null);
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
