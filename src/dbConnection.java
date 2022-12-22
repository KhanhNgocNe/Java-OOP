import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {

    static final String DB_URL="jdbc:mysql://localhost:3306/student";
    static final String USER = "root";
    static final String PASS = "Lightroom1!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
