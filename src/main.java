
public class main {

	public static void main(String[] args) {
		SqliteDB db = new SqliteDB();
		db.listUsers();
		db.closeConnection();
	}

}
