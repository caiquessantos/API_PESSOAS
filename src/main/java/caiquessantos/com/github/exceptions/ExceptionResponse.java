/**
 * Classe de modelo das exceções.
 * 
 * Esta classe representa uma resposta de exceção que contém informações 
 * sobre um erro ocorrido no aplicativo.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.exceptions;


import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date data;
	private String menssagem;
	private String details;

    /**
     * Construtor da classe para criar uma instância de ExceptionResponse 
     * com informações específicas.
     *
     * @param data Data e hora em que a exceção ocorreu.
     * @param menssagem Mensagem de erro ou descrição da exceção.
     * @param details Detalhes adicionais sobre a exceção.
     */
	public ExceptionResponse(Date data, String menssagem, String details) {
		this.data = data;
		this.menssagem = menssagem;
		this.details = details;
	}

    /**
     * Obtém a data e hora em que a exceção ocorreu.
     *
     * @return Data e hora da exceção.
     */
	public Date getData() {
		return data;
	}
	
    /**
     * Obtém a mensagem de erro ou descrição da exceção.
     *
     * @return Mensagem de erro.
     */
	public String getMenssagem() {
		return menssagem;
	}
	
    /**
     * Obtém detalhes adicionais sobre a exceção.
     *
     * @return Detalhes da exceção.
     */
	public String getDetails() {
		return details;
	}
	
}
