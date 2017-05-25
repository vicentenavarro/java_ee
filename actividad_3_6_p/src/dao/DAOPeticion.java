package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import modelos.PeticionSoporteBean;

public class DAOPeticion  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public ResultadoCRUD create(PeticionSoporteBean p){
		ResultadoCRUD r=ResultadoCRUD.ERROR;
		
		String sql="insert into soporte (email,software,sistema,problema"
				+ "values (?,?,?,?)";
		try(Connection con=DB.getConexion();
	    PreparedStatement pstm=con.prepareStatement(sql);){
			pstm.setString(1, p.getEmail());
			pstm.setString(2, p.getSoftware());
			pstm.setString(3, p.getSoftware());
			pstm.setString(4, p.getProblema());
		}
		catch(SQLException sqle){
			
		}
		return r;	
		
	}
	
}
