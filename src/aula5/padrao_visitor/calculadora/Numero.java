package aula5.padrao_visitor.calculadora;

public class Numero implements Expressao {
	
	private double numero;

	public Numero(double numero) {
		this.numero = numero;
	}
	
	@Override
	public double avalia() {
		return numero;
	}

	public double getNumero() {
		return this.numero;
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaNumero(this);
	}

}
