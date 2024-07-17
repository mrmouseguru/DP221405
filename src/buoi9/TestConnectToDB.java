package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnectToDB {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //tải driver vào chương trình
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");

        //tạo kết nối đến cơ sở dữ liệu MySQL testdb 
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "12345678";
        connection =  DriverManager.getConnection(url, user, password);
        
        System.out.println(connection.toString());
    }

}
