package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;
import modelos.Usuario;

public class DAOUsuario {
	
	public boolean autenticar(Usuario u,String password){
		boolean r=false;
		
		String sql="select nombre from usuario where nombre=? and passwor=?";
		try(Connection con=DB.getConexion();
				PreparedStatement ps=con.prepareStatement(sql);){
			
			ps.setString(1, u.getNombre());
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				r=true;
			}
			rs.close();
			
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return r;
	}
		

}
