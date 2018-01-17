package aula6.padrao_bridge.mapa;


/*
 *  O programa utiliza a interface Mapa. Essa interface é uma
 *  ponto para a implementação concreta.
 *  
 *  O nome desse padrão de projeto é: bridge.
 * 
 * 
 */

public class Programa {
	
	public static void main(String[] args) {
		Mapa mapa = new GoogleMaps();
		String mapaRua = mapa.devolveMapa("rua vergueiro");
	}
}
