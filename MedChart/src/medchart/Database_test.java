package medchart;

/**
 *
 * @author amaya
 */
import java.sql.*;

public class Database_test {

    private Connection conn;
    private Statement statement;

    

    public Connection openConnection() {
        if (conn == null)
        {

            //url to database in xampp
            String url = "jdbs:mysql://localhost/";

            //database Name
            String dbName = "medchart_library";

            //mySQL jdbc driver class
            String driver = "com.mysql.jdbc.Driver";

            //our UserName
            String userName = "root";

            //Password left empty
            String password = "";

            try
            {
                Class.forName(driver);
                this.conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
            } catch (ClassNotFoundException | SQLException agle)
            {
                System.out.println("Connection Failed");
            }

        }
        return conn;
    }
}
