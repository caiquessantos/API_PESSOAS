/**
 * Classe de controlle geral da aplicação.
 * Este controlador fornece endpoints RESTful para criar, atualizar, buscar, listar e 
 * excluir objetos PersonVO. Ele interage com um serviço PersonServices para realizar
 * essas operações.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import caiquessantos.com.github.data.vo.v1.PersonVO;
import caiquessantos.com.github.services.PersonServices;

@RestController
@RequestMapping("/pessoas")
public class PersonController {

	/**
	 * @Autowired é uma anotação que injeta uma instância de PersonServices no 
	 * controlador. Isso permite que o controlador acesse os métodos e serviços 
	 * fornecidos por PersonServices.
	 * */
	@Autowired
	private PersonServices ps;
	
	/**
	 * Método responsável por criar uma nova pessoa.
	 * 
	 * @PostMapping é uma anotação que mapeia um método para responder a requisições 
	 * HTTP POST. Neste caso, o método createPerson é mapeado para a URL 
	 * "/pessoas/criar". Ele produz e consome dados no formato JSON.
	 * 
	 * @RequestBody indica que o corpo da requisição HTTP deve ser desserializado 
	 * em um objeto PersonVO. O método createPerson chama o serviço 
	 * ps.createPerson(person) para criar uma pessoa e retorna o resultado.
	 * 
	 * @param person - A pessoa que deverá ser criada
	 * @return PersonVO - A pessoa criada
	 * */
	@PostMapping(value = "/criar" ,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO createPerson(@RequestBody PersonVO person) {
		return ps.createPerson(person);
	}

	/**
	 * Método responsável por atualizar uma pessoa.
	 * 
	 * @PutMapping mapeia um método para responder a requisições HTTP PUT para a 
	 * URL "/pessoas/atualizar". Ele atualiza uma pessoa com base nos dados 
	 * fornecidos no corpo da requisição.
	 * 
	 * @RequestBody indica que o corpo da requisição HTTP deve ser desserializado 
	 * em um objeto PersonVO. O método updatePerson chama o serviço 
	 * ps.updatePerson(person) para atualizar uma pessoa e retorna o resultado.
	 * 
	 * @param person - A pessoa que deverá ser atualizada
	 * @return PersonVO - A pessoa atualizada
	 * */
	@PutMapping(value = "/atualizar",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO updatePerson(@RequestBody PersonVO person) {
		return ps.updatePerson(person);
	}
	
	/**
	 * Método responsável por listar todas as pessoas.
	 * 
	 * @GetMapping mapeia um método para responder a requisições HTTP GET 
	 * para a URL "/pessoas". Este método retorna uma lista de todas as pessoas.
	 * 
	 * @RequestBody indica que o corpo da requisição HTTP deve ser desserializado 
	 * em um objeto PersonVO. O método findALL chama o serviço 
	 * ps.findALL() para listar todas as pessoas e retorna o resultado.
	 * 
	 * @return List<PersonVO> - A lista de pessoas cadrastradas
	 * */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PersonVO> findALL() {
		return ps.findALL();
	}
	
	/**
	 * Método responsável por pesquisar por id.
	 * 
	 * @GetMapping mapeia um método para responder a requisições HTTP GET 
	 * para a URL "/pessoas/{id}", onde {id} é uma variável de caminho. 
	 * O valor de id é extraído da URL e passado como um parâmetro para o 
	 * método finByID(id), que busca e retorna uma pessoa com o ID especificado.
	 * 
	 * @RequestBody indica que o corpo da requisição HTTP deve ser desserializado 
	 * em um objeto PersonVO. O método findByID chama o serviço 
	 * ps.finByID(id) para listar uma pessoa pelo id e retorna o resultado.
	 * 
	 * @param id - O id da pessoa que deve ser encontrada
	 * @return PersonVO - A pessoa correspondente ao id
	 * */
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonVO findByID(@PathVariable(name = "id")Long id) {
		return ps.finByID(id);
	}
	
	/**
	 * Método responsável por deletar por id.
	 * 
	 * @DeleteMapping mapeia um método para responder a requisições HTTP DELETE para 
	 * a URL "/pessoas/deletar/{id}". Ele exclui uma pessoa com base no ID fornecido 
	 * e retorna uma resposta HTTP vazia (204 No Content) para indicar o sucesso da 
	 * exclusão.
	 * 
	 * @RequestBody indica que o corpo da requisição HTTP deve ser desserializado 
	 * em um objeto PersonVO. O método delete chama o serviço 
	 * ps.delete(id) para deletar uma pessoa pelo id e retorna o resultado.
	 * 
	 * @param id - O id da pessoa que deve ser deletada
	 * @return ResponseEntity.noContent().build() - A resposta responsiva a 
	 * remoção
	 * */
	@DeleteMapping(value = "/deletar/{id}")
	public ResponseEntity<?> delete(@PathVariable(name = "id")Long id){
		ps.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
