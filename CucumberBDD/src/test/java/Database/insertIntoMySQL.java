package Database;

import java.sql.*;

public class insertIntoMySQL {
    public static void main(String[] args) {
        insertToDB();
    }
    public static void insertToDB(){
        try {
            String myURL = "jdbc:mysql://db4free.net:3306/techleadacademy";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myURL,"techlead","students");
            String postQuery = "INSERT INTO students (name,lastname,team,student_id)VALUE(?,?,?,?)";
            //prepare is SQL interface, allows us to post into DataBase.
            PreparedStatement preparedStatement = conn.prepareStatement(postQuery);
            preparedStatement.setString(1,"Selvin");
            preparedStatement.setString(2,"Melvin");
            preparedStatement.setString(3,"ninja turtles");
            preparedStatement.setInt(4,2001);

            preparedStatement.execute();
            conn.close();;

        } catch (Exception e) {
            System.out.println("Tam tara tam!!!");
            System.out.println(e.getMessage());
        }
    }

}
