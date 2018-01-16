package aula4.padrao_interpreter.calculadora;

public class Numero implements Expressao {
	
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int avalia() {
		return numero;
	}

}
