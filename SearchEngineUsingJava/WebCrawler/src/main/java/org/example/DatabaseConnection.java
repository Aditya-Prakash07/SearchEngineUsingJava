package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection connection = null;
    private static Connection getConnection(String user, String password, String db){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/" + db + "?user=" + user + "&password=" + password);
        }catch(SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection(){
        if(connection != null)return connection;
        String user = "root";
        String password = "Aditya@07";
        String db = "searchengineapp";
        return getConnection(user,password, db);
    }

}
