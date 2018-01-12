package aula2.padrao_flyweight.notasMusicais.solucao;

import java.util.Arrays;
import java.util.List;

/*
 *	Solucao: Fazer com que seja instanciado apenas uma inst�ncia de cada nota,
 *	e reutilizar essa mesma inst�ncia. 
 *
 *	Para isso, basta criar uma classe, parecida com uma Factory, que 
 *	instanciar� uma nota de cada, e sempre que alguem pedir uma nota,
 *	ela devolver� sempre a mesma inst�ncia.
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
