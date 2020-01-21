package zzJuegoTriviaULTIMO;


import java.util.List;
import java.util.Random;

public class Partida {
	private Integer numeroPartida;
	private Usuario usuario;
	private Integer puntos = 0;
	
	public Partida(Integer unNumeroPartida, Usuario unUsuario, Integer unosPuntos) { 
		numeroPartida = unNumeroPartida;
		usuario = unUsuario;
		puntos = unosPuntos;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getNumeroPartida() {
		return numeroPartida;
	}

	public void setNumeroPartida(Integer numeroPartida) {
		this.numeroPartida = numeroPartida;
	}
	
	
	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

	
	public void iniciarPartida() {
		System.out.println("BIENVENIDO A JUEGOTRIVIA");
	}
	
	
	public void sumarPuntos (Integer respuesta) {
		if (Pregunta.correctaIncorrecta(respuesta)) {
				puntos = puntos + 10;
			} else {System.out.println("No suma puntos");
			
			}
		}
	
    
	//RANDOM CATEGORIA
	public void randomCategoria(){
			Integer catAleatoria;
			Random categoriaAleatoria = new Random();
			catAleatoria = (1+categoriaAleatoria.nextInt(6+1)-1);
		}
	

	
	}
	
	

