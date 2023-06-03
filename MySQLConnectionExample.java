
import java.sql.*;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3333/cbit";
        String username = "root";
        String password = "meghana3";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();
            /*String sql="update meghana set name='RITHIKA' where id=37";
            statement.executeUpdate(sql);
            sql="delete from meghana where id=36";
            statement.executeUpdate(sql);
            String sql="create table if not exists cse(id int primary key,name varchar(20),gpa double(5,3))";
            statement.executeUpdate(sql);*/
            String sql=" create table if not exists students(id int AUTO_INCREMENT NOT NULL PRIMARY KEY,name VARCHAR(20),gpa DECIMAL(5,2))";
            statement.executeUpdate(sql);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
            while (resultSet.next()) {
                // Process the data here
               
                String id=resultSet.getString("id");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}