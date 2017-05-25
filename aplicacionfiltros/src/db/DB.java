package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DB {
	
	public static Connection getConexion(){
		Connection con=null;
		try{
			DataSource dataSource;
			
			Context initContext= new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			dataSource =(DataSource)envContext.lookup("jdbc/aplicacionfiltros_DB");
			con=dataSource.getConnection();
		}
		catch (NamingException e){
			e.printStackTrace();
		}
		catch(SQLException sqle){
			sqle.printStackTrace();
		}
		return con;
	}
	public static boolean estaOK(){
		boolean r=false;
		
		String sql="select curdate()";//curdate es la fecha actual
		try(Connection con=getConexion();
			Statement stm=con.createStatement();){
			
			ResultSet rs=stm.executeQuery(sql);
			r=rs.next();
			rs.close();
			
			
		}
		catch(SQLException sqle){
			System.out.println("Fallo en la conexion a la base de datos");
		}
		catch(NullPointerException nlpe){
			System.out.println("----------------");
		}
		
		return r;
	}

}
