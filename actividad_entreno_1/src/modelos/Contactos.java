package modelos;

public class Contactos {
	
	private String usuario;
	private String telefono;
	
	public Contactos(String usuario,String telefono){
		
		this.usuario=usuario;
		this.telefono=telefono;
	}

	
	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	
	
}
