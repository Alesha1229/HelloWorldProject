package classwork.c20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQlExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root")) {
            connection.prepareStatement("\n" +
                            "insert into DEVELOPERS(NAME, WORK_POSITION, AGE) " + "value ('Alesha','AHAHAHHA','23'),('Pavlu4io','OHOHOHOOHH',30);")
                    .execute(); // добавить кентоу в БД


            ResultSet resultSet = connection.prepareStatement("select * from DEVELOPERS")
                    .executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("ID") + " " + resultSet.getString("NAME") + " " + resultSet.getInt("AGE"));
            }
            connection.commit();
            connection.rollback(); // убрать всё что не подвергнулось через connection.commit
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}