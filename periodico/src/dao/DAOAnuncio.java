package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DB;
import modelo.Anuncio;

public class DAOAnuncio {
	
	/**
	 * Array para mostrar los anuncios que contiene la base de
	 * datos.
	 * @return lista: Que devuelve todos los anuncios que hay en la base de datos.
	 */
	
	public ArrayList<Anuncio>listar(){
		
		ArrayList<Anuncio> lista=new ArrayList<Anuncio>();
		
		String sql="select * from anuncios";
		try(Connection con=DB.getConexion();
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery(sql);){
			while(rs.next()){
				Anuncio a=new Anuncio(rs.getInt("id"),rs.getString("texto"));
				lista.add(a);
			}
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			
		}
		return lista;
	}
	
	/**
	 *Array que guarda todos los anuncios que llevan la palabra que se introduce en
	 *el formulario 
	 * @param palabra
	 * @return lista: Devuelve la lista de anuncios
	 */
	public ArrayList<Anuncio> buscar(String palabra){
		ArrayList<Anuncio> lista=new ArrayList<Anuncio>();
		
		String sql="select * from anuncios where like ?";
		try(Connection con=DB.getConexion();
			PreparedStatement stm=con.prepareStatement(sql);){
			
			stm.setString(1, "%"+palabra+"%");
			ResultSet rs=stm.executeQuery();
			
			while(rs.next()){
				Anuncio a=new Anuncio(rs.getInt("id"),rs.getString("texto"));
				lista.add(a);
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			
		}
		return lista;
	}
	/**
	 * Lee los anuncios
	 * @param id
	 * @return
	 */
	public Anuncio getAnuncio(int id){
		Anuncio a=null;
		
		String sql="select texto from anuncios whete id=?";
		try(Connection con=DB.getConexion();
			PreparedStatement stm=con.prepareStatement(sql)){
			
			stm.setInt(1,id);
			ResultSet rs=stm.executeQuery();
			if(rs.next()){
				a=new Anuncio(id,rs.getString("texto"));
			}
			rs.close();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return a;
	}
	/**
	 *	Nos dira el número de anuncios que hay en la 
	 *base de datos
	 * @return n que es número de anuncios
	 */
	public int contar(){
		int n=0;
		String sql="select count(id) as n from anuncios";
		
		try(Connection con=DB.getConexion();
				Statement stm=con.createStatement();
				ResultSet rs=stm.executeQuery(sql);){
			rs.next();
			n=rs.getInt("n");
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return n;
	}

}
