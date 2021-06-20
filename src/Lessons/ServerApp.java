package Lessons;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ServerApp {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connection;
        Statement stmt;

        new MyServer();




//        public static void connect() {
//            Class.forName("org.sqlite.JDBC");
//            connection = DriverManager.getConnection("jdbc:sqlite:javadb.db");
//            stmt = connection.createStatement();
//        }

    }
}
