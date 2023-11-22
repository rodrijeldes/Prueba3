package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DB.conexion;


public class DaoLogin {

	public static int validar(String usuario, String clave) {
		Connection con;
		conexion cn = new conexion();
		
		PreparedStatement ps;
		ResultSet re;
		String user ="";
		int valido = 0;
		String sql = "Select * from db.Prueba2 where usuario = ? and clave ?";
		try {
		
			con = cn.getConnection();
			ps =con.prepareStatement(sql);
			ps.setString(1,usuario);
			ps.setString(2,clave);
			re = ps.executeQuery();
			while(re.next()) {
				user = re.getString("usuario");
			}
			if(user.equals("admin")) {
				valido = 1;
			}
			else {valido = 0;}
		}
		catch (Exception ex){
			return valido;
		}
		return valido;
	}
}
