package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import db.DB;
import modelos.Entrada;
import modelos.Usuario;

public class DAOEntrada {

	public ArrayList<Entrada> listar(Usuario u){
		ArrayList<Entrada> lista=new ArrayList<Entrada>();
		
		String sql="select * from diario where usuario=? order by fecha desc";
		try(Connection con=DB.getConexion();
				PreparedStatement ps=con.prepareStatement(sql);){
			
			ps.setString(1, u.getNombre());
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()){
	//Hay que convertico a java.sqle.Date ya que esta definido como java.util
				java.sql.Date aux=rs.getDate("fecha");
				java.util.Date d=new java.util.Date(aux.getTime());
				Entrada e=new Entrada(u,rs.getString("texto"));
				lista.add(e);
				
			}
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		
		return lista;
	}
	
	public boolean crear(Entrada e){
		boolean r=false;
		
		String sql="insert into diario (usuario,texto,fecha) values (?,?,curdate())";
		try(Connection con=DB.getConexion();
				PreparedStatement ps=con.prepareStatement(sql);){
			
			ps.setString(1, e.getUsuario().getNombre());
			ps.setString(2, e.getTexto());
			
			ps.executeUpdate();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return r;
	}
	
	public boolean borrar(int id){
		boolean r=false;
		
		String sql="delete from diario where id=?";
		try(Connection con=DB.getConexion();
				PreparedStatement ps=con.prepareStatement(sql);){
			
			ps.setInt(1, id);;
			ps.executeUpdate();
			r=true;
		
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
			
		}
		return r;
	}
}
