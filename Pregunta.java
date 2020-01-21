package zzJuegoTriviaULTIMO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pregunta {
	private static List<Respuesta> listaRespuestas;
	private String textoPregunta;
	
	public Pregunta(String unTextoPregunta) {
		listaRespuestas = new ArrayList <Respuesta>();
		textoPregunta = unTextoPregunta;
	}

	public static List<Respuesta> getListaRespuestas() {
		return listaRespuestas;
	}

	public void setListaRespuestas(List<Respuesta> listaRespuestas) {
		this.listaRespuestas = listaRespuestas;
	}

	public String getTextoPregunta() {
		return textoPregunta;
	}

	public void setTextoPregunta(String textoPregunta) {
		this.textoPregunta = textoPregunta;	
	}
	
	public void agregarRespuesta (Respuesta unaRespuesta) {
        listaRespuestas.add(unaRespuesta);
        System.out.println("Se agrego con exito una respuesta a la lista de respuestas");
	}
	
	public void removerRespuesta (Integer id) {
		listaRespuestas.remove(id);
	}
	

	public static boolean correctaIncorrecta (Integer respuesta) {
		return getListaRespuestas().get(respuesta).getEsCorrecta() != 0;
	}
	
	
}
