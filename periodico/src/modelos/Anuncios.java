package modelos;

import java.io.Serializable;

public class Anuncios implements Serializable {

	public static final long serialVersionUID=1L;//Número de la version del objeto.
	//Necesario si es serializable
	
	private int id;
	private String texto;
	
	public Anuncios(){
		
	}
	
	public Anuncios(int id, String texto){
		this.id=id;
		this.texto=texto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {//Este metodo no lo vamos a usar
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
