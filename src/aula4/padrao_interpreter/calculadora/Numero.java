package aula4.padrao_interpreter.calculadora;

public class Numero implements Expressao {
	
	private double numero;

	public Numero(double numero) {
		this.numero = numero;
	}
	
	@Override
	public double avalia() {
		return numero;
	}

}
