package aula5.padrao_visitor.calculadora;

public class Programa {
	
	public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));

        Soma somaUm = new Soma(esquerda, direita);
        
        Expressao raiz = new RaizQuadrada(new Numero(4));
        
        Soma somaDois = new Soma(somaUm, raiz);

        double resultado = somaDois.avalia();
        System.out.println(resultado);
        
        Visitor visitor = new Impressora();
        
        Visitor visitorImpressoraPreFixa = new ImpressoraPreFixa();
        
        visitor.visitaSoma(somaDois);
        System.out.println(" ");
        visitorImpressoraPreFixa.visitaSoma(somaDois);
    }
}
