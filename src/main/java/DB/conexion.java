package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
	
    Connection con;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Prueba2?serverTimezone=UTC","root","root");
		}
		catch (Exception ex){}
		return con;
	}
}
