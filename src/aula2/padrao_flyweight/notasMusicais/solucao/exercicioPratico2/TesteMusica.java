package aula2.padrao_flyweight.notasMusicais.solucao.exercicioPratico2;

import java.util.Arrays;
import java.util.List;

/*
 *	Solucao: Fazer com que seja instanciado apenas uma instância de cada nota,
 *	e reutilizar essa mesma instância. 
 *
 *	Para isso, basta criar uma classe, parecida com uma Factory, que 
 *	instanciará uma nota de cada, e sempre que alguem pedir uma nota,
 *	ela devolverá sempre a mesma instância.
 * 
 */

public class TesteMusica {
	
	public static void main(String[] args) {
		NotasMusicais notas = new NotasMusicais();
		List<Nota> doReMiFa = Arrays.asList(
			notas.pega("do"),
			notas.pega("re"),
			notas.pega("mi"),
			notas.pega("fa"),
			notas.pega("fa"),
			notas.pega("fa"),
			
			notas.pega("dosustenido"),
			notas.pega("resustenido"),
			notas.pega("misustenido"),
			notas.pega("fasustenido"),
			notas.pega("fasustenido"),
			notas.pega("fasustenido")
	
		);
		
		Piano piano = new Piano();
	    piano.toca(doReMiFa);
				
	}
}
