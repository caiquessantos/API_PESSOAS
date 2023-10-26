/**
 * Classe utilitária para mapeamento de objetos usando a biblioteca Dozer.
 * Esta classe fornece métodos para realizar o mapeamento de objetos usando a biblioteca Dozer.
 * 
 * @author Caíque Santos Santana
 * @version 1.0
 * @since Release 1 da aplicação
 * 
 * */

package caiquessantos.com.github.mapper;

import java.util.ArrayList;
import java.util.List;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

public class DozerMapper {

	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    /**
     * Realiza o mapeamento de um objeto de origem para um objeto de destino.
     *
     * @param origem   O objeto de origem a ser mapeado.
     * @param destino  A classe de destino para o mapeamento.
     * @param <Origem> O tipo de objeto de origem.
     * @param <Destino> O tipo de objeto de destino.
     * @return O objeto de destino mapeado.
     */
	public static <Origem, Destino> Destino transformarObjeto(Origem origem,
			Class<Destino> destino) {
		return mapper.map(origem, destino);
	}
	
    /**
     * Realiza o mapeamento de uma lista de objetos de origem para uma lista de objetos de destino.
     *
     * @param origem   A lista de objetos de origem a ser mapeada.
     * @param destino  A classe de destino para o mapeamento.
     * @param <Origem> O tipo de objeto de origem.
     * @param <Destino> O tipo de objeto de destino.
     * @return Uma lista de objetos de destino mapeados.
     */
	public static <Origem, Destino> List<Destino> transformarObjetos(List<Origem> origem,
			Class<Destino> destino) {
		
		List<Destino> objetosDeDestino = new ArrayList<>();
		for (Origem o : origem) {
			objetosDeDestino.add(mapper.map(o, destino));
		}
		
		return objetosDeDestino;
	}
}
