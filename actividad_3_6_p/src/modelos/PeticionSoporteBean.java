package modelos;

import java.io.Serializable;

public class PeticionSoporteBean implements Serializable{
	private static final long serialVersionUID=1L;
	
	/**
	 * Email que piede el formulario
	 */
	private String email;
	/**
	 * Sistema operativo
	 */
	
	private String sistema;
	/**
	 * Software para se solicita el poblemas
	 */
	
	private String software;
	/**
	 * Problema que tiene el cliente
	 */
	
	private String problema;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sOperativo) {
		this.sistema = sOperativo;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	
}
