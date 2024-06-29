import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private Connection connection;

	public Database() {
		// Constructor
	}




	public int connect() {
		try {
			String url = "jdbc:postgresql://localhost:5432/test";
			String user = "postgres";
			String password = "bilal";
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the database.");
			return 1; // success
		} catch (SQLException e) {
			e.printStackTrace();
			return 0; // failure
		}
	}

	public int disconnect() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("Disconnected from the database.");
			}
			return 1; // success
		} catch (SQLException e) {
			e.printStackTrace();
			return 0; // failure
		}
	}
}
