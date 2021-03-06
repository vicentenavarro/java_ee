package modelos;

/**
 * 
 * @author Vicente Navarro Garc�a
 *
 */

public class Viajes {
	
	/**
	 * codigo identificador del viaje
	 */
	private int id;
	
	/**
	 * Destino del viajes
	 */
	
	private String destino;
	
	/**
	 * Duraci�n del viaje en d�as
	 */
	
	private int duracion;
	
	/**
	 * Precio de viaje con decimales
	 */
	
	private double precio;
	
	/**
	 * Contructor vacio
	 */
	public Viajes(){
		
	}
	
	public Viajes(int id, String destino, int duracion, double precio){
		this.id=id;
		this.destino=destino;
		this.duracion=duracion;
		this.precio=precio;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
