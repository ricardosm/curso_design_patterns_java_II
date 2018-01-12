package aula2.padrao_flyweight.notasMusicais.solucao;

import java.util.HashMap;
import java.util.Map;

/*
 *  Solucao: Fazer com que seja instanciado apenas uma inst�ncia de cada nota,
 *	e reutilizar essa mesma inst�ncia. 
 *
 *	Para isso, basta criar uma classe, parecida com uma Factory, que 
 *	instanciar� uma nota de cada, e sempre que alguem pedir uma nota,
 *	ela devolver� sempre a mesma inst�ncia.
 * 
 */

public class NotasMusicais {
	
	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	
	static {
		notas.put("do", new Do());
		notas.put("re", new Re());
		notas.put("mi", new Mi());
		notas.put("fa", new Fa());
		notas.put("sol", new Sol());
		notas.put("la", new La());
		notas.put("si", new Si());
	}
	
	public Nota pega(String nome) {
		return notas.get(nome);
	}

}
