package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Model {

    String firstName = "";
    String lastName = "";
    String phoneNumber = "";

    public void database() {

        try {

            // 1.) Get a connection to the database
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza?useSSL=false", "root", "Baseball02!!");

            // 2.) Create a statement
            Statement myStatement = myConnection.createStatement();

            // System.out.println("Enter SQL Query: ");
            // String query = scan.nextLine();

            String statement = "INSERT INTO pizza.customer (phone_number, first_name, last_name) VALUES ('" + phoneNumber + "', '" + firstName + "', '" + lastName +"');";
            myStatement.executeUpdate(statement);

            // 3.) Execute SQL query
            ResultSet resultSet = myStatement.executeQuery("select * from customer");

            // 4.) Process the result set
            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name") + ", " + resultSet.getString("last_name"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
