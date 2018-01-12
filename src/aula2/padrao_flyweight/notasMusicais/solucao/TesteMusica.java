package aula2.padrao_flyweight.notasMusicais.solucao;

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
			
			notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("re"),    
            notas.pega("re"),
            
            notas.pega("do"),    
            notas.pega("sol"),    
            notas.pega("fa"),    
            notas.pega("mi"),    
            notas.pega("mi"),    
            notas.pega("mi"),
            
            notas.pega("do"),    
            notas.pega("re"),    
            notas.pega("mi"),    
            notas.pega("fa"),    
            notas.pega("fa"),    
            notas.pega("fa")				
		);
		
		Piano piano = new Piano();
	    piano.toca(doReMiFa);
				
	}
}
