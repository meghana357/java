import java.sql.*;
import  java.util.Scanner;

public class CRUD{


    public static void main(String[] args) {
        String command, name;
        int id,gpa;
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3333/cbit";
        String username = "root";
        String password = "meghana3";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            System.out.println("choose a command:ADD,UPDATE,DELETE");
            command = sc.nextLine();

        switch (command) {
            case "ADD":
                System.out.println("Enter id,name gpa");
                id = sc.nextInt();
                gpa = sc.nextInt();
                sc.nextLine();
                name = sc.nextLine();
                String sql = String.format("insert into students values (%d,'%s',%d);",id,name,gpa);
                statement.executeUpdate(sql);
                break;
            case "UPDATE":
                String sql2="update students set name='Rithika' where id=50";
                statement.executeUpdate(sql2);
                break;
            case "DELETE":
                String sql3="delete from students where id=50";
                statement.executeUpdate(sql3);
                break;
            default:
                System.out.println("invalid input");
                break;
        }
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
            while (resultSet.next()) {
                // Process the data here
                String name1 = resultSet.getString("name");
                String gpa1 = resultSet.getString("gpa");
                String id1 = resultSet.getString("id");
//                String department1 = resultSet.getString("id");
                System.out.println(id1 + " " + name1 + " " + gpa1);
            }

            resultSet.close();
        statement.close();
        connection.close();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}
}
