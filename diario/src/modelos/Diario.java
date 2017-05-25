package modelos;

import java.io.Serializable;
import java.util.Date;

public class Diario implements Serializable {

	public static final long serialVersionUID=1L;//Número de la version del objeto.
	//Necesario si es serializable
	
	private int id;
	private String nombreUsuario;
	private Date fecha;
	private String comentario;
	
	public Diario(){
		
	}
	
	public Diario(int id, String nombreUsuario, Date fecha, String comentario){
		
		this.id=id;
		this.nombreUsuario=nombreUsuario;
		this.fecha=fecha;
		this.comentario=comentario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
