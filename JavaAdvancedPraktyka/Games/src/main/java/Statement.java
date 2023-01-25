import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Statement {

    public void createTable() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/books","root","123123");
        String createTable = """
                CREATE TABLE games (
                id int AUTO_INCREMENT PRIMARY KEY,
                title varchar(255) NOT NULL,
                price int NOT NULL,
                platform varchar(255) NOT NULL
                
                );
                """;
        connection.createStatement().execute(createTable);
    }
    public void addGames(Game game){

    }

    }
}
