package aula2.padrao_flyweight.notasMusicais.solucao.exercicioPratico;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  Faça a fábrica só instanciar a nota musical se realmente precisar. 
 *  Ou seja, na primeira vez que a nota for pedida, a nota é então instanciada.
 * 
 *  Implementação realizada utilizando reflexão.
 */

public class NotasMusicais {
	
	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	private static List<Class <? extends Nota>> clazzes;
	
	static {
		clazzes = Arrays.asList(
					Do.class,
					Re.class,
					Mi.class,
					Fa.class,
					Sol.class,
					La.class,
					Si.class
				);
	}
	
	public Nota pega(String nome) {
		try {
			if(!notas.containsKey(nome)) {
				for(Class<? extends Nota> clazz : clazzes) {
					if(clazz.getSimpleName().toLowerCase().equals(nome)) {
						notas.put(nome, (Nota) clazz.newInstance());
						break;
					}
				}
			}
			return notas.get(nome);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
