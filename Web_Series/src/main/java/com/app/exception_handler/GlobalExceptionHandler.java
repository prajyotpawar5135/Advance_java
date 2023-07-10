package com.app.exception_handler;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//how to tell spring container following class is a spring
//beans containing common advice to all rest controllers 
//regarding centralised exception handling 

/*											@ResponseBody is for marshalling 
 * @RestController= @ControllerAdvice + @ResponseBody //added implicitly on ret types of the methods
 * we can use it in rest web service
 */
@RestControllerAdvice     //mandatory !!!
public class GlobalExceptionHandler {

	//can contain single/multiple exception handling methods
	//how to tell spring container ,following method is a exception handling method
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){	
		//convert List<FieldError>-->Map:fieldName,def mesg
		Map<String, String> map=e.getFieldErrors() //List<FieldErr>e
				.stream()   //Stream<FieldError>
				.collect(Collectors.toMap(f->f.getField(), f -> f.getDefaultMessage()));
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(e.getFieldErrors());
		
		//List<FieldError> getFieldErrors()
		//API ofFieldError class : getField: field name with errors,
		//						   getDefaultMessage : err msg
		
		
		
				}
	
}
