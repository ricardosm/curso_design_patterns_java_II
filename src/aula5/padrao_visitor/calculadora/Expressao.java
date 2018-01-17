package aula5.padrao_visitor.calculadora;

public interface Expressao {
	
	double avalia();
	void aceita(Visitor visitor);
}
