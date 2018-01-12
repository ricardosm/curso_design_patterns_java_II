package aula2.padrao_flyweight.notasMusicais.solucao;

import java.util.HashMap;
import java.util.Map;

/*
 *  Solucao: Fazer com que seja instanciado apenas uma instância de cada nota,
 *	e reutilizar essa mesma instância. 
 *
 *	Para isso, basta criar uma classe, parecida com uma Factory, que 
 *	instanciará uma nota de cada, e sempre que alguem pedir uma nota,
 *	ela devolverá sempre a mesma instância.
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
