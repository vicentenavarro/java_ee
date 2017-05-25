package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DB;
import modelos.Contactos;

public class DAOContactos {

		public ResultadoCRUD update(Contactos s){
			ResultadoCRUD r=ResultadoCRUD.ERROR;
			
			String sql="insert into lista (usuario,telefono) values (?,?)";
			
			try(Connection con=DB.getConexion();
					PreparedStatement stm=con.prepareStatement(sql);){
				stm.setString(1, s.getUsuario());
				stm.setString(2, s.getTelefono());
					int nAfectados=stm.executeUpdate();//para que solo te añada una linea de la tabla
					r=ResultadoCRUD.OK;
				
				
			}
			catch(SQLException sqle){
				sqle.printStackTrace();
			}
			return r;
		}
		
		public ArrayList<Contactos> listar(){
			ArrayList<Contactos> listado=new ArrayList<Contactos>();
			
			
			String sql="select * from lista";
			
			try(Connection con=DB.getConexion();
					Statement ps=con.createStatement();){
					ps.executeQuery(sql);
					ResultSet rs=ps.getResultSet();
				while(rs.next()){
					Contactos p=new Contactos(rs.getString("usuario"),rs.getString("telefono"));
					System.out.println(p);
					listado.add(p);
				}
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
			return listado;
		}
}
