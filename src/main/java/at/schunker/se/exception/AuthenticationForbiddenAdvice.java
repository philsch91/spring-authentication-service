package at.schunker.se.exception;

import at.schunker.se.model.response.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AuthenticationForbiddenAdvice {
    @ResponseBody
    @ExceptionHandler(AuthenticationForbiddenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity authenticationForbiddenHandler(AuthenticationForbiddenException ex){
        GenericResponse response = new GenericResponse(403, ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.FORBIDDEN);
    }
}
