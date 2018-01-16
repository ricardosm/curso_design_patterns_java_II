package aula4.padrao_interpreter.calculadora;

public class Programa {
	
	public static void main(String[] args) {

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));

        Expressao conta = new Soma(esquerda, direita);

        double resultado = conta.avalia();
        System.out.println(resultado);
    }
}
