package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DB;
import modelos.Diario;

public class DAODiario {

	public ArrayList<Diario> listar(){
		ArrayList<Diario> lista=new ArrayList<Diario>();
		
		String sql="select nombreUsuario,fecha,comentario from diario order by fecha asc";
		try(Connection con=DB.getConexion();
		    Statement st=con.createStatement()){
			
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				Diario p=new Diario(rs.getInt("id"),rs.getString("nombreUsuario"),rs.getDate("fecha"),rs.getString("comentario"));
				lista.add(p);
			}
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		
		return lista;
	}
}
