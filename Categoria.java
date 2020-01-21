package zzJuegoTriviaULTIMO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Categoria {
	private String nombreCategoria;
	private static Integer numeroCategoria;
	private List<Pregunta> listaPreguntas;

	public Categoria(String unNombreCategoria, Integer unNumeroCategoria) {
		nombreCategoria = unNombreCategoria;
		numeroCategoria = unNumeroCategoria;
		listaPreguntas = new ArrayList <Pregunta>();
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	
	public List<Pregunta> getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(List<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}
	
	public void agregarPregunta (Pregunta unaPregunta) {
		listaPreguntas.add(unaPregunta);
	}

	public void randomPregunta(Integer catAleatoria){
		if (catAleatoria >= 1 && catAleatoria < 7) {
			Random preguntaAleatoria = new Random();
			System.out.println((catAleatoria*10-10+1)+preguntaAleatoria.nextInt(((catAleatoria*10)+1)-(catAleatoria*10-10+1)));
		} else if (catAleatoria >= 7 || catAleatoria < 1) {
			System.out.println("Salir");
		}
	
	}
	
}
