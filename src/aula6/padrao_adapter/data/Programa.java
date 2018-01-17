package aula6.padrao_adapter.data;

import java.util.Calendar;

/*
 * 	Quando temos um conjunto de classes legadas, e achamos que seu uso 
 * 	vai "sujar o sistema". 
 * 	Podemos criar um "adaptador" que facilita a sua utilização.
 * 	Neste exemplo, criamos um "adaptador" para facilitar a utilização da
 * 	Api Calendar.
 * 
 * 	O nome desse padrão de projetos é Adapter. 
 * 
 */
public class Programa {
	
	public static void main(String[] args) {
		Relogio relogio = new RelogioDoSistema();
		Calendar dataAtual = relogio.dataAtual();
	}
}
