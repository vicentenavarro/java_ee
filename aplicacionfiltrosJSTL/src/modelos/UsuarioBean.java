package modelos;

import java.io.Serializable;

public class UsuarioBean implements Serializable {
	
	public static final long serialVersionUID=1L;//Número de la version del objeto.
	//Necesario si es serializable
	
	/**
	 * Nombre login
	 */
	private String nombre;
	/**
	 * Edad de usuario
	 */
	private int edad;
	
	/**
	 * 
	 * @param nombre 
	 * @param edad 
	 */
	
	public UsuarioBean(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	public UsuarioBean(){
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
