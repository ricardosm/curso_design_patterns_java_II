package aula4.padrao_interpreter.calculadora;

public class RaizQuadrada implements Expressao {

	private Expressao expressao;

	public RaizQuadrada(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
	public double avalia() {
		return Math.sqrt(expressao.avalia());
	}

}
