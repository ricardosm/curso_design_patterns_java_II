package aula5.padrao_visitor.calculadora;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public double avalia() {
		return Math.sqrt(expressao.avalia());
	}

	@Override
	public void aceita(Visitor visitor) {
		visitor.visitaRaizQuadrada(this);
	}

	public Expressao getExpressao() {
		return expressao;
	}
	
}
