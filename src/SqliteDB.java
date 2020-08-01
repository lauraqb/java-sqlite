import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SqliteDB {
	Connection c = null;
	Statement stmt = null;
	SqliteDB() {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:myDb.sqlite");
			System.out.println("Connected to DB ok!");
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}
	
	public void listUsers() {
		try {
			this.stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Users");
			while(rs.next()) {
				int id = rs.getInt("id");
				String firstname = rs.getString("firstname");
				System.out.println(id + " " + firstname);
			}
		} catch (Exception e) {
			System.out.println("Error listUsers: " + e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			c.close();
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}
}
