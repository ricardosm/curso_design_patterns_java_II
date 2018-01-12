package aula2.padrao_flyweight.notasMusicais.problema;

import java.util.Arrays;
import java.util.List;

/*
 * 	Problema: O código abaixo é problemático. Em uma música de verdade,
 * 	com milhares de notas musicais, seria necessário criar milhares de
 *	dós, rés, mis e fás diferentes, consumindo muita memória. 
 *
 *	Neste caso, todos os dós são iguais; os rés, os mis, e assim por diante.
 *
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
		List<Nota> musica = Arrays.asList(new Do(), new Re(), new Mi(), new Fa(), new Fa(), new Fa(), new Sol(), new La());
	}
}
