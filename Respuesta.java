package zzJuegoTriviaULTIMO;

public class Respuesta {
	private String textoRespuesta;
	private Integer esCorrecta;
	
	public Respuesta(String unTextoRespuesta, Integer unaEsCorrecta) {
		textoRespuesta = unTextoRespuesta;
		esCorrecta = unaEsCorrecta;
	}

	public String getTextoRespuesta() {
		return textoRespuesta;
	}

	public void setTextoRespuesta(String textoRespuesta) {
		this.textoRespuesta = textoRespuesta;
	}

	public Integer getEsCorrecta() {
		return esCorrecta;
	}

	public void setEsCorrecta(Integer esCorrecta) {
		this.esCorrecta = esCorrecta;
	}
	
	
	
	
}
