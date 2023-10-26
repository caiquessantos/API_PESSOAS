/**
 * Classe de modelo da entidade pessoa.
 * Esta classe representa uma entidade JPA para informações de uma pessoa.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.model;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false, length = 20)
	private String Nome;
	
	@Column(name = "sobrenome", nullable = false, length = 40)
	private String Sobrenome;
	
	@Column(name = "genero", nullable = false, length = 20)
	private String Genero;
	
	@Column(name = "idade", nullable = false, length = 3)
	private String Idade;
	
	@Column(name = "endereco", nullable = false, length = 100)
	private String Endereco;

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getIdade() {
		return Idade;
	}

	public void setIdade(String idade) {
		this.Idade = idade;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Endereco, Genero, Nome, Sobrenome, id, Idade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(Endereco, other.Endereco) && Objects.equals(Genero, other.Genero)
				&& Objects.equals(Nome, other.Nome) && Objects.equals(Sobrenome, other.Sobrenome)
				&& Objects.equals(id, other.id) && Objects.equals(Idade, other.Idade);
	}
	
}
