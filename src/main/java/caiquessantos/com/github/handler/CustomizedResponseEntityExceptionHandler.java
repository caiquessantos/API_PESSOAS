/**
 * Classe que atua como um manipulador de exceções personalizado em um aplicativo Spring. 
 * Essa classe estende a classe ResponseEntityExceptionHandler do Spring Framework e faz uso 
 * de anotações para lidar com exceções de forma personalizada.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.handler;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import caiquessantos.com.github.exceptions.ExceptionResponse;
import caiquessantos.com.github.exceptions.ResourceNotFoundExeption;

/**
 * @ControllerAdvice é usada em aplicativos Spring para fornecer tratamento global de exceções.
 * */
@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

    /**
     * Manipulador de exceções para todas as exceções genéricas.
     * Retorna uma resposta com um código de status HTTP 500 (INTERNAL_SERVER_ERROR).
     *
     * @param ex A exceção que ocorreu.
     * @param web A solicitação da web associada à exceção.
     * @return Uma resposta personalizada com informações de exceção.
     */
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex, WebRequest web){
		ExceptionResponse exrp = new ExceptionResponse(new Date(), ex.getMessage(), web.getDescription(false));
		
		return new ResponseEntity<>(exrp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
    /**
     * Manipulador de exceções para a exceção de recurso não encontrado.
     * Retorna uma resposta com um código de status HTTP 404 (NOT_FOUND).
     *
     * @param ex A exceção de recurso não encontrado que ocorreu.
     * @param web A solicitação da web associada à exceção.
     * @return Uma resposta personalizada com informações de exceção.
     */
	@ExceptionHandler(ResourceNotFoundExeption.class)
	public final ResponseEntity<ExceptionResponse> handleNotFoundExceptions(Exception ex, WebRequest web){
		ExceptionResponse exrp = new ExceptionResponse(new Date(), ex.getMessage(), web.getDescription(false));
		
		return new ResponseEntity<>(exrp, HttpStatus.NOT_FOUND);
	}

}
