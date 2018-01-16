package aula4.padrao_interpreter.calculadora;

public class Divisao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double avalia() {
		return esquerda.avalia() / direita.avalia();
	}

}
