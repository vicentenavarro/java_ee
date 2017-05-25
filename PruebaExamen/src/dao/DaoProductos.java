package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DB;
import modelos.Producto;


public class DaoProductos implements Serializable{
	
	public static final long serialVersionUID=1L;
	
	public Producto getProducto(int idProductos){
		Producto p=null;
		
		String sql="select nombre,precio from prodcutos where id=?";
		
		try(Connection con=DB.getConexion();PreparedStatement ps=con.prepareStatement(sql);){
			
			ps.setInt(1, idProductos);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				p=new Producto(idProductos,rs.getString("nombre"),rs.getDouble("precio"));
			}
			}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return p;
	}
	
	public ArrayList<Producto> listar(){
		ArrayList<Producto> r=new ArrayList<Producto>();
		
		String sql="select * from productos by id as";
				
		try(Connection con=DB.getConexion();
				Statement stm=con.createStatement()){
				
				ResultSet rs=stm.executeQuery(sql);
				while(rs.next()){
					Producto u=new Producto(rs.getInt("id_producto"),rs.getString("nombre"),rs.getDouble("precio"));
					r.add(u);
				}
				rs.close();
	}
		catch(SQLException sqle){
			System.out.println("Fallo en la inserción del usuario");
		}
		return r;
	}
	

}
