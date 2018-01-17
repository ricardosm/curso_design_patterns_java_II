package aula6.padrao_adapter.data;

import java.util.Calendar;

/*
 * 	Quando temos um conjunto de classes legadas, e achamos que seu uso 
 * 	vai "sujar o sistema". 
 * 	Podemos criar um "adaptador" que facilita a sua utiliza��o.
 * 	Neste exemplo, criamos um "adaptador" para facilitar a utiliza��o da
 * 	Api Calendar.
 * 
 * 	O nome desse padr�o de projetos � Adapter. 
 * 
 */
public class Programa {
	
	public static void main(String[] args) {
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.dataAtual();
	}
}
