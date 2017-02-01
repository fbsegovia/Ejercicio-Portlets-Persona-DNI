package modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Persona;

public class GestorPersonas {
	public static List<Persona> listaPersonas;

	static {
		listaPersonas = new ArrayList<>();

		Persona persona = new Persona();
		persona.setNombre("Lidia");
		persona.setDni("Y114154");
		persona.setTelefono("68755454");
		persona.setEdad(24);

		listaPersonas.add(persona);

		// aqui se crea nuevo espacio de memoria
		// un objeto es un espacio de memoria
		persona = new Persona();
		persona.setNombre("Juan");
		persona.setDni("Y99945W");
		persona.setTelefono("672841541");
		persona.setEdad(30);

		listaPersonas.add(persona);
	}

	public List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	/**
	 * 
	 * @param dni
	 * @return retornamos la persona si se encuentra en el array y null en caso
	 *         de no encontrarala
	 */
	public Persona buscarPorDNI(String dni) {
		for (Persona p : listaPersonas) {
			if (p.getDni().equals(dni)) {
				return p;
			}
		}
		return null;
	}

}
