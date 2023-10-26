/**
 * Interface JPA
 * Esta é uma interface de repositório do Spring Data JPA para a entidade Person.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import caiquessantos.com.github.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
