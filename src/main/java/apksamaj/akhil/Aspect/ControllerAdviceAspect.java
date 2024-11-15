package apksamaj.akhil.Aspect;

import javax.security.sasl.AuthenticationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerAdviceAspect {

	

    // Handle AuthenticationException for Unauthorized (401) responses
    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<String> handleAuthenticationException(AuthenticationException ex) {
       System.out.println("hello go in every class");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                             .body("Unauthorized: " + ex.getMessage());
	
}
    @ExceptionHandler({HttpMessageNotReadableException.class, HttpMessageNotWritableException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST) // Return a 400 Bad Request
    public ResponseEntity<String> handleJsonFormatException(Exception e) {
        // You can log the exception or provide a more detailed message
        return new ResponseEntity<>("Invalid JSON format: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        // Log the exception
        ex.printStackTrace();

        // Return a 400 Bad Request status with a specific message
        return new ResponseEntity<>("Invalid input provided: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource Not Found")
    public class ResourceNotFoundException extends RuntimeException {
        public ResourceNotFoundException(String message) {
            super(message);
            
        }
    
    }
}
