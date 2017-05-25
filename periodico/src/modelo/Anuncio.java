package modelo;

public class Anuncio {
	
	/**
	 * Identificador de los anuncios es autoincrementable
	 */
	private int id;
	
	/**
	 * Texto del anuncio
	 */
	private String texto;
	
	/**
	 * Contructor vacio para poder utilizar como Beans
	 */
	public Anuncio(){
		
	}
	public Anuncio(int id,String texto){
		
		this.id=id;
		this.texto=texto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
}
