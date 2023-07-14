package cimap.recursos_humanos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ApiException.class)
    @ResponseBody
    public ErrorResponse handleApiException(final ApiException ex) {

		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(ex.getMessage());

        return errorResponse;
    }
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ErrorResponse handleApiException(final MethodArgumentNotValidException ex) {
		
		BindingResult result =  ex.getBindingResult();
		StringBuilder stringBuilder = new StringBuilder();
		
		 for (FieldError error : result.getFieldErrors()) {
			stringBuilder.append(error.getField() +":" + error.getDefaultMessage() + " \n ");
		} 
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(stringBuilder.toString());

        return errorResponse;
    }
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(LoginException.class)
    @ResponseBody
    public ErrorResponse handleApiException(final LoginException ex) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(ex.getMessage());
        return errorResponse;
    }
	
	
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(SesionException.class)
    @ResponseBody
    public ErrorResponse handleApiException(final SesionException ex) {
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(ex.getMessage());
        return errorResponse;
    }
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public ErrorResponse handleThrowable(final Throwable ex) {

		ErrorResponse errorResponse = new ErrorResponse();		
		errorResponse.setMessage("Un error inesperado ha ocurrido en el sistema");
		ex.printStackTrace();
		return errorResponse;
    }
	
	
}
