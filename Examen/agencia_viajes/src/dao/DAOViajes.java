package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DB;
import modelos.Viajes;

public class DAOViajes {
	
	/**
	 * Devuelve el listado de viajes
	 * @return
	 */

	public ArrayList<Viajes> listar(){
		ArrayList<Viajes> lista=new ArrayList<Viajes>();
		
		String sql="select * from viajes";
		try(Connection con=DB.getConexion();
		    Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);){
			
			
			while(rs.next()){
				Viajes a=new Viajes(rs.getInt("id"),rs.getString("destino"),rs.getInt("duracion"),rs.getDouble("precio"));
				lista.add(a);
			}
			
			
			
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		
		return lista;
	}
	/**
	 * Array para buscar el destino introduciendo un destino a buscar
	 * @param destino
	 * @return
	 */
	public ArrayList<Viajes> buscar(String destino){
		ArrayList<Viajes> lista=new ArrayList<Viajes>();
		
		String sql="select * from viajes where destino like ?";
		try(Connection con=DB.getConexion();
		    PreparedStatement stm=con.prepareStatement(sql)){
			
			stm.setString(1,"%"+destino+"%");
			
			ResultSet rs=stm.executeQuery();
			while(rs.next()){
				Viajes a=new Viajes(rs.getInt("id"),rs.getString("destino"),rs.getInt("duracion"),rs.getDouble("precio"));
				lista.add(a);
			}
			rs.close();
			
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		System.out.println(lista);
		return lista;
	} 
	/**
	 * Selecionara los favoritos buscados por el parametro destino
	 * @param destino
	 * @return
	 */
	public Viajes getViajes(String destino){
		Viajes a=null;
		
		String sql="select * from viajes where destino=?";
		
		try(Connection con=DB.getConexion();
			PreparedStatement stm=con.prepareStatement(sql)){
			
			stm.setString(1,destino);
			ResultSet rs=stm.executeQuery();
			if(rs.next()){
				a=new Viajes(rs.getInt("id"),destino,rs.getInt("duracion"),rs.getDouble("precio"));
			}
			rs.close();
			
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		
		return a;
	}
}
