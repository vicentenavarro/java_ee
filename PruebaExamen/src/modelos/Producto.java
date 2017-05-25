package modelos;

import java.io.Serializable;

public class Producto  implements Serializable{
	
	public static final long serialVersionUID=1L;//Número de la version del objeto.
	//Necesario si es serializable
	
	
	/**
	 * Id del producto
	 */
	private int idProducto;
	/**
	 * Nombre del producto
	 */
	private String nombre;
	/**
	 * Precio de producto
	 */
	private double precio;
	
	public Producto(){
		
	}
	/**
	 * 
	 * @param id_producto
	 * @param nombre
	 * @param precio
	 */
	public Producto(int idProducto,String nombre,double precio){
		this.idProducto=idProducto;
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
