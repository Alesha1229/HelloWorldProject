package homework.h20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MainH20 {
    public static void getStudents(List<String> students) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root")) {



            ResultSet resultSet = connection.prepareStatement("select * from STUDENTS")
                    .executeQuery();
            while (resultSet.next()) {
                students.add(resultSet.getString("NAME"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(students);


    }
}
