package aula3.padrao_memento.contrato;

import java.util.Calendar;

public class Programa {
	
	public static void main(String[] args) {
		Historico historico = new Historico();
		
		Contrato c1 = new Contrato(Calendar.getInstance(), "Ricardo", TipoContrato.NOVO);
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		c1.avanca();
		historico.adiciona(c1.salvaEstado());
		
		System.out.println(historico.pega(3).getContrato().getTipo());
		System.out.println(historico.pega(2).getContrato().getTipo());
		System.out.println(historico.pega(1).getContrato().getTipo());
		System.out.println(historico.pega(0).getContrato().getTipo());
	}
}
