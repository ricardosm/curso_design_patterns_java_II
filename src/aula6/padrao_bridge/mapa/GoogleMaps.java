package aula6.padrao_bridge.mapa;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.sun.org.apache.xerces.internal.util.URI.MalformedURIException;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		try {
			String googleMaps = "http://maps.google.com.br/maps?q=" + rua;
			URL url = new URL(googleMaps);
			InputStream openStream = url.openStream();
			
			// lógica
			
			return "mapa";
		} catch(MalformedURIException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
