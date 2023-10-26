/**
 * Classe responsável por fornecer operações relacionadas à entidade Person em um aplicativo Spring.
 * Esta classe de serviço fornece operações relacionadas à entidade Person.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.services;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import caiquessantos.com.github.data.vo.v1.PersonVO;
import caiquessantos.com.github.exceptions.ResourceNotFoundExeption;
import caiquessantos.com.github.mapper.DozerMapper;
import caiquessantos.com.github.model.Person;
import caiquessantos.com.github.repositories.PersonRepository;

@Service
public class PersonServices {
	
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	/**
	 * Injeção do repositório criado
	 * */
	@Autowired
	private PersonRepository pr;
	
	/**
	 * Cria uma nova pessoa com base nos dados fornecidos em um objeto PersonVO.
	 *
	 * @param person O objeto PersonVO contendo os dados da pessoa a ser criada.
	 * @return Um objeto PersonVO que representa a pessoa criada.
	 */
	public PersonVO createPerson(PersonVO person) {
		
		logger.info("Criando uma nova pessoa");
		
		var entity = DozerMapper.transformarObjeto(person, Person.class);
		pr.save(entity);
		
		var entityVO = DozerMapper.transformarObjeto(entity, PersonVO.class);
		return entityVO;
	}

	/**
	 * Atualiza os dados de uma pessoa com base nas informações fornecidas em um objeto PersonVO.
	 *
	 * @param person O objeto PersonVO contendo os dados da pessoa a ser atualizada.
	 * @return Um objeto PersonVO que representa a pessoa atualizada.
	 * @throws ResourceNotFoundException se a pessoa com o ID especificado não for encontrada.
	 */
	public PersonVO updatePerson(PersonVO person) {
		
		logger.info("Atualizando uma pessoa");
		
		var entity = pr.findById(person.getId()).orElseThrow(()-> new ResourceNotFoundExeption("Nada encontrado"));
		
		entity.setNome(person.getNome());
		entity.setSobrenome(person.getSobrenome());
		entity.setEndereco(person.getEndereco());
		entity.setIdade(person.getIdade());
		entity.setGenero(person.getGenero());
		pr.save(entity);
		
		var entityVO = DozerMapper.transformarObjeto(entity, PersonVO.class);
		return entityVO;
	}

	/**
	 * Recupera todas as pessoas do banco de dados e as converte em uma lista de objetos PersonVO.
	 *
	 * @return Uma lista de objetos PersonVO que representa todas as pessoas no banco de dados.
	 */	
	public List<PersonVO> findALL() {
		
		logger.info("Encontrando todas as pessoas");
		
		return DozerMapper.transformarObjetos(pr.findAll(), PersonVO.class);
	}

	/**
	 * Exclui uma pessoa com base no ID fornecido.
	 *
	 * @param id O ID da pessoa a ser excluída.
	 * @throws ResourceNotFoundException se a pessoa com o ID especificado não for encontrada.
	 */
	public void delete(Long id) {
		
		logger.info("Deletando uma pessoa");
		
		var entity = pr.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Nada encontrado"));
		pr.delete(entity);
		
	}

	/**
	 * Encontra uma pessoa com base no ID fornecido e a converte em um objeto PersonVO.
	 *
	 * @param id O ID da pessoa a ser encontrada.
	 * @return Um objeto PersonVO que representa a pessoa encontrada.
	 * @throws ResourceNotFoundException se a pessoa com o ID especificado não for encontrada.
	 */
	public PersonVO finByID(Long id) {
		
		logger.info("Encontrando uma pessoa");
		
		var entity = pr.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Nada encontrado"));
		
		return DozerMapper.transformarObjeto(entity, PersonVO.class);
	}

}
