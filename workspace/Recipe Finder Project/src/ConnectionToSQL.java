import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToSQL {
	
public Connection connection;
	
	public ConnectionToSQL(){
		String url = "jdbc:mysql://localhost:3306/recipe_finder_database";
		String username = "root";
		String password = "AfnanCS460";
		
		
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}

}
	
}
