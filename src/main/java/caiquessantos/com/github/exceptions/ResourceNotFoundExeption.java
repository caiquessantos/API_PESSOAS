/**
 * Classe que representa uma exceção personalizada que deve ser 
 * lançada quando um recurso não é encontrado.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundExeption extends RuntimeException{
	
    /**
     * Construtor da classe para criar uma instância de ResourceNotFoundException 
     * com uma mensagem de erro.
     *
     * @param message A mensagem de erro que descreve a exceção.
     */
	public ResourceNotFoundExeption(String string) {
		super(string);
	}

	private static final long serialVersionUID = 1L;
}
