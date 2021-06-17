package Lessons;

import java.io.*;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static Connection connection;
    public static Statement stmt;



    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {


        List<String> hstOut = new LinkedList<>();


        connection();
        try (Socket socket = new Socket("localhost", 8149)) {

            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);

            System.out.println("Введите сообщение...");

            while (true) {
                String message = sc.nextLine();
//                System.out.println("[Вы]: " + message);
//                dataOutputStream.writeUTF(message);
//                System.out.println("Клиент: " + message);
//                dataOutputStream.writeUTF(message);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    public static void connection() throws ClassNotFoundException, SQLException {
        connection = null;
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:chatHistory.db");

    }

    public static void createDB() throws SQLException {
        stmt = connection.createStatement();
        stmt.execute("DROP TABLE IF EXISTS chatHistory;");
        stmt.execute("CREATE TABLE IF NOT EXISTS chatHistory");
    }


    public static void CloseDB() throws ClassNotFoundException, SQLException {
        connection.close();
        //       connectionHistory.close();
        stmt.close();
    }




}
