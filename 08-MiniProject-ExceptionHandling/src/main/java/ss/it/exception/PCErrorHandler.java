package ss.it.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class PCErrorHandler {

	@ExceptionHandler(PCNotFoundException.class)
	public ResponseEntity<ErrorDetails> handlePCNotFound(PCNotFoundException pnf) {
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), pnf.getMessage(), "404 PC not found exception");
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllProblems(Exception e) {
		ErrorDetails details = new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Problem in execution");
		return new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
	}

}
