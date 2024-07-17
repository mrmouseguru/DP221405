package buoi9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
                //kết nối đến testdb
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        Class.forName("com.mysql.cj.jdbc.Driver");

        //tạo kết nối đến cơ sở dữ liệu MySQL testdb 
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "12345678";
        connection =  DriverManager.getConnection(url, user, password);
        //truy vấn
        String sql = "Select Emp_Id, Emp_No, Emp_Name from Employee";
        //Statement
        statement = connection.createStatement();
        //chay cau sql
        result =  statement.executeQuery(sql);

        //in ra kết quả danh sách các nhân viên
        while (result.next()) {
            int empId = result.getInt(1);
            String empNo = result.getString(2);
            String empName = result.getString("Emp_Name");
            System.out.println("--------------------");
            System.out.println("EmpId:" + empId);
            System.out.println("EmpNo:" + empNo);
            System.out.println("EmpName:" + empName);
        }

        connection.close();
    }



}
