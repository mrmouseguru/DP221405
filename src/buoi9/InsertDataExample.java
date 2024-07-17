package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //ket nối CSDL
        Connection connection = null;
        Statement statement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");

        //tạo kết nối đến cơ sở dữ liệu MySQL testdb 
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "12345678";
        connection =  DriverManager.getConnection(url, user, password);

        //truy vấn - INSERT
        String sql = "Insert into Salary_Grade (Grade, High_Salary, Low_Salary) " +
                 "values (2, 20000, 10000) ";
        //statement
        statement = connection.createStatement();
        int rowCount = statement.executeUpdate(sql);
        System.out.println("Row Count affected = " + rowCount);
    }

}
