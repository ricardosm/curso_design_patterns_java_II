package aula6.padrao_bridge.mapa;


/*
 *  O programa utiliza a interface Mapa. Essa interface � uma
 *  ponto para a implementa��o concreta.
 *  
 *  O nome desse padr�o de projeto �: bridge.
 * 
 * 
 */

public class Programa {
	
	public static void main(String[] args) {
		Mapa mapa = new GoogleMaps();
		String mapaRua = mapa.devolveMapa("rua vergueiro");
	}
}
