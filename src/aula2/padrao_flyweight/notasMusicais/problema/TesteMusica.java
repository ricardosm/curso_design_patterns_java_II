package aula2.padrao_flyweight.notasMusicais.problema;

import java.util.Arrays;
import java.util.List;

/*
 * 	Problema: O c�digo abaixo � problem�tico. Em uma m�sica de verdade,
 * 	com milhares de notas musicais, seria necess�rio criar milhares de
 *	d�s, r�s, mis e f�s diferentes, consumindo muita mem�ria. 
 *
 *	Neste caso, todos os d�s s�o iguais; os r�s, os mis, e assim por diante.
 *
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
		List<Nota> musica = Arrays.asList(new Do(), new Re(), new Mi(), new Fa(), new Fa(), new Fa(), new Sol(), new La());
	}
}
