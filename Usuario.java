package zzJuegoTriviaULTIMO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Usuario {
	private Integer id;
	private String userName;//cambiar en UML
	private String password;
	private String email;
	private String pais;
	private Date fechaDeNacimiento;
	private Integer dia;
	public Integer mes;
	public Integer anio;
	public Integer puntos; // puntos acumulados
	public Calendar fecha;
	private Integer avatar;//seleccionar del 1 al 5 para avatares
	
	public Usuario(Integer unId, String unUserName, String unPassword, String unEmail,Integer unAvatar, String unPais, Integer unDia, Integer unMes, Integer unAnio,Integer unPuntos) {
		id = unId;
		userName = unUserName;
		password = unPassword;
		email = unEmail;
		pais = unPais;
		dia = unDia;
		mes = unMes;
		anio = unAnio;
		puntos = unPuntos;
		avatar = unAvatar;
		fecha = new GregorianCalendar(unAnio,unMes,unDia);
	}
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	
	
}
