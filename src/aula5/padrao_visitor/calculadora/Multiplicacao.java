package aula5.padrao_visitor.calculadora;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public double avalia() {
		return esquerda.avalia() * direita.avalia();
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaMultiplicacao(this);
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}
	
	
}
