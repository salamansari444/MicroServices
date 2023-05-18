package in.ineuron.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ineuron.exception.StockNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(StockNotFoundException.class)
	public ResponseEntity<String> handleStockNotFoundException(StockNotFoundException se){
		return new ResponseEntity<String>(se.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleGlobalException(Exception se){
		return new ResponseEntity<String>(se.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
