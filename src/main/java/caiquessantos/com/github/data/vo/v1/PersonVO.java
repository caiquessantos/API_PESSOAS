/**
 * Classe de modelo VO da entidade da aplicação.
 * Esta classe representa um objeto de transferência de dados (DTO) 
 * para informações sobre uma pessoa.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.data.vo.v1;

import java.io.Serializable;
import java.util.Objects;

public class PersonVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String Nome;
	private String Sobrenome;
	private String Genero;
	private String Idade;
	private String Endereco;
	
    /**
     * Construtor padrão da classe.
     */
	public PersonVO() {
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
		Idade = idade;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Endereco, Genero, Idade, Nome, Sobrenome, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonVO other = (PersonVO) obj;
		return Objects.equals(Endereco, other.Endereco) && Objects.equals(Genero, other.Genero)
				&& Objects.equals(Idade, other.Idade) && Objects.equals(Nome, other.Nome)
				&& Objects.equals(Sobrenome, other.Sobrenome) && Objects.equals(id, other.id);
	}	
	
}

