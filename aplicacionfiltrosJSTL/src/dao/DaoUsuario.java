package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DB;
import modelos.UsuarioBean;

public class DaoUsuario {
	
	
	
	public ResultadoCRUD insertar(UsuarioBean u, String password){
		
		ResultadoCRUD r=ResultadoCRUD.ERROR;
		
		String sql="insert  ignore into datos (usuario,contraseña,edad values (?,?,?)";
		try(Connection con=DB.getConexion();
				PreparedStatement pstm=con.prepareStatement(sql);){
			
				pstm.setString(1,u.getNombre());
				pstm.setString(2,password);
				pstm.setInt(3, u.getEdad());
				int n =pstm.executeUpdate();
				r=ResultadoCRUD.OK;
				
				if(n>0){
					r=ResultadoCRUD.OK;
				}
				else{
					r=ResultadoCRUD.YA_EXISTE;
				}
		}
		catch(SQLException sqle){
			System.out.println("El fallo");
		}
		return r;
	}
	
	public ArrayList<UsuarioBean> listar(){
		ArrayList<UsuarioBean> r=new ArrayList<UsuarioBean>();
		
		String sql="select nombre,edad fron usuario";
		
		try(Connection con=DB.getConexion();
				Statement stm=con.createStatement()){
				
				ResultSet rs=stm.executeQuery(sql);
				while(rs.next()){
					UsuarioBean u=new UsuarioBean(rs.getString("nombre"),rs.getInt("edad"));
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
